package org.service;

import org.domain.*;
import org.repository.IRepository;

public class Service {
    private IRepository repo;

    public Service(IRepository repo) {
        this.repo = repo;
    }

    public void add(String type, Integer id, String brand, String color){
        repo.add(switch (type){
            case Motorcycle.type -> new Motorcycle(id, brand, color);
            case Bicycle.type -> new Bicycle(id, brand, color);
            case Car.type -> new Car(id, brand, color);
            default -> throw new IllegalArgumentException("Invalid type " + type);
        });
    }

    public void remove(Integer id){
        repo.remove(id);
    }

    public IVehicle[] getAll(){
        return repo.getAll();
    }

    public IVehicle[] getAllRed(){
        IVehicle[] vehicles = repo.getAll();
        int reds = 0;
        for(IVehicle vehicle : vehicles){
            if(vehicle.isRed()){
                reds++;
            }
        }
        IVehicle[] vehiclesRed = new IVehicle[reds];
        int i = 0;
        for(IVehicle vehicle : vehicles){
            if(vehicle.isRed()){
                vehiclesRed[i++] = vehicle;
            }
        }

        return vehiclesRed;
    }
}

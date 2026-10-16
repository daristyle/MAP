package org.repository;

import org.domain.IVehicle;

public class MemoryRepository implements IRepository {
    private IVehicle[] vehicles;
    private Integer noOfVehicles;

    public MemoryRepository() {
        this.vehicles = new IVehicle[50];
        noOfVehicles = 0;
    }

    public void add(IVehicle vehicle) {
        for(int i = 0; i < noOfVehicles; i++) {
            if(vehicles[i].getId().equals(vehicle.getId())) {
                throw new RuntimeException("Vehicle already exists");
            }
        }
        if(noOfVehicles >= vehicles.length) {
            int newCapacity = vehicles.length * 2;
            IVehicle[] newVehicles = new IVehicle[newCapacity];
            System.arraycopy(vehicles, 0, newVehicles, 0, vehicles.length);
            vehicles = newVehicles;
        }
        vehicles[noOfVehicles++] = vehicle;
    }

    public void remove(Integer id) {
        for(int i = 0; i < noOfVehicles; i++){
            if(vehicles[i].getId().equals(id)) {
                vehicles[i] = vehicles[--noOfVehicles];
                return;
            }
        }

        throw new RuntimeException("There is no vehicle with id " + id);
    }

    public IVehicle[] getAll() {
        IVehicle[] all = new IVehicle[noOfVehicles];
        for(int i = 0; i < noOfVehicles; i++){
            all[i] = vehicles[i];
        }
        return all;
    }
}

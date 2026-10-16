package org.domain;

public class Car implements IVehicle{
    public static final String type = "Car";

    private Integer id;
    private String brand;
    private String color;

    public Car(Integer id, String brand, String color){
        this.id = id;
        this.brand = brand.trim().toLowerCase();
        this.color = color.trim().toLowerCase();
    }

    public Integer getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }

    public void setBrand(String brand){
        this.brand = brand.trim().toLowerCase();
    }
    public void setColor(String color){
        this.color = color.trim().toLowerCase();
    }
    public boolean isRed(){
        return "red".equals(getColor());
    }

    public String toString(){
        return "Car [id = " + id + ", brand = " + brand + ", color = " + color + "]";
    }
}

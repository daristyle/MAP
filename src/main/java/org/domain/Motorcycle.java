package org.domain;

public class Motorcycle implements IVehicle{
    public static final String type = "Motorcycle";

    private Integer id;
    private String brand;
    private String color;

    public Motorcycle(Integer id, String brand, String color){
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
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isRed(){
        return "Red".equals(getColor());
    }

    public String toString(){
        return "Motorcycle [id = " + id + ", brand = " + brand + ", color = " + color + "]";
    }
}

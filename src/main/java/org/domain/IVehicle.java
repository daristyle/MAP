package org.domain;

public interface IVehicle{
    static final String type = "Vehicle";

    Integer getId();
    String getBrand();
    String getColor();

    void setBrand(String brand);
    void setColor(String color);
    boolean isRed();

    String toString();
}

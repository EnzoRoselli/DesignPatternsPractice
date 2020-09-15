package models.entities;

import java.util.Observable;

public class Car extends Observable {

    private String color;
    private String brand;
    private float price;

    public Car(String color, String brand, float price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public void priceChanged(){
        setChanged();
        notifyObservers();
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        priceChanged();
    }
}

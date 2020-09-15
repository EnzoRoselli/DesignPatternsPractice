package models.entities;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {
    Observable car;
    private String name;
    private String surname;

    public Client(Observable car, String name, String surname) {
        this.car = car;
        this.name = name;
        this.surname = surname;

        car.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof Car){
            Car car = (Car) o;

            priceNotification(car.getBrand(), car.getPrice());
        }
    }

    public void priceNotification(String brand, float price){
        System.out.println("Notificacion al cliente " + name + " " + surname +" que el precio " +
                "del " + brand + " ha cambiado a $" + price);
    }
}

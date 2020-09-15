import models.entities.Car;
import models.entities.Client;

public class main {

    public static void main(String[] args) {

        Car car = new Car("red", "Camaro RS", 30000);
        Client client1 = new Client(car, "Marcelo", "Gallardo");
        Client client2 = new Client(car, "Enzo", "Franchescoli");

        car.setPrice(35000);
    }
}

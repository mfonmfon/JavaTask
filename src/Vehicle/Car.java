package Vehicle;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Car extends Vehicle{

    private String engine;
    public Car(String color, String carName, String engine) {
        super(color, carName);
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("fasterrrr");
    }

    @Override
    public void fly() {
        super.fly();
    }
}

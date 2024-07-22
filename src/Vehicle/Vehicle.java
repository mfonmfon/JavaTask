package Vehicle;

import java.util.LinkedList;
import java.util.ListIterator;

public class Vehicle {

    private String color;
    private String carName;

    public Vehicle(String color, String carName){
        this.carName = carName;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public String getCarName(){
        return carName;
    }
    public void drive(){
        System.out.println("fast!!");
    }
    public void fly(){
        LinkedList<Vehicle> susa = new LinkedList<Vehicle>();
        susa.add(new Vehicle("Blue", "Toyota"));
        susa.add(new Vehicle("Purple", "Range Rover"));
        susa.add(new Car("Black", "Gwangon", "123"));
        ListIterator<Vehicle> vehicleListIterator = susa.listIterator();
        while(vehicleListIterator.hasPrevious()){
            System.out.println(vehicleListIterator.previous());
        }
    }
}

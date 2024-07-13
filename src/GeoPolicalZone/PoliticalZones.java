package GeoPolicalZone;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PoliticalZones {

    private String states;

    public PoliticalZones(String states){
        this.states = states;
    }
    public void userStates(){
        GeoPoliticalZone[] zones = GeoPoliticalZone.values();
        String userInput = prompt("Enter your state of origin: ");
        //boolean stateFound = false;

        //iterates through the zones to check if the userInput matches any states in the zone
        for(GeoPoliticalZone zone : zones) {
            if(Objects.equals(zone, userInput)){
                print("Your state of origin is: "+ Arrays.toString(zones));
            }
        }
    }
    public  String prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
    public void print(String message){
        System.out.println(message);
    }
}

package Vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void testThatVehicleExist(){
        Vehicle vexa = new Vehicle("blue", "range rover");
        vexa.drive();
        vexa.fly();
    }

}
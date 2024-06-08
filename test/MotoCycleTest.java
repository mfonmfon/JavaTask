import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotoCycleTest {

     //MotoCycle myBike = new MotoCycle();

    @Test
    void testThatBikeIsOn(){
        MotoCycle myBike = new MotoCycle();
        Assertions.assertTrue( myBike.isBikeIsOn());
    }
    @Test
    void testThatBikeIsOff(){
        MotoCycle myBike = new MotoCycle();
        Assertions.assertFalse(myBike.isBikeOff());
    }
    @Test
    void testThatBikeCanChangeGearByIncrementingOne(){
        MotoCycle myBike = new MotoCycle();
        myBike.isBikeIsOn();
        Assertions.assertEquals(36, myBike.acceleration(24));
    }
    @Test
    void testThatBikeCanChangeGearByIncrementingByTwo(){
        MotoCycle myBike = new MotoCycle();
        myBike.isBikeIsOn();
        Assertions.assertEquals(26, myBike.acceleration(24));
    }
    @Test
    void testThatBikeCanChangeGearByIncrementingByThree(){
        MotoCycle myBike = new MotoCycle();
        myBike.isBikeIsOn();
        Assertions.assertEquals(38, myBike.acceleration(35));
    }
    @Test
    void testThatBikeCanChangeGearWhenIncrementedByFour(){
        MotoCycle myBike = new MotoCycle();
        myBike.isBikeIsOn();
        Assertions.assertEquals(49, myBike.acceleration(45));
    }
    @Test
    void testThatBikeCanChangeGearWhenDecrementByOne(){
        MotoCycle myBike = new MotoCycle();
        myBike.isBikeIsOn();
        Assertions.assertEquals(14, myBike.acceleration(16));
    }
    @Test
    void testThatBikeCanChangeGearWhenDcrementedByTwo(){
        MotoCycle myBike = new MotoCycle();
        myBike.isBikeIsOn();
        Assertions.assertEquals(15,myBike.acceleration(17));
    }
    @Test
    void testThatBikeCanChangeGearWhenDecrementedByThree(){
        MotoCycle myBike = new MotoCycle();
        myBike.isBikeIsOn();
        Assertions.assertEquals(27, myBike.decelerate(23));
    }
    @Test
    void testThatBikeCanChangeGearWhenDrementedByFour(){
        MotoCycle myBike = new MotoCycle();
        myBike.isBikeIsOn();
        Assertions.assertEquals(40, myBike.decelerate(44));
    }
}
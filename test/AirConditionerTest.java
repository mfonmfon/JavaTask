import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    void isOffAirConditioner() {
            AirConditioner myAirConditioner = new AirConditioner();
            assertFalse(myAirConditioner.isAirConditionerOn());
        }
    @Test
    public void checkIfAirConditionerIsOn(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.onAirConditioner();
        assertTrue(myAirConditioner.isAirConditionerOn());
    }
    @Test
    public void checkIfTheAirConditionerIsOff(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.offAirConditioner();
        assertFalse(myAirConditioner.isAirConditionerOn());
    }
    @Test
    void checkIfAirConditionerIsDecrease(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.onAirConditioner();
        myAirConditioner.decreasedAirConditioner();
        assertEquals(14, myAirConditioner.decreasedAirConditioner());
    }
    @Test
    void checkIfAirConditionIsIncrease(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.increasedAirConditioner();
        assertEquals(16, myAirConditioner.increasedAirConditioner());
    }

    @Test
    void  testThatWhenAirConditionerIsOnTemperature_stillOn(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.setTemperature();
        Assertions.assertEquals(16, myAirConditioner.setTemperature());
    }

    @Test
    void testThatWhenAirConditionerIsOn_temperatureIsStillOn(){
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.checkTemPerature();
    }

    }

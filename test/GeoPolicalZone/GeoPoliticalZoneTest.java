package GeoPolicalZone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZoneTest {

    @Test
    public void geoPoliticalZonesTest() {
        GeoPoliticalZone[] zones = GeoPoliticalZone.values();
        GeoPoliticalZone southeast = GeoPoliticalZone.SOUTHEAST;
        //assertSame(southeast.getStates(new String[]{Arrays.toString(zones)}));
    }
}
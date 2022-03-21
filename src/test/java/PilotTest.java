import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Dumbo", Rank.Captain, 123456);
    }

    @Test
    public void pilotHasName(){
        assertEquals("Dumbo", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals("Captain", pilot.getRankFromEnum());
    }

    @Test
    public void pilotHasLicenceNumber(){
        assertEquals(123456, pilot.getLicenceNumber());
    }


    @Test
    public void flyPlane() {
        assertEquals("Look Ma, no hands!", pilot.flyPlane());
    }
}

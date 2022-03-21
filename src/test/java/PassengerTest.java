import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Bill Hicks", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Bill Hicks", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(1, passenger.getBags());
    }



}

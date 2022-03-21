import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Phillip Schofield", Rank.FlightAttendant);
    }

    @Test
    public void hasName(){
        assertEquals("Phillip Schofield", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Flight Attendant", cabinCrewMember.getRankFromEnum());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("The captain has switched on the seatbelt sign.", cabinCrewMember.relayMessageToPassengers());
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        pilot = new Pilot("Dumbo", Rank.Captain, 123456);        plane = new Plane(PlaneType.BOEING747);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, plane, "FR123","EDI", "GLA", "12:30");
    }

    @Test
    public void flightHasACaptain(){
        assertEquals(pilot, flight.getPilot());
    }

//    @Test
//    public void flightHas2MoreCrewMembers(){
//        assertEquals()
//    }

    @Test
    public void flightReturnsEmptySeatNumber(){
        passenger = new Passenger("Bill Hicks", 1);
        Flight.bookPassenger(passenger);
        Flight.bookPassenger(passenger);
        assertEquals(98, Flight.getEmptySeatCount());
    }

//    @Test
//    public void flightReturnsEmptySeatNumber(){
//        passenger = new Passenger("Bill Hicks", 1);
//        Flight.bookPassenger(passenger);
//        Flight.bookPassenger(passenger);
//        assertEquals(98, Flight.getEmptySeatCount());
//    }
//
//    @Test
//    public void flightReturnsEmptySeatNumber(){
//        passenger = new Passenger("Bill Hicks", 1);
//        Flight.bookPassenger(passenger);
//        Flight.bookPassenger(passenger);
//        assertEquals(98, Flight.getEmptySeatCount());
//    }





}

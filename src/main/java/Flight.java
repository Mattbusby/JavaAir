import java.util.ArrayList;

public class Flight {

    Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private static ArrayList<Passenger> passengerList;
    static Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengerList = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

//    public void setPassengerlist(ArrayList<Passenger> passengerlist) {
//        this.passengerlist = passengerlist;
//    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public static void bookPassenger(Passenger passenger) {
        if (passengerList.size() < plane.planeType.getCapacity()) {
            passengerList.add(passenger);
        }
    }

    public static int getEmptySeatCount(){
        return (plane.planeType.getCapacity()- passengerList.size());
    }

    public int getBagWeight(){
        return plane.planeType.individualPassengerBagWeight();
    }

    public int baggageWeightAlreadyBookedByPassengers(){
        return (passengerList.size()*getBagWeight());
    }

    public int getRemainingWeightForBags(){
        return (plane.planeType.totalBagWeightForFlight()-(passengerList.size()*plane.planeType.individualPassengerBagWeight()));
    }


}

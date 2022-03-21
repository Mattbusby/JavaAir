public enum Rank {

    Captain("Captain"),
    FirstOfficer("First Officer"),
    Purser("Purser"),
    FlightAttendant("Flight Attendant");

    private final String rank;

    Rank(String rank){
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}

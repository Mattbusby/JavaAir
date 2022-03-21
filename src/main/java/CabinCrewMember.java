public class CabinCrewMember {

    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank){;
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRankFromEnum() {
        return this.rank.getRank();
    }

    public String relayMessageToPassengers(){
        return "The captain has switched on the seatbelt sign.";
    }
}

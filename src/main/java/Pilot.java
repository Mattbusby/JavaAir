public class Pilot {

    private String name;
    private Rank rank;
    private int licenceNumber;

    public Pilot(String name, Rank rank, int licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRankFromEnum() {
        return this.rank.getRank();
    }

//    public void setRank(Rank rank) {
//        this.rank = rank;
//    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String flyPlane(){
        return "Look Ma, no hands!";
    }
}

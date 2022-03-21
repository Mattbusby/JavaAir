public enum PlaneType {

    BOEING747(100, 1000),
    BOEING636(50, 800),
    BOEING525(25, 500);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeightLimit() {
        return totalWeight;
    }

    public int totalBagWeightForFlight(){
        return (totalWeight/2);
    }

    public int individualPassengerBagWeight(){
        return totalBagWeightForFlight()/capacity;
    }
}

public class House {
    private String addressStreet;
    private int houseNumber;
    private int floor;
    private int entryway;
    private int apartment;

    public House(String addressStreet, int houseNumber) {
        this.addressStreet = addressStreet;
        this.houseNumber = houseNumber;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getEntryway() {
        return entryway;
    }

    public void setEntryway(int entryway) {
        this.entryway = entryway;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}

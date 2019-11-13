package pl.itacademy.lesson11;

public class Address {
    private int index;
    private String city;
    private String street;
    private int buildingNumber;

    public Address(int index, String city, String street, int buildingNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public int getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }
}

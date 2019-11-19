package pl.itacademy.lesson12;

public class Address implements Cloneable {
    private String city;
    private String street;
    private int building;

    public Address(String city, String street, int building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    //DO NOT repeat it at home:

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Building number [" + building + "] on " + street + " street in " + city + " has been destroyed!");
    }
}

package CH8Classes;

public class Address {
    private int houseNum;
    private String aptNum;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String country;

    public Address(int houseNum, String street, String city, String state,
                   int zipCode, String country) {
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;

    }

    public Address(int houseNum, String street, String city, String state,
                   int zipCode, String country, String aptNum) {
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.aptNum = aptNum;

    }

    public int getHouseNum() {
        return houseNum;
    }

    public String getAptNum() {
        return aptNum;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }
}




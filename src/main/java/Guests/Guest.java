package Guests;

public abstract class Guest {
    protected String name;
    protected String phoneNumber;
    protected String address;

    public Guest(String name, String phone, String address) {
        this.name = name;
        this.phoneNumber = phone;
        this.address = address;
    }

    public String getName() {return name;}
    public String getPhoneNumber() {return phoneNumber;}
    public String getAddress() {return address;}

    public abstract double calculateDiscount(double billAmount);
}

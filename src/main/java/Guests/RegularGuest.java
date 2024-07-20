package Guests;

public class RegularGuest extends Guest {
    public RegularGuest(String name , String phoneNumber , String address) {
        super(name, phoneNumber, address);
    }

    @Override
    public double calculateDiscount(double billAmount) {
        return 0;
    }
}

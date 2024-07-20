package Guests;

public class PremiumGuest extends Guest {
    public PremiumGuest(String name , String phoneNumber , String address) {
        super(name, phoneNumber, address);
    }

    @Override
    public double calculateDiscount(double billAmount){
        return billAmount * 0.2;
    }
}

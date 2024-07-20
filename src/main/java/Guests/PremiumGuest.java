package Guests;

public class PremiumGuest extends Guest {
    public PremiumGuest(String name , String phoneNumber , String address) {
        super(name, phoneNumber, address);
    }

    @Override
    public double calculateDiscount(double billAmount){
        if (billAmount > 0){
        return billAmount * 0.2;
        } else{
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }
}

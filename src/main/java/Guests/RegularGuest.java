package Guests;

public class RegularGuest extends Guest {
    public RegularGuest(String name , String phoneNumber , String address) {
        super(name, phoneNumber, address);
    }

    @Override
    public double calculateDiscount(double billAmount) {
        if (billAmount > 0){
        return 0;
        }else {
            throw new IllegalArgumentException("Amount can't be negative");
        }
    }
}

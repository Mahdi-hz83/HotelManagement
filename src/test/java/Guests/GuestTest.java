package Guests;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {
    private Guest regularGuest;
    private Guest premiumGuest;

    @Before
    public void setUp() {
        this.regularGuest = new RegularGuest("John Stam" , "0914-112-1210","Tabriz");
        this.premiumGuest = new PremiumGuest("Jane Smith" , "0936-360-8998","Urmia");
    }

    @Test
    public void testRegularGuestDiscount() {
        assertEquals(0.0, regularGuest.calculateDiscount(100.0));
    }

    @Test
    public void testPremiumGuestDiscount() {
        assertEquals(20.0, premiumGuest.calculateDiscount(100.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegularGuestDiscountWithNegativeBillAmount() {
        regularGuest.calculateDiscount(-100.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPremiumGuestDiscountWithNegativeBillAmount() {
        premiumGuest.calculateDiscount(-100.0);
    }

}
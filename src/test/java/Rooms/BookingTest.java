package Rooms;

import Guests.Guest;
import Guests.RegularGuest;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BookingTest {
    private Room room;
    private Booking booking;
    private Guest guest;

    @Before
    public void setUp() {
        this.room = new Room(101,"Single",100.0);
        this.guest = new RegularGuest("John Stam" , "555-444-3", "123 Main St");
        this.booking = new Booking(room, guest , LocalDate.now() , LocalDate.now().plusDays(3));
    }

    @Test
    public void testCalculateBill(){
        assertEquals(300.0,booking.calculateBill());
    }

    @Test
    public void testCancelBooking(){
        booking.cancelBooking();
        assertTrue(room.isAvailable());
    }
}
package Management;

import Guests.Guest;
import Guests.PremiumGuest;
import Guests.RegularGuest;
import Rooms.Booking;
import Rooms.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelManagement {
    private List<Room> rooms;
    private List<Booking> bookings;

    public HotelManagement() {
        this.rooms = new ArrayList<Room>();
        this.bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }
    private Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
    public void bookRoom(int roomNumber , Guest guest , LocalDate checkInDate , LocalDate checkOutDate) {
        Room room = findRoom(roomNumber);
        if (room != null && room.isAvailable()) {
            Booking booking = new Booking(room , guest , checkInDate , checkOutDate);
            bookings.add(booking);
            System.out.println("Room Booked: " + room.getRoomNumber());
        }else{
            throw new IllegalArgumentException("Room is not available");
        }
    }

    private Booking findBooking(int roomNumber, Guest guest) {
        for (Booking booking : bookings) {
            if (booking.getRoom().getRoomNumber() == roomNumber && booking.getGuest().equals(guest)) {
                return booking;
            }
        }
        return null;
    }

    public void cancelBooking(int roomNumber, Guest guest) {
        Booking booking = findBooking(roomNumber, guest);
        if (booking != null) {
            booking.cancelBooking();
            bookings.remove(booking);
            System.out.println("Booking cancelled successfully!");
        } else {
            throw new IllegalArgumentException("Booking not found.");
        }
    }

    public void generateBill(int roomNumber, Guest guest) {
        Booking booking = findBooking(roomNumber, guest);
        if (booking != null) {
            double totalBill = booking.calculateBill();
            System.out.println("Total Bill: " + totalBill);
        } else {
            System.out.println("Booking not found.");
        }
    }

    public static void main(String[] args) {
        HotelManagement hotel = new HotelManagement();

        Room room1 = new Room(101, "Single", 100.0);
        Room room2 = new Room(102, "Double", 200.0);

        hotel.addRoom(room1);
        hotel.addRoom(room2);

        Guest guest1 = new RegularGuest("John Doe", "123 Main St", "555-1234");
        Guest guest2 = new PremiumGuest("Jane Smith", "456 Elm St", "555-5678");

        hotel.bookRoom(101, guest1, LocalDate.now(), LocalDate.now().plusDays(3));
        hotel.bookRoom(102, guest2, LocalDate.now(), LocalDate.now().plusDays(2));

        hotel.generateBill(101, guest1);
        hotel.generateBill(102, guest2);

        hotel.cancelBooking(101, guest1);
    }
}


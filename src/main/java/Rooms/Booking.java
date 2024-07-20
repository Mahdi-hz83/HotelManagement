package Rooms;

import Guests.Guest;

import java.time.LocalDate;

public class Booking {
    private final Room room;
    private final Guest guest;
    private final LocalDate checkInDate;
    private final LocalDate checkOutDate;

    public Booking(Room room , Guest guest , LocalDate checkInDate , LocalDate checkOutDate){
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        room.setAvailable(false);
    }

    public Room getRoom() {return room;}
    public Guest getGuest() {return guest;}
    public LocalDate getCheckInDate() {return checkInDate;}
    public LocalDate getCheckOutDate() {return checkOutDate;}

    public double calculateBill(){
        long duration = java.time.temporal.ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        return duration * room.getPrice();
    }

    public void cancelBooking(){
        room.setAvailable(true);
    }


}

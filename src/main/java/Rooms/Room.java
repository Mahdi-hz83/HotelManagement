package Rooms;

public class Room {
    private final int roomNumber;
    private final String type;
    private final double price;
    private boolean isAvailable;

    public Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        if (price > 0){this.price = price;}
        else {throw new IllegalArgumentException("Price must be greater than zero");}
        this.isAvailable = true;
    }

    public int getRoomNumber() {return roomNumber;}
    public String getType() {return type;}
    public double getPrice() {return price;}
    public boolean isAvailable() {return isAvailable;}

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

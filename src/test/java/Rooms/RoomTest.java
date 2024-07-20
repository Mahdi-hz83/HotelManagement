package Rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {
    private Room room;

    @Before
    public void setUp() {
        this.room = new Room(102,"Single",100.0);
    }

    @Test
    public void testRoomCreateCorrectly() {
        assertEquals(102, room.getRoomNumber());
        assertEquals("Single", room.getType());
        assertEquals(100.0, room.getPrice());
        assertTrue(room.isAvailable());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoomCreateWithNegativePrice() {
        room = new Room(102,"Single",-100.0);
    }

    @Test
    public void testRoomUpdateCorrectly() {
        room.setAvailable(false);
        assertFalse(room.isAvailable());
        room.setAvailable(true);
        assertTrue(room.isAvailable());
    }
}
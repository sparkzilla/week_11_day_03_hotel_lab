import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    BedRoom bedRoom1;
    BedRoom bedRoom2;
    BedRoom bedRoom3;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        bedRoom1 = new BedRoom(1, 2);
        bedRoom2 = new BedRoom(2, 4);
        bedRoom3 = new BedRoom(3, 2);

        guest1 = new Guest("John Smith");
        guest2 = new Guest("Jane Smith");
        guest3 = new Guest("Jack Smith");
    }
    @Test
    public void canBookIntoRoom(){
        bedRoom2.addGuestToRoom(guest2);
        assertEquals(1, bedRoom2.getOccupants());
    }

}

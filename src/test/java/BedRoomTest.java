
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BedRoomTest {

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
    public void capacityOfRoom(){
        assertEquals(2, bedRoom1.getCapacity());
    }

    @Test
    public void canAddGuestToRoom(){
        bedRoom1.addGuestToRoom(guest1);
        assertEquals(1, bedRoom1.getOccupants());
    }
    @Test
    public void canAddGuestUpToCapacity() {
        bedRoom1.addGuestToRoom(guest1);
        bedRoom1.addGuestToRoom(guest2);
        bedRoom1.addGuestToRoom(guest3);
        assertEquals(2, bedRoom1.getOccupants());
    }

    @Test
    public void isRoomOccupied(){
        assertEquals(false,  bedRoom1.isRoomOccupied());
        }

   @Test
   public void doesRoomHavePeopleInIt(){
       bedRoom1.addGuestToRoom(guest1);
       assertEquals(true,  bedRoom1.isRoomOccupied());
    }

    @Test
    public void canRemoveGuest(){
        bedRoom1.addGuestToRoom(guest1);
        bedRoom1.removeGuestFromRoom(guest1);
        assertEquals(0, bedRoom1.getOccupants());
    }
    @Test
    public void addABooking(){
        bedRoom1.addBooking(guest1, 3);
    }

}
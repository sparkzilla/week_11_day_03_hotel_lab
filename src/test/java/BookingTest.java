import org.junit.Before;
import org.junit.Test;

public class BookingTest {
    BedRoom room1;
    Booking booking1;
    Guest guest1;

    @Before
    public void before() {
        room1 = new BedRoom(1, 2);
        guest1 = new Guest("John Smith");
    }


}

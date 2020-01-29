import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;


    @Before
    public void before(){
        guest1 = new Guest("John Smith");
    }

    @Test
    public void guestHasName(){
        assertEquals("John Smith", guest1.getName());
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

        ConferenceRoom conferenceRoom1;
        ConferenceRoom conferenceRoom2;

        Guest guest1;
        Guest guest2;
        Guest guest3;

        @Before
        public void before() {
            conferenceRoom1 = new ConferenceRoom("Wedding Room", 2);
            conferenceRoom2 = new ConferenceRoom("Ballroom", 4);

            guest1 = new Guest("John Smith");
            guest2 = new Guest("Jane Smith");
            guest3 = new Guest("Jack Smith");
        }

        @Test
        public void canGuestBeAddedToConferenceRoom(){
            conferenceRoom1.addGuestToRoom(guest1);
            assertEquals(1, conferenceRoom1.getOccupants());
        }
}

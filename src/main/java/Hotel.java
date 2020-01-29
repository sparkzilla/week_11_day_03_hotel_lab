import java.util.ArrayList;

public class Hotel {
    private ArrayList<BedRoom> bedrooms;

    public Hotel() {


        this.bedrooms = new ArrayList<>();
    }
        public void addGuestToRoom (Guest guest, BedRoom room){
        room.addGuestToRoom(guest);
        }



}
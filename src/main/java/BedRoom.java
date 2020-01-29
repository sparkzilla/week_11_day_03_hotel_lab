import java.util.ArrayList;

public class BedRoom {
    private int number;
    private int capacity;
    private ArrayList<Guest> guests;


    public BedRoom(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity(){
       return this.capacity;
    }

    public int getOccupants(){
        return this.guests.size();
    }

    public void addGuestToRoom(Guest guest){
        if (getOccupants() < this.capacity) {
            this.guests.add(guest);
        }
    }


}
import java.util.ArrayList;

public class BedRoom {
    private int number;
    private int capacity;
    private ArrayList<Guest> guests;
    private ArrayList<Booking> bookings;


    public BedRoom(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public int getCapacity(){
       return this.capacity;
    }

    public int getOccupants(){
        return this.guests.size();
    }

    public boolean isRoomOccupied(){
        if(getOccupants() > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean capacityAvailable(){
        if (getOccupants() < this.capacity){
        return true;
        } else {
            return false;
        }
    }

    public void addGuestToRoom(Guest guest){
        if (capacityAvailable()) {
            this.guests.add(guest);
        }
    }

    public void removeGuestFromRoom(Guest guest){
        if(isRoomOccupied()){
            this.guests.remove(guest);
        }

        //This part does not work

    public void addBooking(Guest guest, int length){
            booking.guest = guest;
            this.bookings.add()
        }


    }


}
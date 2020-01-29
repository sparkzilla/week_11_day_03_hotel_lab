import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupants() {
        return this.guests.size();
    }

    public boolean capacityAvailable() {
        if (getOccupants() < this.capacity) {
            return true;
        } else {
            return false;
        }
    }

    public void addGuestToRoom(Guest guest) {
        if (capacityAvailable()) {
            this.guests.add(guest);
        }
    }
}


public class Room {
    String name;
    String type;
    int capacity;
    double rate;
    boolean petFriendly;

    public Room(String name, String type, int capacity, double rate) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;
    }

    public Room(Room room) {
        this.name = room.name;
        this.type = room.type;
        this.capacity = room.capacity;
        this.rate = room.rate;
    }

    @Override
    public String toString() {
        return "Room{" + "name='" + name + '\'' + ", type='" + type + '\'' + ", capacity=" + capacity + ", rate=" + rate + '}';
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}

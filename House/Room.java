public class Room {
    boolean isReserved;


    public Room(boolean value) {
        this.isReserved = value;
    }

    boolean isReserved() {
        if (!this.isReserved) {
            return false;
        } else {
            return true;
        }
    }

    void reserveRoom() {
        if (this.isReserved()) {
            System.out.println("Room is reserved");
        } else {
            System.out.println("Room is not reserved");
        }
    }
}

public class House {
    double side;
    double squ;
    Room room = new Room(false);

    public House(double side) {
        this.side = side;
    }

    void printSide() {
        System.out.print(squ);
    }

    void getSqu() {
        squ = side * side;
        printSide();
    }
    void reserveRoom() {
        room.reserveRoom();
    }
}

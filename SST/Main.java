class Main {
static Shape[] shapes = new Shape[9];
public static void main(String[] args) {
shapes[0] = new Triangle(13,10);
shapes[1] = new Triangle(16,10);
shapes[2] = new Triangle(19,10);
shapes[3] = new Triangle(21,10);

shapes[4] = new Circle(5.0);
shapes[5] = new Circle(8.0);

shapes[6] = new Square(5);
shapes[7] = new Square(12);
shapes[8] = new Square(15);

for(int i=0;i<shapes.length;i++){
  shapes[i].calcSqr();
}
}
}

package week_two.task2;

public class RectangleApp {
    public RectangleApp() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0, 3.0);
        Rectangle r3 = new Rectangle("blue", 7.5, 4.0);
        Rectangle r4 = new Rectangle("red");

        r2.setColour("green");
        r4.setLength(10.0);
        r4.setWidth(2.5);

        printDetails("Rectangle 1 (defaults constructor)", r1);
        printDetails("Rectangle 2 (length/width constructor)", r2);
        printDetails("Rectangle 3 (all-args constructor)", r3);
        printDetails("Rectangle 4 (colour constructor)", r4);
    }

    private void printDetails(String label, Rectangle r) {
        System.out.println("\n--- " + label + " ---");
        System.out.println("Colour    : " + r.getColour());
        System.out.println("Length    : " + r.getLength());
        System.out.println("Width     : " + r.getWidth());
        System.out.println("Area      : " + r.calculateArea());
        System.out.println("Perimeter : " + r.calculatePerimeter());
    }
}

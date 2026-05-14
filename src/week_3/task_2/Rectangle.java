package week_3.task_2;

public class Rectangle {
    private String colour;
    private double length;
    private double width;

    public Rectangle(){
        this.colour  = "yellow";
        this.length = 1.0;
        this.width=1.0;
    }

    public Rectangle(String colour) {
        this.colour = colour;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String colour, double length, double width) {
        this.colour = colour;
        this.length = length;
        this.width = width;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * length * width;
    }
}

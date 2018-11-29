package Question3;

public class Rectangle {
    //private static final String name = "Rectangle";
    private double area;
    private double length;
    private double width;
    private final double topleft_of_x;
    private final int topleft_of_y;
    
    //constructor

    Rectangle(double tl1, int tl2, int l, int w) {
        this.topleft_of_x = tl1;
        this.topleft_of_y = tl2;
        length = l;
        width = w;
    }

    
    //method
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    
    public String getName() {
        return "Rectangle";
    }

    public double getArea() {
        area = length * width;
        return area;
    }
    
    public String toString(){
        return "TopLeft = [" + topleft_of_x + ", " + topleft_of_y + "]; Length = " + length + "; Width = " + width;
    }
}

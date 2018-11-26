
package Question3;


public class Circle {
    
    //fieds
    //private static final String name = "Circle";
    private int center;
    private double radius;
    private double area;
    private final int center_of_x;
    private final int center_of_y;

    Circle(int c1, int c2, double r) {
        radius = r;
        this.center_of_x = c1;
        this.center_of_y = c2;
    }
    
    //method 
    public double getCenter(){
        return center;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public String getName() {
        return "Circle";
    }

    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    public String toString(){
        return "Center = [" + center_of_x + ", " + center_of_y + "]; Radius = " + radius;
    }

}

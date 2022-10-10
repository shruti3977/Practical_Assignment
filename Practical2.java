//This Program is prepared by 21CE118 Shruti Sangani
/*Aim :: In an n-sided regular polygon, all sides have the same length and all angles have the
same degree (i.e., the polygon is both equilateral and equiangular). Design a class
named RegularPolygon that contains:
 A private int data field named n that defines the number of sides in the
polygon with default value 3.
 A private double data field named side that stores the length of the side with
default value 1.
 A private double data field named x that defines the x-coordinate of the
polygon’s center with default value 0.
 A private double data field named y that defines the y-coordinate of the
polygon’s center with default value 0.
 A no-arg constructor that creates a regular polygon with default values.
 A constructor that creates a regular polygon with the specified number of sides
and length of side, centered at (0, 0).
 A constructor that creates a regular polygon with the specified number of
sides, length of side, and x- and y-coordinates.
 The accessor and mutator methods for all data fields.
 The method getPerimeter() that returns the perimeter of the polygon.
 The method getArea() that returns the area of the polygon.
 */
class RegularPolygon {
    int n = 3;//number of sides
    double side = 1.00;//length of side
    double x = 0;//x-coordinate of the polygon’s center
    double y = 0;//y-coordinate of the polygon’s center

    RegularPolygon() {
        System.out.println("The Regular polygon Is : ");
        System.out.println("The Polygon centered at (" + x + "," + y + ")");
        System.out.println("The default Perimeter of Polygon is : " + getPerimeter());
        System.out.println("The default Area of Polygon is : " + getArea());
        System.out.println();
        System.out.println("For Find New one : ");
        System.out.println();
    }
    // Accessor and Mutrator
    int getNos() {
        System.out.println("The Number Of side is : " + n);
        return n;
    }
    void setNos(int n) {
        this.n = n;
    }
    void getLos() {
        System.out.println("The Length Of side is : " + side);
    }
    void setLos(Double side) {
        this.side = side;
    }
    public void getX() {
        System.out.println("The value of x is : " + x);
    }
    public void setX(Double x) {
        this.x = x;
    }
    public void gety() {
        System.out.println("The value of y is : " + y);
    }
    public void sety(Double y) {
        this.y = y;
    }

    //for perimeter
    double getPerimeter() {
        double perimeter = n * side;
        return perimeter;
    }
    //for Area
    double getArea() {
        double angle = Math.toRadians(180 / n);
        angle = Math.tan(angle);
        double area = ((side * side * n) / (4 * angle));
        return area;
    }
}
public class Practical2 {
    public static void main(String[] args) {
        RegularPolygon r = new RegularPolygon();
        r.setNos(5);
        r.getNos();
        r.setLos(12.00);
        r.getLos();
        r.setX(3.00);
        r.getX();
        r.sety(7.00);
        r.gety();
        System.out.println("The Perimeter of polygon is : " + r.getPerimeter());
        System.out.println("The Area of polygon is : " + r.getArea());
    }
}

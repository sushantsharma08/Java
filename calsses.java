import java.util.Scanner;

class Shape{
    double a,b;
    Scanner obj = new Scanner(System.in);

    void get_data(){
    System.out.println("Enter the values of a and b : ");
    a = obj.nextDouble();
    b = obj.nextDouble();
   }
}

class Triangle extends Shape{
    void display_area(){
        double d = 0.5*a*b;
        System.out.println("area of triangle with given perimeters : " + d + " units");
    }
}

class Rectangle extends Shape{
    void display_area(){
        double d = a*b;
        System.out.println("Area of a rectangle with given parameters is : " + d + " units.");
    }
}

public class calsses {
    public static void main(String[] args) {
        Triangle T = new Triangle();
        T.get_data();
        T.display_area();

        Rectangle R = new Rectangle();
        // R.get_data();
        R.display_area();
    }
}

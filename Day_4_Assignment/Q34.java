import java.util.*;
class Circle{

    int radius;
    double area;

    void init(){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Radius:: ");
        int radius = sc.nextInt();
        this.radius=radius;
    }

    void calculateArea(){

        this.area=3.14 * this.radius;
    }

    void display(){

        System.out.println("Radius:: "+ this.radius);
        System.out.printf("%.3f ",this.area);

    }


}
public class Q34 {
    
    public static void main(String[] args){

        Circle c = new Circle();

        c.init();
        c.calculateArea();
        c.display();

    }
}

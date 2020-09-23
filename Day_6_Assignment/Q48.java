//import java.util.*;

abstract class Processor{
    double data;

    void showData(){
        System.out.println(data);
    }

    abstract void process();
}
class Factoria extends Processor{

    void process(){
        int fact = 1;
        int no=5;
        for(int i=1;i<no;i++){
            fact *= i; 
        }
        data = fact;
    }
}

class Circle extends Processor{

    void process(){
        int r = 1;
       
       double a = 3.14 * r *r;

       data = a;
    }
}

public class Q48{
    public static void main(String[] args){
        Processor p1 = new Factoria();
        p1.process();
        p1.showData();
        Processor p2 = new Circle();
        p2.process();
        p2.showData();
    }
    

}
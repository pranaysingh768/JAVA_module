//package JAVA_module.Day_4_Assignment;
class Demo1{

    int num;

    Demo1(){
        this(10);
    }
    Demo1(int num){

        this.num = num;
    }

    void show(){
        System.out.println(num);
    }
}
public class Q41 {
    
   public static void main(String[] args) {
       
    Demo1 d = new Demo1(); 

    d.show();
   }
}



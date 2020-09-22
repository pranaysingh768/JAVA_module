//package JAVA_module.Day_5_Assignment;
class Demo{
    Demo(){
        this(10);
        System.out.println("Demo no para");
    }
    Demo(int i){
        System.out.println(i+" Demo no para");
    }
}

class NewDemo extends Demo{
    NewDemo(){
        this(10);
        System.out.println("NewDemo no para");
    }
    NewDemo(int i){
        super(i);
        System.out.println("NewDemo para");
    }
}
public class Q47 {
    public static void main(String[] args){
        NewDemo n = new  NewDemo();
        System.out.println("Main method");
    }
}

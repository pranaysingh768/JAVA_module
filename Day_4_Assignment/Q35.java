
class MathOperation{

    static int add(int a,int b){
        return a+b;
    }

    static int minus(int a,int b){
        return a-b;
    }

    static int multiply(int a,int b){
        return a*b;
    }

    static double power(int a,int b){
        return Math.pow(a, b);
    }
}
public class Q35 {
    
    public static void main(String[] args){

        System.out.println("Addition:: "+ MathOperation.add(10,20));
        System.out.println("Minus:: "+ MathOperation.minus(10,20));
        System.out.println("Multiply:: "+ MathOperation.multiply(10,20));
        System.out.println("Power:: "+ MathOperation.power(2,3));
    }
}

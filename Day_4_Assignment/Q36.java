//package JAVA_module.Day_4_Assignment;


public class Q36 {

    void multiply(int a,int b){

        System.out.println("Two int:: "+a*b);
        
    }
    void multiply(float a,float b,float c){
        System.out.println("Two int:: "+a*b*c);
    }
    void multiply(int arr[]){

        int a=1;
        for(int i=0;i<arr.length;i++){
            a=a*arr[i];
        }
        System.out.println("Two int:: "+a);
    }
    void multiply(double d,int i){
        System.out.println("Two int:: "+d*i);
    }
    public static void main(String[] args){

        Q36 a =new Q36();
        a.multiply(2,3);
        a.multiply(2.2f,3.3f,4.2f);
        //int[] arr = new int[]{2,3,4};
        a.multiply(new int[]{2,3,4});
        a.multiply(2.5,3);
    }
    
}

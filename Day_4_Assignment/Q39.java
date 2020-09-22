//package JAVA_module.Day_4_Assignment;
import java.util.*;
class Product{
    int pid;
    int price;
    int qty;
    static double total;

    Product(int pid,int price,int qty){

        this.pid = pid;
        this.price = price;
        this.qty = qty;
    }

    static double totalAmt(Product arr[]){

        for(int i=0;i<3;i++){
            total += arr[i].price * arr[i].qty; 
        }
        return total;
    }
}
public class Q39 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Product[] arr = new Product[3];
        int max=0;
        for(int i=0;i<3;i++){

            System.out.print("Enter pid:: ");
            int pid = sc.nextInt();

            System.out.print("Enter price:: ");
            int price = sc.nextInt();

            System.out.print("Enter Qty:: ");
            int qty = sc.nextInt();

            if(max < price){
                max=price;
            }
            Product p =new Product(pid,price,qty);
            arr[i]=p;
        }
        for(Product a : arr){
            System.out.println(a.pid+" "+a.price+" "+a.qty);
        }

        System.out.println("Highest price pid:: "+max);
        System.out.println("total amount spent on all products:: "+Product.totalAmt(arr));


    }
}

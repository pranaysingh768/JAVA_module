//package JAVA_module.Day_4_Assignment;
import java.util.*;

class OneBHK{

    double  roomArea;
    double hallArea;
    int price;

    OneBHK(){

    }
    OneBHK(double roomArea,double hallArea,int price){

        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    void show(){

        System.out.println("Room Area:: "+roomArea);
        System.out.println("Hall Area:: "+hallArea);
        System.out.println("Price:: "+price);
        System.out.println("Total Amount of oneBHK:: "+totalAmt1());
    }

    double totalAmt1(){

        double total = (roomArea + hallArea) * price;

        return total;
    }
}

class TowBHK extends OneBHK{
    double room2Area;

    TowBHK(){

    }

    TowBHK(double room2Area,double roomArea,double hallArea,int price){
        
        super(roomArea,hallArea,price);

        this.room2Area = room2Area;
    }
    void show(){
        super.show();
        System.out.println("room2Area:: "+room2Area);
        System.out.println("Total Amount of twoBHK:: "+totalAmt());
    }

    double totalAmt(){

        double total = (room2Area + roomArea + hallArea) * price;

        return total;
    }


}
public class Q43 {
    
    public static void main(String[] args){

        TowBHK t = new TowBHK(20.2,10.2,23.1,100);

        t.show();
    }
}

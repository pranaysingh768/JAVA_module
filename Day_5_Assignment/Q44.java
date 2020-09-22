//package JAVA_module.Day_5_Assignment;
import java.util.*;

class Faculty{

    int facultyId ;
    double salary;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter faculty Id:: ");
        int Id = sc.nextInt();
        this.facultyId = Id;
    }
    void show(){
        System.out.println("ID:: " +facultyId);
        System.out.println("ID:: " +salary);

    }
}
class FullTimeFaculty extends Faculty{

    double basicSalary;
    double allowances;

    void input(){

        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basicSalary Id:: ");
        
        double basicSalary = sc.nextDouble();
        System.out.print("Enter allowances Id:: ");
        double allowances = sc.nextDouble();
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        super.salary=this.basicSalary + this.allowances;
        super.show();
    }
}

class PartTimeFaculty extends Faculty{
    double workingHours;
    double ratePerHour;

    void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter workingHours :: ");
        
        double workingHours = sc.nextDouble();
        System.out.print("Enter ratePerHour :: ");
        double ratePerHour = sc.nextDouble();
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
        super.salary = this.workingHours * this.ratePerHour;
        super.show();
    }
}
public class Q44 {
    
    public static void main(String[] args){

        FullTimeFaculty f = new FullTimeFaculty();
        f.input();
        PartTimeFaculty p = new PartTimeFaculty();
        p.input();
    }
   
}

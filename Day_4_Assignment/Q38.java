
class Employee {
    
    int empNo;
    int salary;
    static int count;
    static int totalSalary;

    {
        count++;
    }

    Employee(int empNo,int salary){

        this.empNo = empNo;
        this.salary = salary;
        totalSalary += this.salary;
    }

    void showData(){

        
        System.out.println("EmpNOnn::"+count);
        System.out.println("totalSalary::"+totalSalary);
    }
}

public class Q38 {

    public static void main(String[] args){

        Employee d = new Employee(10,1000);

        Employee d1 = new Employee(15,200);
        d1.showData();
    
    }
   
}

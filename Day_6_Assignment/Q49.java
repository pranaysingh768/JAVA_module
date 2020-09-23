//package JAVA_module.Day_6_Assignment;

interface Taxable{
    double salaryTax = 0.07;
    double incomeTax = 0.15;

    void calcTax();
}
class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    Employee(){

    }
    Employee(int empId,String name,double salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    public void calcTax(){
        double totaTaxSalary = salaryTax * salary * 12;
        System.out.println("Total Salary Tax:: "+totaTaxSalary);
    }

}
class Product implements Taxable{

    int pid;
    double price;
    int qty;

    Product(){}

    Product(int pid,double price,int qty){
        this.pid = pid;
        this.price = price;
        this.qty = qty;
    }
    public void calcTax(){
        double totaSalesTax = incomeTax * price *qty;
        System.out.println("Total Sales Tax:: "+totaSalesTax);
    }
}
public class Q49 {
    public static void main(String[] args){
        Employee e = new Employee(10,"pranay",100.0);
        e.calcTax();
        Product p = new Product(20,200.2,3);
        p.calcTax();
    }
}

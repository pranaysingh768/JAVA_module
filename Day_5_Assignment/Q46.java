class Persone{
    String name;

    Persone(){

    }
    Persone(String name){
        this.name = name;
    }

    void show(){
        System.out.println(name+" Persone Class");
    }
}

class Employee extends Persone{
    int empId;

    Employee(){

    }

    Employee(int empId,String name){
        super(name);
        this.empId = empId;
    }

    void emp(){
        System.out.println(" Employee Class");
    }
    void show(){
        System.out.println(empId+" Employee Class");
    }
}

class Manager extends Persone{
    int mId;

    Manager(){

    }
    Manager(int mId,String name){
        super(name);
        this.mId = mId;
    }
    void show(){
        System.out.println(mId+" manager Class");
    }
}

public class Q46{
    public static void main(String[] args){

        Persone[] p ={new Employee(),new Manager()};

        for(Persone pp : p){

            if(pp instanceof Employee){
                Employee e = (Employee)pp;
                e.emp();
            }
           
            //pp.show();
            
        }
    }
}
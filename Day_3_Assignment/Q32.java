import java.util.Scanner;

class Student {
    
    private int rno;
    private String name;
    static int count;

    {
        count++;
    }

    void setData(int rollNo,String sname){

        rno = rollNo;
        name = sname;
    }

    void showData(){

        System.out.println("Roll no:: "+rno);
        System.out.println("name:: "+name);
        //System.out.println("No of Object:: "+count);
    }


}

class StudentDemo{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter roll no:: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter name:: ");
        String sname = sc.next();

        Student s = new Student();
        s.setData(rollNo, sname);
        s.showData();

        Student s1 = new Student();
        s1.setData(100,"Sachin");
        s1.showData();

        System.out.println("No of Object:: "+Student.count);
    }
}

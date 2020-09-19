import java.util.Scanner;

class Student {
    
    private int rno;
    private String name;
    
    void setData(int rollNo,String sname){

        rno = rollNo;
        name = sname;
    }

    void showData(){

        System.out.println("Roll no:: "+rno);
        System.out.println("name:: "+name);
        
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

    }
}

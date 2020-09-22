//package JAVA_module.Day_5_Assignment;

class Student{
    int rollNo;
    double per;

    Student(){

    }

    Student(int rollNo,double per){

        this.rollNo=rollNo;
        this.per=per;
    }

    void show(){
        System.out.println("Roll No:: "+rollNo);
        System.out.println("Roll No:: "+per);
    }
}

class CollegeStudent extends Student{
    int semester;

    CollegeStudent(){

    }

    CollegeStudent(int semester,int rollNo,double per){
        super(rollNo,per);
        this.semester = semester;
    }

    void show(){
        super.show();
        System.out.println("Semester:: "+semester);

    }

}

class SchoolStudent extends Student{

    int className;
    SchoolStudent(){

    }

    SchoolStudent(int className,int rollNo,double per){
        super(rollNo,per);
        this.className = className;
    }

    void show(){
        super.show();
        System.out.println("Class Name:: "+className);
    }
}
public class Q45 {
    
    public static void main(String[] args){

        Student[] s ={new CollegeStudent(2,1,70),new CollegeStudent(4,2,80),
                      new SchoolStudent(1,3,60),new SchoolStudent(2,4,90),new SchoolStudent(7,5,80)};

        int search = 4;
        int ccount=0;
        int scount=0;              
        for(Student ss : s){

            if(ss instanceof CollegeStudent) {

                ccount++;
            }

            if(ss instanceof SchoolStudent) {

                scount++;
            }

            if(ss.rollNo == search){
                if(ss instanceof CollegeStudent) {
                   
                    if(ss.per>75.00){
                        
                        System.out.println("Roll no "+search+" is college student of A grede");
                    }
                }        
            
                else{
                   
                        if(ss.per>75.00){
                           
                            System.out.println("Roll no "+search+" is college student of A grede");
                        }
                       
                }
            }
            //ss.show();
        }

        System.out.println("College:: "+ccount);
        System.out.println("Schooll:: "+scount);

        
        
    }
}

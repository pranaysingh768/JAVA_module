
//package JAVA_module.Day_4_Assignment;

import java.util.*;

class Student{

    String name;
    int rollNo;
    int age;
    int score;

    Student(String name,int rollNo,int age,int score){

        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.score=score;
    }

    void show(){

        

            if(score>=0 && score <=50){
                System.out.println("Score btwn 0-50:: "+name+" "+rollNo+" "+age+" "+score);
            }
            else if(score>=50 && score <=65){
                System.out.println("Score btwn 50-65:: "+name+" "+rollNo+" "+age+" "+score);
            }
            else if(score>=65 && score <=80){
                System.out.println("Score btwn 65-80:: "+name+" "+rollNo+" "+age+" "+score);
            }
            else if(score>=80 && score <=100){
                System.out.println("Score btwn 80-100:: "+name+" "+rollNo+" "+age+" "+score);
            }
        
    }
}
public class Q40 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];
    
        for(int i=0;i<3;i++){
    
            System.out.print("Enter name:: ");
            String name = sc.next();
    
            System.out.print("Enter roll No :: ");
            int roll = sc.nextInt();
    
            System.out.print("Enter age:: ");
            int age = sc.nextInt();
    
            System.out.print("Enter score:: ");
            int score = sc.nextInt();
    
            Student s=new Student(name,roll,age,score);
    
            arr[i] = s;
        }

        for(int i=0;i<3;i++){
            arr[i].show();
        }
       
        
    }
    
    
}

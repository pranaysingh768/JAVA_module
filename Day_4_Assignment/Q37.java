
class Persone {
    
    String name;
    int age;

    void setData(String name,int age){

        this.name=name;
        this.age=age;
    }

    void showData(){

        System.out.println(name+" "+age);
    }
}

public class Q37 {

    public static void main(String[] args){

        Demo d = new Demo();

        d.setData("pranay",24);
        d.showData();
    
    }
   
}

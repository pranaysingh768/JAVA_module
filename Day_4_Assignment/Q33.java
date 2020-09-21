
class Demo {
    
    String name;
    int rollNo;

    void setData(String name,int rollNo){

        this.name=name;
        this.rollNo=rollNo;
    }

    void showData(){

        System.out.println(name+" "+rollNo);
    }
}

public class Q33 {

    public static void main(String[] args){

        Demo d = new Demo();

        d.setData("pranay",72);
        d.showData();
    
    }
   
}

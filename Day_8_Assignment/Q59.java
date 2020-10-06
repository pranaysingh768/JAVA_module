import java.io.IOException;

//class MyException extends RuntimeException{
//	
//	MyException(String s){
//		super(s);
//	}
//}

class Voter{
	
	int age;
	String name;
	
	Voter(String name,int age) throws Exception{
		
		if(age < 18) {
			
			throw new Exception(name+" is not valid!!");
		}
		else {
			this.name=name;
			this.age=age;
			System.out.println("you are valid");
		}
	}
}



public class Q59 {
	public static void main(String[] args) {
		try {
			Voter v = new Voter("pranay",10);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

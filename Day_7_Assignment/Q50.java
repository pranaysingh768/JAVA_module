import java.util.Scanner;

class EmpDemo {
	int empId;
	String name;
	double salary;
	public EmpDemo(int empId,String name,double salary) {
		// TODO Auto-generated constructor stub
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "EmpDemo [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class Q50{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDemo[] arr = new EmpDemo[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			
			System.out.println("Enter Employee info:: "+i);
			
			System.out.println();
			System.out.println("Enter emp id ::");
			int empId = sc.nextInt();
			
			int flag = 0;
			for(int j=0;j<i;j++) {
				if(arr[j].empId == empId) {
					System.out.println("Emp Id Already Exist");
					i--;
					flag=1;
					break;
				}
			}
			
			if(flag == 1) {
				continue;
			}
			
			System.out.println("Enter emp name ::");
			String name = sc.next(); 
			
			System.out.println("Enter emp salary ::");
			double salary = sc.nextDouble(); 
			
			EmpDemo d = new EmpDemo(empId,name,salary);
			
			arr[i] = d;
			
		}
		
		for(EmpDemo e : arr) {
			System.out.println(e);
		}
	}

}

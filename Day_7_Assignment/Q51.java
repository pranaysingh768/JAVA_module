import java.util.Scanner;

class Bank {
	
	static int ano = 1000;
	static double totalBal;
	String name;
	char type;
	String accNo;
	double balance;
	public Bank(String name,char type,double balance) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.type=type;
		this.balance=balance;
		this.accNo=type+""+ano;
		totalBal += balance;
		ano++;
	}
	
	void diposit(double amt) {
		
		balance += amt;
		totalBal += amt;
		System.out.println(toString());
		//return balance;
	}
	
	void withdraw(double amt) {
		double minBal = 0;
		
		if(this.type == 'c') {
			minBal =1000;
		}
		
		if(this.type == 's') {
			minBal =5000;
		}
		
		double temp =balance- amt;
		if(temp > minBal) {
			balance -=amt;
			totalBal -= amt;
		}
		else {
			System.out.println("Insufficient Bal::");
		}
		
		System.out.println(toString());
		
		//return balance;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", type=" + type + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	
}
	
public class Q51{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank[] arr = new Bank[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter name:: ");
			String name = sc.next();
			
			System.out.println("Enter Account Type(C/S):: ");
			char type = sc.next().charAt(0);
			
			System.out.println("Enter Amount:: ");
			double balance = sc.nextInt();
			
			if(type == 'c' && balance < 1000.00) {
				System.out.println("for Current Acc Min bal Must be above 1000");
				i--;
				continue;
			}
			
			if(type == 's' && balance < 5000.00) {
				System.out.println("for Saving Acc Min bal Must be above 5000");
				i--;
				continue;
			}
			
			Bank b = new Bank(name,type,balance);
			
			arr[i] = b;
			
		}
		
		while(true) {
			
			System.out.println("Do u want to withdraw (Y/N):: ");
			char ch=sc.next().charAt(0);
			if(ch == 'y') {
				System.out.println("Enter Acc NO:: ");
				String an = sc.next();
				for(int i=0;i<arr.length;i++) {
					if(arr[i].accNo == an) {
						System.out.println("Enter Amt::");
						double d =sc.nextDouble();
						arr[i].withdraw(d);
					} 
				}
				
			}
			else {
				break;
			}
			
		}
		//System.out.println(toString());
		System.out.println("Total Bank Balance:: "+Bank.totalBal);
		
	}

}











import java.util.Scanner;

public class Q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:: ");
		String str = sc.nextLine();
		
		String[] arr  = str.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		
		System.out.println("String having "+count+" word(s)");
	}

}

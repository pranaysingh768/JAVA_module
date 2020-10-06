import java.util.Scanner;

public class Q58 {

	public static void main(String[] args) {
		
		String[] arr = {"sun","mon","tue","wed","thu","fri","sat"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day num:: ");
		int num = sc.nextInt();
		try {
			System.out.println(arr[num]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Day num not in a range!!");
		}

	

	}
}

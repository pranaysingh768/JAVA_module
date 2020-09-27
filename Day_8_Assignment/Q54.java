import java.util.Scanner;

public class Q54 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:: ");
		String str = sc.nextLine();
		
//		String[] arr = str.split("");
//		
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]);
//		}
//		
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			s += str.charAt(i);
		}
		System.out.println(s);

	}

}

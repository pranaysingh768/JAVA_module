import java.util.Scanner;

public class Q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String::");
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("No of vovels:: "+count);

	}

}

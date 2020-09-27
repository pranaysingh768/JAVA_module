import java.util.Scanner;

public class Q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:: ");
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			String ch ="";
			//System.out.println("aaa");
			
			for(int j=arr[i].length()-1;j>=0;j--) {
				
				ch += arr[i].charAt(j);
				
				
			}
			
			if(i == arr.length-1)
				System.out.print(ch);
			else
				System.out.print(ch+" ");
		}
	}

}

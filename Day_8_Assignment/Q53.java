
public class Q53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="67, 89, 23, 67, 12, 55, 66";
		String[] newArr = str.split(", ");
		
		int sum=0;
		for(int i=0;i<newArr.length;i++) {
			int a = Integer.parseInt( newArr[i]);
			sum += a;
		}
		System.out.println("sum is:: "+sum);
		System.out.println();
	}

}

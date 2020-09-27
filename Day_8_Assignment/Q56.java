
public class Q56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pranay m";
		
		String[] arr = str.split(" ");
		String s ="";
		for(int i=0;i<arr.length;i++) {
			char ch = arr[i].charAt(0);
			ch=Character.toUpperCase(ch);
			
			
			//System.out.println(arr[i]);
			if(i==arr.length-1)
				//System.out.println(ch+arr[i].substring(1));
			s = s+ch+arr[i].substring(1);
			else
			s = s+ch+arr[i].substring(1)+" ";
			
		}
		
		System.out.println(s);
	}

}

import java.util.*;

class Q28{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:: ");

        int size = sc.nextInt();

        String[] arr = new String[size];

        
        for(int i=0;i<size;i++){

            System.out.println("Enter string:: "+i+" ");
            arr[i] = sc.next();
        }

        for(String str : arr){

            System.out.print(str+" ");

        }

    }
}
import java.util.*;

class Q29{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base size:: ");

        int size = sc.nextInt();

        int[][] arr = new int[size][];

        for(int i=0;i<size;i++){

            System.out.print("Enter col size:: ");
            int colSize = sc.nextInt();

            arr = new int[size][colSize];


            for(int j=0;j<arr[i].length;j++){

                System.out.print("Enter element:: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2-D array length:: "+ arr.length);

        for(int i=0;i<arr.length;i++){

            System.out.println("1-D array length:: "+ arr[i].length);
        }

//System.out.println("1-D array length:: "+ arr[1].length);

        

       

    }
}
import java.util.*;

class Q30{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for(int i=0;i<3;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print("Enter element:: ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        int sum = 0;
        int sum1 =0;
        for(int i=0;i<3;i++){

            for(int j=0;j<arr[i].length;j++){

               if(i == j){

                    sum +=arr[i][j];
               }

               if(i + j == 2){

                    sum1 +=arr[i][j];
               }
            }
        }

        System.out.println("Sum of left digonal:: "+sum);
        System.out.println("Sum of right digonal:: "+sum1);





    }
}
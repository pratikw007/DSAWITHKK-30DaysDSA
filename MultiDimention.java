import java.util.Scanner;

public class MultiDimention {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][5];
        int[][] arr2D = {
                {1, 2, 3},//0th index
                {2,3}, //1st index
                {4, 6, 7} //2nd index --> arr2D[2] = {4,6,7}
        };
//        input
        for (int row=0;row<arr.length;row++){
//            for each col in every row
            for (int col = 0;col<arr[row].length;col++){
                arr[row][col] =sc.nextInt();
            }
        }
        //output
        for (int row=0;row<arr.length;row++){
            //            for each col in every row
            for (int col = 0;col<arr[row].length;col++){
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }


    }
}

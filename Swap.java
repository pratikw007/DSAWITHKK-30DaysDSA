import java.lang.reflect.Array;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,61,66,5,45,54};
        swap(arr,0,1);

        System.out.println(Array.toString(arr)) ;
    }
    //function
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] = temp;
    }
}

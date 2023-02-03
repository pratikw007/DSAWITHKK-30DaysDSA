public class Main {
    public static void main(String[] args) {
//        Q:Store a roll number
        int a = 19;
//        Q: store a person's name
        String name ="Ram";

//        Q: Store 5 roll numbers
        int rno1 = 23;
        int rno2 = 32;
        int rno3 = 41;

//        syntax of array
//        datatype[] variable_name = new datatype[size];
//        store 5 roll numbers
        int[] rnno = new int[5];
//        or directly
        int[] rnno1 = {2,4,9,5,5,5,0}; //correct way // all type of data shoud be same type
//        int[] rnno1 = {2,4,9,5,5,5,"Ram",true};  not possible

        int[] ros;//declaration of array. ros is getting defined in the stack
        ros = new int[5]; //initialization: actually here object is being created in the memory (heap)
        System.out.println(ros[2]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}

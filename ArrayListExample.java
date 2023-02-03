import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(55);
        list.add(85);
        list.add(52);
        list.add(522);
        list.add(8852);
        list.add(96552);

        System.out.println(list.contains(52)); //true
        System.out.println(list);//[55, 85, 52, 522, 8852, 96552]
        list.set(0,99); //change 0th index to 99 value
        list.remove(2); // remove index 2
        System.out.println(list);

        //input
        for (int i = 0; i<5;i++){
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i<5;i++){
            System.out.println(list.get(i)); //passing the index , list[index] syntax will not work
        }


//        System.out.println(list);
    }
}

//1:21:38



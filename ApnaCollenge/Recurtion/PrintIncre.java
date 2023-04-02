public class PrintIncre {
    public static void IncNumber(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        IncNumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 6;
        IncNumber(n);

    }
}

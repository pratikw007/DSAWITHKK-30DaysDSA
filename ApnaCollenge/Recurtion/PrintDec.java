public class PrintDec {


     static void DecNumber(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        DecNumber(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        DecNumber(n);
    }
    
}

public class Fibonancci{

    // public static int Fib(int n){
    //     if (n==0 || n==1) {
    //         return n;
    //     }

    //     return (Fib(n-1)+Fib(n-2));
    // }
    // ---------------------------------------------------------------------------------------------------
    public static int Fib(int n){
        if (n==0 || n==1) {
            return n;
        }
            int fnm1 = Fib(n-1);
            int fnm2 = Fib(n-2);
            int fn = fnm1 + fnm2;
            return fn;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Fib(n));
    }
}
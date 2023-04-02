public class FactorialOfNumber {
    public static int Fact(int n){

        if (n==0) {
            return 1;
        }
        return (n*Fact(n-1));
    }

    // ---------------------------Otherwise Optimal Solution-----------------------------
    public static int Fact1(int n){
        if (n==0) {
            return 1;
        }

        int fnm = Fact1(n-1);
        int fn = n * Fact1(n-1);
        return fn;

    }
    // -----------------------------------------------------------------
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));  
    }
}

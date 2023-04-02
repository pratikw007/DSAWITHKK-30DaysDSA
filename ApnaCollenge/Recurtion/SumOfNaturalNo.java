public class SumOfNaturalNo {

    // public static int Sum(int n){
    //     if(n==1){
    //         return 1;
    //     }

    //     return (n+Sum(n-1));
    // }

    // -------------------------------------------
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int fnm1 = Sum(n-1);
        int fn = n+Sum(n-1);
        return fn;
    }
    // ----------------------------------------------
    public static void main(String[] args) {
        int  n = 10;
        System.out.println(Sum(n));
    }
    
}

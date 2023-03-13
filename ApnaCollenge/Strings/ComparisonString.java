public class ComparisonString {
    
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // if (s1==s2) { //Refrance variable s1 &s2 pointing to the same object "Tony"
        //     System.out.println("Strings are Equal");     
        // }else{
        //     System.out.println("Strings are Not Equal");
        // }

        // if (s1==s3) {//s3 is created new object 
        //     System.out.println("Strings are Equal");     
        // }else{
        //     System.out.println("Strings are Not Equal");
        // }


        if (s1.equals(s3)) {
            System.out.println("Strings are Equal");     
        }else{
            System.out.println("Strings are Not Equal");
        }



    }
}

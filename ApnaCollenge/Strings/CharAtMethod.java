public class CharAtMethod {

        public static void printLetters(String str){

            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i)+" ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        String Fname = "abc";
        String Lname = "waghmare";
        String FullName = Fname +" "+ Lname;

        // System.out.println(FullName.charAt(0));
        printLetters(FullName);
    }
    
}

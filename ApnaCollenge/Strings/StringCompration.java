public class StringCompration {
    

    public static String Compressed(String str){
        String newStr ="";
              //abc 
        for (int i = 0; i < str.length(); i++) { // T.C//O(n)
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count>1) {
                newStr += count.toString();
            }   
        }
        return newStr;
    }
        public static void main(String[] args) {
            String str = "aaabbbbcccddggg";
            System.out.println(Compressed(str));
        }
}

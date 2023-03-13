public class Palindrome {
    // noon , madam , racecar

    // string is palindrome or not

    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) { //O(n)

            if(str.charAt(i) != str.length()-1-i){
                // not a pallindrome
                 return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        str.toLowerCase();
        System.out.println(isPalindrome(str));



    }
    
}

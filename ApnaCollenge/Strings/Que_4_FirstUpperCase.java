import java.util.*;
public class Que_4_FirstUpperCase {
    
    public static String toUpeerCase(String str){
            StringBuilder sb = new StringBuilder();

            char ch = Charecter.toUpperCase(str.charAt(0));
            sb.append(ch);

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i)==' ' && i<str.length()-1) {
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Charecter.upperCase(str.charAt(i)));               
                }else{
                    sb.append(str.charAt(i));
                }
                
            }
            return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am pratik";
        System.out.println(toUpeerCase(str));
    }
}

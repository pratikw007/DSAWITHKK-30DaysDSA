public class StringBuilder {

    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder();
    for(char ch ='a'; ch<='z';ch++){
        sb.append(ch); //one by one add hona 


    }
    System.out.println(sb); //abcdefghijklmnopqrstuvwxyz
    System.out.println(sb.length());
}
}

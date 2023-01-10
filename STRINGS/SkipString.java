package STRINGS;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("An Apple a day keeps doctor away", "Apple"));
        System.out.println(skipString("An Apple a day keeps doctor away", "doctor"));

    }
    public static String skipString(String str, String skipStr){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith(skipStr)){
            return skipString(str.substring(skipStr.length()),skipStr);
        }
        else {
            return str.charAt(0) + skipString(str.substring(1), skipStr);
        }
    }
}

package STRINGS;

public class SkipChar {
    public static void main(String[] args) {
        skip("madiha", "");

        // you can see the difference between skip2 and skip3
        // --- in skip2 function we add the answer first that's it gives us output -- "mdih"
        // -- in skip3 function we add the answer after recursive call that's why it gives us output - "hidm"

        System.out.println(skip2("madiha"));
        System.out.println(skip3("madiha"));
    }

    public static void skip(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        if(str.charAt(0) == 'a'){
            skip(str.substring(1), ans);
//            System.out.println("The a condition");
        }
        else {
            skip(str.substring(1), ans + str.charAt(0));
//            System.out.println("The not a condition");
        }
    }

    public static String skip2(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.charAt(0) == 'a'){
//            System.out.println("The a condition");
            return skip2(str.substring(1));
        }
        else{
//            System.out.println("The not a condition");
            return str.charAt(0) + skip2(str.substring(1));
        }
    }

    public static String skip3(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.charAt(0) == 'a'){
//            System.out.println("The a condition");
            return skip3(str.substring(1));
        }
        else{
//            System.out.println("The not a condition");
            return  skip3(str.substring(1)) + str.charAt(0);
        }
    }
}

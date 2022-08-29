public class SkipChar {
    public static void main(String[] args) {
//        System.out.println(skip("madiha"));
//        skip2(new String(), "Madiha");
//        skipString("","maapplediha");
        skipAppNotApple("","appha");
    }

    public static String skip(String ex){
        if(ex.isEmpty()){
            return "";
        }
        char ch = ex.charAt(0);
        if(ch == 'a'){
            return skip(ex.substring(1));
        }
        else {
            return ch + skip(ex.substring(1));
        }
    }

    public static void skip2(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            skip2(processed, unprocessed.substring(1));
        }
        else {
            skip2(processed + ch, unprocessed.substring(1));
        }
    }

    public static void skipString(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        if(unprocessed.startsWith("apple")){
            skipString(processed, unprocessed.substring(5));
        }
        else {
            skipString(processed + unprocessed.charAt(0), unprocessed.substring(1));
        }
    }

    public static void skipAppNotApple(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            skipAppNotApple(processed, unprocessed.substring(3));
        }
        else {
            skipAppNotApple(processed + unprocessed.charAt(0), unprocessed.substring(1));
        }
    }
}

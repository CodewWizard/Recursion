package SUBSEQUENCEnSUBSET;

import java.util.*;

public class SubSequence {
    public static void main(String[] args) {
        subSeq("", "gfg");
        System.out.println(subSeq2("", "abc"));
    }

    public static void subSeq(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        subSeq(ans, str.substring(1));
        subSeq(ans + str.charAt(0) , str.substring(1));
    }

    public static ArrayList<String> subSeq2(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> ansFromLeftCalls = subSeq2(ans, str.substring(1));

        ArrayList<String> ansFromRightCalls = subSeq2(ans + str.charAt(0), str.substring(1));

        ansFromLeftCalls.addAll(ansFromRightCalls);
        return ansFromLeftCalls;
    }

}

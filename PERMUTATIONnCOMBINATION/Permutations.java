package PERMUTATIONnCOMBINATION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        List<List<Integer>> ans2 = perm(arr, ans, new ArrayList<>(), freq);
        for (List<Integer> list: ans2) {
            System.out.println(list);
        }
//        List<String> ans = find("", "ABB");
//        Collections.sort(ans);
//        System.out.println(ans);
    }

    public static List<String> find(String p, String S){
        if(S.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = S.charAt(0);
        List<String> ans = new ArrayList<>();

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(find(f + ch + s, S.substring(1)));
        }
        return ans;
    }

    public static List<List<Integer>> perm(int[] arr, List<List<Integer>> ans, List<Integer> ds, boolean[] freq){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return ans;
        }

        for (int i = 0; i < arr.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                perm(arr,ans,ds,freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
        return ans;
    }
}

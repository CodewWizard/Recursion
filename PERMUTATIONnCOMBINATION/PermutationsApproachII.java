package PERMUTATIONnCOMBINATION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PermutationsApproachII {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List<List<Integer>> ans = new ArrayList<>();
//        app2(arr,0,ans, new ArrayList<Integer>());
        for (List<Integer> list: ans) {
            System.out.println(list);
        }

        app2Print(arr,0,new ArrayList<>());
    }

    public static List<List<Integer>> app2(List<Integer> arr, int index, List<List<Integer>> ans, List<Integer> ds){
        if(index == arr.size()){
            ans.add(new ArrayList<>(ds));
            return ans;
        }

        for (int i = index; i < arr.size(); i++) {
            ds.add(arr.get(i));
            Collections.swap(arr, i, index);
            app2(arr,index + 1,ans, ds);
            Collections.swap(arr,i,index);
            ds.remove(ds.size() - 1);
        }
        return ans;
    }

    public static void app2Print(List<Integer> arr, int index, List<Integer> ds){
        if(index == arr.size()){
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(ds.get(i));
            }
            System.out.println();
            return ;
        }

        for (int i = index; i < arr.size(); i++) {
            ds.add(arr.get(i));
            Collections.swap(arr, i, index);
            app2Print(arr, index + 1, ds);
            Collections.swap(arr, i, index);
            ds.remove(ds.size() - 1);
        }
    }
}

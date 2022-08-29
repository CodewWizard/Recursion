import java.util.ArrayList;
import java.util.List;

public class subSetRecursive {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> res = solve(arr);
        for (List<Integer> ans: res) {
            System.out.println(ans);
        }
    }

    public static List<List<Integer>> solve(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        List<Integer> internal = new ArrayList<>();
        subset(outer, arr,0);
        return outer;
    }

    public static void subset(List<List<Integer>> outer, int[] num, int index){
        List<Integer> internal = new ArrayList<>(outer.get(index));
        if(index >= num.length){
            outer.add(internal);
            return;
        }
        subset(outer, num,index+1);
        int element = num[index];
        internal.add(element);
        subset(outer, num,index+1);
    }
}

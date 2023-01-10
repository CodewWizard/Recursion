package PERMUTATIONnCOMBINATION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2};
        List<List<Integer>> res = combinationSumII(arr, 4);
        for (List<Integer> list:res) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> combinationSumII(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds) {
            if(target == 0){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i = index; i < candidates.length; i++){
                if(i > index && candidates[i] == candidates[i - 1]){
                    continue;
                }
                if(candidates[i] > target){
                    break;
                }
                ds.add(candidates[i]);
                findCombinations(i + 1,candidates,target - candidates[i],ans, ds);
                ds.remove(ds.size() - 1);
            }
    }

}


//looping from index to n - 1
//
package SUBSEQUENCEnSUBSET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSumI {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<Integer> ans = subsetI(arr,0,new ArrayList<>(),0);
        Collections.sort(ans);
        System.out.println(ans);
    }

    public static ArrayList<Integer> subsetI(int[] arr, int index, ArrayList<Integer> ans, int sum){
        if(arr.length == index){
            ans.add(sum);
            return ans;
        }

        subsetI(arr,index + 1,ans,sum + arr[index]);
        subsetI(arr,index + 1, ans, sum);
        return ans;
    }
}

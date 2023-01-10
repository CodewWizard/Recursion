package SUBSEQUENCEnSUBSET;

import java.util.ArrayList;
import java.util.List;

public class SubseqSum {
    public static void main(String[] args) {
//        System.out.println("helo");
        int[] arr = {1, 2, 2, 1};
        ArrayList<Integer> st = new ArrayList<>();
        sumSubseq(0, st, 0, 2, arr);
        System.out.println("Counts: "+countSubsets(arr,0,0,3));
    }

    public static void sumSubseq(int index, ArrayList<Integer> store, int s, int sum, int arr[]){
        if(index == arr.length){
            if(s == sum){
                for (int el: store) {
                    System.out.print(el);
                }
                System.out.println();
            }
            return;
        }

        store.add(arr[index]);
        s += arr[index];

        sumSubseq(index + 1,store,s, sum,arr);

        s -= arr[index];
        store.remove(store.size() - 1);

        sumSubseq(index + 1,store,s, sum,arr);
    }

    static int countSubsets(int[] arr, int index, int s, int sum){
        if(index == arr.length){
            if(s == sum)
                return 1;
            else
                return 0;
        }
        int l = countSubsets(arr,index + 1, s += arr[index] ,sum) + countSubsets(arr,index + 1, s -= arr[index],sum);

        return l;
    }
}

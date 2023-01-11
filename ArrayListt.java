import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListt {
    public static void main(String[] args) {
        int arr[] = {8, 5, 7, 8, 3, 2};
//        ArrayList ans = findAllIndices(arr, 2, 0, new ArrayList());
//        System.out.println(ans);
//        System.out.println(findAllIndices2(arr, 8, 0));
        demo();
    }

    static ArrayList<Integer> findAllIndices(int arr[], int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndices(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndices2(int arr[], int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndices2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    static void demo(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        int arr[] = {10, 20};
        System.out.println(arr[1]);
        System.out.println(list.get(1));
        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        outer.add(inner);
        inner.add(1);
        inner.add(2);
        System.out.println(outer);
    }
}

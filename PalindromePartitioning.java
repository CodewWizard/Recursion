import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        List<List<String>> ans = part("aabb");
        for (List<String> el:ans) {
            System.out.println(el);
        }
    }

    public static List<List<String>> part(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        work(0, s, path, res);
        return res;
    }

    private static void work(int index, String s, List<String> path, List<List<String>> res) {
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i+1));
                work(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start <= end){
            if(s.charAt(start ++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}

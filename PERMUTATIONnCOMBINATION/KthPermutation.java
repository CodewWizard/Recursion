package PERMUTATIONnCOMBINATION;

import java.util.ArrayList;
import java.util.List;
public class KthPermutation {
    public static void main(String[] args) {
        String ans = getPermutation(3,3);
        System.out.println(ans);
//        double anss = getPow(2.10000, 3);
//        System.out.println(anss);
    }

    public static double getPow(double x, int n){
        double ans = 1;
        int i = 1;
        while(i <= n){
            ans = ans * x;
            i++;
        }
        return ans;
    }

    public static String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> num = new ArrayList<>();
        for(int i = 1; i < n; i++){
            fact = fact * i;
            num.add(i);
        }
        num.add(n);
        String ans = "";
        k = k - 1;
        while(true){
            ans = ans + num.get(k / fact);
            num.remove(k / fact);
            if(num.size() == 0){
                break;
            }

            k = k % fact;
            fact = fact / num.size();
        }
        return ans;
    }
}

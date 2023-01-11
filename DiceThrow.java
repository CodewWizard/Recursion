import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
//        dice("",3);
        System.out.println(diceRet("",4));
        System.out.println(diceCount("",4));
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static int diceCount(String p, int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count += diceCount(p + i, target - i);
        }
        return count;
    }

    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }
}

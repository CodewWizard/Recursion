package EASY;

public class TrailingZero {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(7));
    }
    public static int trailingZeroes(int n) {
        int ans=0;
        while(n>=5)
        {
            n/=5;
            ans+=n;
        }

        return ans;

    }
}

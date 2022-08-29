public class print {
    // 1 to n
//    public static void main(String[] args) {
//        print(5);
//    }
//    public static void print(int n){
//        if(n == 0){
//            return;
//        }
//        // this is tail condition
//        // this is last function call
//        print(n - 1);
//        System.out.println(n);
//    }
    // both
//    public static void main(String[] args) {
//        printBoth(5);
//    }
//    public static void printBoth(int n){
//        if(n == 0){
//            return;
//        }
//        // this is tail condition
//        // this is last function call
//        System.out.println(n);
//        printBoth(n - 1);
//        System.out.println(n);
//    }

    // n to 1
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        System.out.println(n);
        if(n == 1){
            return;
        }
        print(--n);
    }

    //product n to 1
//public static void main(String[] args) {
//    int ans = fact(4);
//    System.out.println(ans);
//}
//    public static int fact(int n){
//       if(n <= 1){
//           return 1;
//       }
//       return n * fact(n - 1);
//    }

    //sum of digits
//    public static void main(String[] args) {
//        int ans = sumDigit(5455);
//        System.out.println(ans);
//    }
//    public static int sumDigit(int n){
//        if(n == 0){
//            return 0;
//        }
//        return (n%10) + sumDigit(n / 10);
//    }

    // product of digits
//    public static void main(String[] args) {
//        int ans = prod(52);
//        System.out.println(ans);
//    }
//    public static int prod(int n){
//        if(n%10 == n){
//            return n;
//        }
//        return (n%10) * prod(n / 10);
//    }
}

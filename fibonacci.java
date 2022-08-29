public class fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibonacci(3));
        fibo();
    }

    //If you are calling again and again same function, you can treat it as a separate call in the stack
    public static int fibonacci(int n){
        //Base condition is needed
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n - 2);
    }

    public static void fibo(){
        int n1 = 0, n2 = 1, n3=0, i = 0;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        while (n3 <= 13){
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            i++;
        }
    }
}

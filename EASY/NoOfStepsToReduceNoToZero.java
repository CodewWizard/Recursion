package EASY;

public class NoOfStepsToReduceNoToZero {
    public static void main(String[] args) {
        System.out.println(noOfStepsIterative(123));
        System.out.println(noOfStepsRecursive(123, 0));
    }

    public static int noOfStepsIterative(int num){
        int sum = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                num -= 1;
            }
            sum++;
        }
        return sum;
    }

    public static int noOfStepsRecursive(int num, int sum){
        if(num == 0){
            return sum;
        }

        if(num % 2 == 0)
            return noOfStepsRecursive(num / 2, sum + 1);
        else
            return noOfStepsRecursive(num - 1, sum + 1);
    }
}

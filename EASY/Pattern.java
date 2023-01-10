package EASY;

import java.util.ArrayList;

public class Pattern {
    public static void main(String[] args) {
        pattern0(3);
        pattern2(5, 0);
        pattern3(3, 0);
    }

    public static void pattern0(int n){
        if(n == 0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern0(n - 1);
    }

    public static void pattern2(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            System.out.print("* ");
            pattern2(row, col + 1);
        }
        else{
            System.out.println();
            pattern2(row - 1, 0);
        }
    }

    public static void pattern3(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            pattern3(row, col + 1);
            System.out.print("* ");
        }
        else{
            pattern3(row - 1, 0);
            System.out.println();
        }
    }

}

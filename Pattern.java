public class Pattern {
    public static void main(String[] args) {
        print(1);
    }
    static void tringle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            tringle(row, col + 1);
            System.out.print("*");
        }
        else{
            tringle(row - 1, 0);
            System.out.println();
        }
    }

    static void print(int n){
        if(n == 6){
            return;
        }
        else{
            System.out.println(n);
            print(n + 1);
        }
    }
}




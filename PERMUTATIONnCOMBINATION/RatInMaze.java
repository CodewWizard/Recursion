package PERMUTATIONnCOMBINATION;

import java.util.ArrayList;

public class RatInMaze {
    public static void main(String[] args) {
//        boolean maze[][] =   {{true, false, false, false},
//                            {true, true, false, true},
//                            {true, true, false, false},
//                            {false, true, true, true}};
//        rat("", 0, 0, maze);

        int m[][] =   {{1, 0},
                    {1, 0}};

        ArrayList<String> ans = ratStore(2,"",0,0, m, new ArrayList<String>());
        System.out.println(ans);
    }

    public static void rat(String p, int r, int c, boolean[][] maze){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length - 1){
            rat(p + "D", r + 1, c, maze);
        }

        if(c > 0){
            rat(p + "L", r,c - 1, maze);
        }

        if(c < maze[0].length - 1){
            rat(p + "R", r, c + 1, maze);
        }

        if(r > 0){
            rat(p + "U",r - 1,c,maze);
        }

        maze[r][c] = true;
    }

    public static ArrayList<String> ratStore(int n, String p, int r, int c, int[][] maze, ArrayList<String> ans){
        if(maze[n - 1][n - 1] == 0){
            ans.add("-1");
            return ans;
        }
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ans.add(p);
            return ans;
        }

        if(maze[r][c] == 0){
            return ans;
        }

        maze[r][c] = 0;

        if(r < maze.length - 1){
            ratStore(n,p + "D", r + 1, c, maze, ans);
        }

        if(c > 0){
            ratStore(n,p + "L", r,c - 1, maze, ans);
        }

        if(c < maze[0].length - 1){
            ratStore(n,p + "R", r, c + 1, maze, ans);
        }

        if(r > 0){
            ratStore(n, p + "U",r - 1,c,maze, ans);
        }

        maze[r][c] = 1;
        return ans;
    }
}

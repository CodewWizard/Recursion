package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(paths(3,3));
//        printPaths("",3 ,3);
//        System.out.println(printPathsReturn("",3,3));
//        printPathsDiagonal("",3,3);
        boolean arr[][] = {{true, true, true},
                {true, true, true},
                {true, true, true}};
//        printPathsObstacle("",arr,0,0);
//        pathIncludeAll("",0,0, arr);
        int[][] path = new int[arr.length][arr[0].length];
        printPathIncludeAll("",0,0,arr,path,1);
    }

    public static int paths(int r, int c){
        if(c == 1 || r == 1){
            return 1;
        }

        int count = paths(r - 1,c) + paths(r,c - 1);
        return count;
    }

    public static void printPaths(String p, int r, int c){
        if(c == 1 && r == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            printPaths(p + "D", r - 1, c);
        }
        if(c > 1){
            printPaths(p + "R", r, c - 1);
        }
    }

    public static ArrayList<String> printPathsReturn(String p, int r, int c){
        if(c == 1 && r == 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(printPathsReturn(p + "D", r - 1, c));
        }
        if(c > 1){
            list.addAll(printPathsReturn(p + "R", r, c - 1));
        }
        return list;
    }

    public static void printPathsDiagonal(String p, int r, int c){
        if(c == 1 && r == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            printPathsDiagonal(p + "D", r - 1, c);
        }
        if(c > 1){
            printPathsDiagonal(p + "R", r, c - 1);
        }
        if(c > 1 && r > 1){
            printPathsDiagonal(p + "Di", r - 1,c - 1);
        }
    }

    public static void printPathsObstacle(String p, boolean[][] maze, int r, int c){
        if(c == maze[0].length - 1 && r == maze.length - 1){
            System.out.println(p);
            return;
        }
        //if(maze[r][c] == false)
        if(!maze[r][c]){
            return;
        }

        if(r < maze.length - 1){
            printPathsObstacle(p + "D", maze, r + 1, c);
        }

        if(c < maze[0].length - 1){
            printPathsObstacle(p + "R", maze, r, c + 1);
        }
    }

    public static void pathIncludeAll(String p, int r, int c, boolean[][] maze){
        if(c == maze[0].length - 1 && r == maze.length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;

        if(r > 0){
            pathIncludeAll(p + "U", r - 1, c, maze);
        }
        if(c > 0){
            pathIncludeAll(p + "L", r, c - 1, maze);
        }
        if(r < maze.length - 1){
            pathIncludeAll(p + "D", r + 1, c, maze);
        }
        if(c < maze[0].length - 1){
            pathIncludeAll(p + "R", r, c + 1, maze);
        }

        //this line is where fun call will be over
        //so before the fun gets removed, also remove the changes that were made by that fun
        maze[r][c] = true;
    }

    public static void printPathIncludeAll(String p, int r, int c, boolean[][] maze, int[][] path, int step){
        if(c == maze[0].length - 1 && r == maze.length - 1){
            path[r][c] = step;
            for (int [] arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r > 0){
            printPathIncludeAll(p + "U", r - 1, c, maze, path, step + 1);
        }
        if(c > 0){
            printPathIncludeAll(p + "L", r, c - 1, maze, path, step + 1);
        }
        if(r < maze.length - 1){
            printPathIncludeAll(p + "D", r + 1, c, maze, path, step + 1);
        }
        if(c < maze[0].length - 1){
            printPathIncludeAll(p + "R", r, c + 1, maze, path, step + 1);
        }

        //this line is where fun call will be over
        //so before the fun gets removed, also remove the changes that were made by that fun
        maze[r][c] = true;
        path[r][c] = 0;
    }
}

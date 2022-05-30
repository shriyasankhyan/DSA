package Easy;

public class LE043_1351A {
    public static int countNegatives(int[][] grid) {
//        3 2 1 1
//        4 3 2 1
//        3 2 -1 -1
//        1 1 -1 -2
//        -1 -1 -2 -3
//       If grid[row][last column] > 0 it means all the numbers in the left will be positive and since it is row wise &
//        column wise decreasing, all the rows above it will also be positive. So break the loop.
        int count = 0;
        for (int i = grid.length-1; i >=0 ; i--) {
            if(grid[i][grid[i].length-1] > 0){
                break;
            }
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0){
                    count +=  (grid[i].length -j);
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] [] grid = {
                {5,4,3,1},
                {4,3,2,1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
}

package Easy;

public class LE043_1351B {
    public static int countNegatives(int[][] grid) {
        int count = 0;
        int row = 0;
        int column = grid[0].length-1;
        while(row < grid.length && column >= 0){
            if(grid[row][column] >= 0){
                row++;
            }else{
                count += grid.length-row;
                column--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] [] grid = {
                {5,4,3,1},
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
}

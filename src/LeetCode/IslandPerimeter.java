package LeetCode;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,0,0},
                          {1,1,1,0},
                          {0,1,0,0},
                          {1,1,0,0}};

        System.out.println(islandPerimeter(matrix));
    }
    public static int islandPerimeter(int[][] grid) {
        int ans = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    ans+=4;
                    // up
                    if(i-1 >= 0 && grid[i-1][j]==1){
                        ans--;
                    }
                    // down
                     if(i+1<=grid.length-1 && grid[i+1][j]==1){
                        ans--;
                    }
                    // right
                     if(j+1<=grid[0].length-1 && grid[i][j+1]==1){
                        ans--;
                    }
                    // left
                     if(j-1>=0 && grid[i][j-1]==1) ans--;
                }

            }

        }
        return ans;
    }
}

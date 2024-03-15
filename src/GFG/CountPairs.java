package GFG;

public class CountPairs {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 1}, {1, 1}};
        int[][] mat2 = {{1, 1}, {1, 1}};
        System.out.println(countPairs(mat1,mat2,2,2));
    }
    static int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int i=0;
        int j=0;
        int i1 = n-1;
        int j1 = n-1;
        int count = 0;
        while((i<n &&j<n) && (i1>=0 && j1>=0)){
            if(mat1[i][j]+mat2[i1][j1] == x){
                count++;
                if(j1==0){
                    j1 = n-1;
                    i1--;
                }
                else {
                    j1--;
                }
                if(j==n-1){
                    i++;
                    j = 0;
                }
                else{
                    j++;
                }

            }
            else if(mat1[i][j]+mat2[i1][j1] > x){
                if(j1==0){
                    j1 = n-1;
                    i1--;
                }
                else {
                    j1--;
                }
            }
            else{
                if(j==n-1){
                    j = 0;
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        return count;
    }
}

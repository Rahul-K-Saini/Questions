package Others;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int row = 3;
        int col = 4;
        String[][] arr = new String[row][col];
        for(int i = 0 ; i < row ; i++){
            String str = sc.nextLine();
            String[] starr = str.split(" ");
            int k = 0;
            for (int j = 0; j < col; j++) {
                arr[i][j] = starr[k++];
            }
        }
        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
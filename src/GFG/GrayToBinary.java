package GFG;

public class GrayToBinary {
    public static void main(String[] args) {
        System.out.println(grayToBinary(58));
        
    }

    public static int grayToBinary(int n) {
        {
            int b=0;
            for(; n>0; n=n>>1)b^=n;
            return b;
        }
    }
}

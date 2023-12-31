package GFG;

public class RightmostDifferentBit {
    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(11,9));
    }
    public static int posOfRightMostDiffBit(int m, int n)
    {
        long xor = m^n;
        String s = Long.toBinaryString(xor);
        int ans = 0;
        for(int i=s.length()-1; i>=0; i--){
            ans++;
            if(s.charAt(i)=='1') {
               return ans;
            }
        }
        return -1;
    }
}

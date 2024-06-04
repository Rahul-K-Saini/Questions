package GFG;

public class MinSteps {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(minSteps(n));
    }
    static int minSteps(int d) {
        int i = 0;
        int j = 1;
        int count = 0;
        while(i!=d){
            if(i+j<=d) i+=j++;
            else i -= j++;
            count++;
        }
        return count;
    }
}

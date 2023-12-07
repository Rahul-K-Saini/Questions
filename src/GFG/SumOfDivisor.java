package GFG;

public class SumOfDivisor {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(1000000000));
    }
    static long sumOfDivisors(int N){
        long ans=0;
        for(int i=1;i<=N;i++){

            ans+= (long) i *(N/i);
        }

        return ans;
    }
}

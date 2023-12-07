import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Random {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int count =0;
        for(int i=0; i<name.length(); i++){
            char c = name.charAt(i);
            int a = Integer.parseInt(String.valueOf(c));
            if(isPrime(a)){
                count++;
            }
        }
        System.out.println(count);

    }
    static boolean isPrime(int x){
        if(x==2 || x==3 || x== 5 || x==7) return true;
        return false;
    }
}

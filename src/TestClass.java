import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String binaryString = br.readLine();
        String[] arr = inputStr.split(" ");
        int len = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int i = 0;
        int j = k - 1;
        int ans = Integer.MAX_VALUE;

        while (j < len) {
            int count = 0;
            for (int l = i; l <= j; l++) {
                if (binaryString.charAt(l) == '0') {
                    count++;
                }

            }
            ans = Math.min(count, ans);
            i++;
            j++;
        }
        System.out.println(ans);
    }
}

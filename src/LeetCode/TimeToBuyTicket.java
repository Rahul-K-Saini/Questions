package LeetCode;


public class TimeToBuyTicket {
    public static void main(String[] args) {
        int[] arr = {84,49,5,24,70,77,87,8};
        System.out.println(timeRequiredToBuy2(arr,3));
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int time = 0;

        // If person k only needs one ticket, return the time to buy it
        if (tickets[k] == 1)
            return k + 1;

        // Continue buying tickets until person k buys all their tickets
        while (tickets[k] > 0) {
            for (int i = 0; i < n; i++) {
                // Buy a ticket at index 'i' if available
                if (tickets[i] != 0) {
                    tickets[i]--;
                    time++;
                }

                // If person k bought all their rickets, return the time
                if (tickets[k] == 0)
                    return time;
            }
        }

        return time;
    }

        public static int timeRequiredToBuy2(int[] tickets, int k) {
            int res = 0;
            for(int i = 0;i<tickets.length;i++){
                if(i <= k){
                    res += Math.min(tickets[k],tickets[i]);
                }else{
                    res += Math.min(tickets[k] - 1,tickets[i]);
                }
            }
            return res;
        }
    }

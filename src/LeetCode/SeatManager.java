package LeetCode;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SeatManager {
    PriorityQueue<Integer> q;
    int n = 0;
    public static void main(String[] args) {
        SeatManager obj = new SeatManager(5);
        System.out.println(obj.reserve());
        System.out.println(obj.reserve());
        obj.unreserve(2);
        System.out.println(obj.reserve());
        System.out.println(obj.reserve());
        System.out.println(obj.reserve());
        System.out.println(obj.reserve());
        obj.unreserve(5);

    }


    public SeatManager(int n) {
        q = new PriorityQueue<>();
    }

    public int reserve() {
        n++;
        q.add(n);
        return q.poll();
    }

    public void unreserve(int seatNumber) {
       q.add(seatNumber);
    }

}

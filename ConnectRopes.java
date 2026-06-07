import java.util.PriorityQueue;

public class ConnectRopes {
    public static int minCost(int[] ropes) {
        if (ropes == null || ropes.length == 0){
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int r : ropes) {
            pq.add(r);
        }
        int cost = 0;
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            int s = a + b;
            cost += s;
            pq.add(s);
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] ropes = { 5, 4, 2, 8 };
        System.out.println("Input: [5, 4, 2, 8]");
        System.out.println("The minimum cost is " + minCost(ropes));
    }
}
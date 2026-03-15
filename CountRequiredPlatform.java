/* 
Given a schedule containing the arrival and departure time of trains in a station, find the minimum number of platforms needed to avoid delay in any train’s arrival.
Example: Trains arrival = { 2.00, 2.10, 3.00, 3.20, 3.50, 5.00 }
Trains departure = { 2.30, 3.40, 3.20, 4.30, 4.00, 5.20 }
 
The minimum platforms needed is 2
*/
public class CountRequiredPlatform {
    public static int findPlatform(double[] arrival, double[] departure) {
        int n = arrival.length;
        java.util.Arrays.sort(arrival);
        java.util.Arrays.sort(departure);

        int platformsNeeded = 0;
        int maxPlatforms = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arrival[i] < departure[j]) {
                platformsNeeded++;
                i++;
                if (platformsNeeded > maxPlatforms) {
                    maxPlatforms = platformsNeeded;
                }
            } else {
                platformsNeeded--;
                j++;
            }
        }
        return maxPlatforms;
    }

    public static void main(String[] args) {
        double[] arrival = { 2.00, 2.10, 3.00, 3.20, 3.50, 5.00 };
        double[] departure = { 2.30, 3.40, 3.20, 4.30, 4.00, 5.20 };

        System.out.println("Minimum platforms needed: " + findPlatform(arrival, departure));
    }
}

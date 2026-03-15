//Given a sorted array A (sorted in ascending order), having N integers, find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.
//For Example: A[] = {10, 20, 35, 50, 75, 80} and the value of X = 110
public class FindPairSum {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 35, 50, 75, 80 };
        int n = arr.length;
        int X = 110;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] == X) {
                System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                return;
            } else if (arr[i] + arr[j] < X)
                i++;
            else
                j--;
        }
        System.out.println("No pair found");
    }
}
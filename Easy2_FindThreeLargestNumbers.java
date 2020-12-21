import java.util.Arrays;

public class Easy2_FindThreeLargestNumbers {
    public void find3largest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int x = 0, count = 1;

        for (int i = 1; i <= n; i++) {

            if (count < 4) {
                if (x != arr[n - i]) {
                    System.out.print(arr[n - i] + " ");
                    x = arr[n - i];
                    count++;
                }
            }
            else {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Easy2_FindThreeLargestNumbers obj = new Easy2_FindThreeLargestNumbers();
        int[] arr = { 12, 45, 1, -1, 45, 54, 23, 5, 0, -10 };
        obj.find3largest(arr);
    }
}

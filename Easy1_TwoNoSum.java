import java.util.Arrays;

public class Easy1_TwoNoSum {
    public static int[] twoSum(int[] arr, int ts) {
        Arrays.sort(arr);
        int lhs = 0, rhs = arr.length - 1;
        while (lhs < rhs) {
            int sum = arr[lhs] + arr[rhs];
            if(sum == ts) {
                return new int[] {arr[lhs] , arr[rhs]};
            }
            else if(sum < ts) {
                lhs++;
            }
            else {
                rhs--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Easy1_TwoNoSum a = new Easy1_TwoNoSum();
        System.out.println(Arrays.toString(twoSum(new int[]{4, 6, 1}, 5)));
    }
}

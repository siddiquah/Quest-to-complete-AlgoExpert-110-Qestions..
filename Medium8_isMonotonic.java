public class Medium8_isMonotonic {
    public boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i+1])
                increasing = false;
            if (A[i] < A[i+1])
                decreasing = false;
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        Medium8_isMonotonic ob = new Medium8_isMonotonic();
        int A[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println(ob.isMonotonic(A));
    }
}

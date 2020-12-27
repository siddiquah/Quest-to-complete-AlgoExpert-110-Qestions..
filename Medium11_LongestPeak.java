public class Medium11_LongestPeak {
    public static int LongestMountain(int a[])
    {
        int i = 0, j = -1, k = -1, p = 0, d = 0, n = 0;
        if (a.length < 3) {
            return 0;
        }
        for(i = 0; i < a.length - 1; i++) {
            if (a[i + 1] > a[i]) {
                if (k != -1) {
                    k = -1;
                    j = -1;
                }
                if (j == -1) {
                    j = i;
                }
            }
            else {
                if (a[i + 1] < a[i]) {
                    if (j != -1) {
                        k = i + 1;
                    }
                    if (k != -1 && j != -1) {
                        if (d < k - j + 1) {
                            d = k - j + 1;
                        }
                    }
                }
                else {
                    k = -1;
                    j = -1;
                }
            }
        }
        if (k != -1 && j != -1) {
            if (d < k - j + 1) {
                d = k - j + 1;
            }
        }
        return d;
    }
    public static void main (String[] args)
    {
        int a[] = { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 };
        System.out.println(LongestMountain(a));
    }
}

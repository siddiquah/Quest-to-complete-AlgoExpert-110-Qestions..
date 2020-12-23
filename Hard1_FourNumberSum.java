import java.util.HashMap;
public class Hard1_FourNumberSum {
    static class pair {
        int first, second;
        public pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    static void findFourElements(int arr[], int n, int X)
    {
        HashMap<Integer, pair> mp = new HashMap<Integer, pair>();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                mp.put(arr[i] + arr[j], new pair(i, j));
            for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (mp.containsKey(X - sum)) {
                    pair p = mp.get(X - sum);
                    if (p.first != i && p.first != j && p.second != i && p.second != j) {
                        System.out.print(arr[i] + ", " + arr[j] + ", " + arr[p.first] + ", " + arr[p.second]);
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = { 10, 20, 30, 40, 1, 2 };
        int n = arr.length;
        int X = 91;
        findFourElements(arr, n, X);
    }
}

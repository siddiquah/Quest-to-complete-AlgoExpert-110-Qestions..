import java.util.HashSet;
import java.util.Set;

public class Medium13_FirstDuplicateValue {
    public static int firstDuplicate(int[] a) {
        Set<Integer> result = new HashSet();
        for(int i=0; i<a.length; i++) {
            if(result.contains(a[i])) {
                return a[i];
            } else {
                result.add(a[i]);
            }
        }
        return -1;
    }
    public static void main (String[] args)
    {
        int a[] = { 2, 1, 5, 2, 3, 3, 4 };
        System.out.println(firstDuplicate(a));
    }
}

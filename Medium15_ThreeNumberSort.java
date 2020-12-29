import java.util.Arrays;

public class Medium15_ThreeNumberSort {
    public static int[] threeNumberSort(int[] a, int[] o) {
        int fv = o[0];
        int sv = o[1];

        int fi = 0;
        int si = 0;
        int ti = a.length-1;

        while(si<=ti) {
            int v = a[si];

            if(v==fv) {
                swap(fi,si,a);
                fi+=1;
                si+=1;
            }
            else if(v==sv) {
                si+=1;
            }
            else {
                swap(si,ti,a);
                ti-=1;
            }
        }
        return a;
    }
    public static void swap(int i, int j, int[] a) {
        int temp = a[j];
        a[j]=a[i];
        a[i]=temp;
    }

    public static void main(String[] args) {
        int[] a= {1, 0, 0, -1, -1, 0, 1, 1};
        int[] o = {0, 1, -1};
        System.out.println(Arrays.toString(threeNumberSort(a, o)));
    }
}

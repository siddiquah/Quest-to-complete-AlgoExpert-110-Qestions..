import java.util.Arrays;

public class MySolutionEasy2_ThirdLargestNumbers {
    public static void main(String[] args) {
        //Finding the third largest no's
        int[] array = {6,8,2,4,3};
        Arrays.sort(array);
        int z = array.length-3;
        System.out.println(array[z]);
    }
}

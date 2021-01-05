import java.util.List;

public class Medium9_MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size()-1;

        while(i < j){

            while( i < j && array.get(j) == toMove)
                j--;
            if(array.get(i) == toMove)
                swap(i,j, array);

            i++;
        }
        return array;
    }

    public static void swap(int i, int j, List<Integer> array ){

        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    public static void main(String[] args) {
        Medium9_MoveElementToEnd obj = new Medium9_MoveElementToEnd();

    }
}

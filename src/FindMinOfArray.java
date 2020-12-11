import java.util.Arrays;

public class FindMinOfArray {
    public static void main(String[] args) {
        int[] array={2,1,4,1,2,3,4,5,4,6,125,3215,213,2};
        System.out.println(findMin(array));

    }
    public static int findMin(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

}

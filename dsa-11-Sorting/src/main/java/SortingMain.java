import java.util.Arrays;

public class SortingMain {

    public static void main(String[] args) {

        int[] numbers = {7,2,4,6,1,9,-1};
        int[] nums = {2,3,4,1};

//        System.out.println(Arrays.toString(BubbleSort.bubbleSort(numbers)));
//        System.out.println(Arrays.toString(SelectionSort.selectionSort(numbers)));
        System.out.println(Arrays.toString(InsertionSort.insertionSort(numbers)));
        System.out.println(Arrays.toString(InsertionSort.insertionSort(nums)));

    }

}

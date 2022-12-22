public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        for (int i=0; i< array.length; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array,j,j+1);
                    swap = true;
                }
            }
            if (!swap) {
                return array;
            }
        }
        return array;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}

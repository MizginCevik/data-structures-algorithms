public class JD1QuickSort {

    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) return; // termination

        int boundary = partition(array, start, end);
        // call it for left part
        quickSort(array,start,boundary-1);
        //call it for right part
        quickSort(array,boundary+1,end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start;

        for (int i = start; i <= end ; i++) {
            if (array[i] <= pivot) {
                swap(array,i,boundary++);
            }
        }
        return boundary-1;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}

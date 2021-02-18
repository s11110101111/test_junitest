package org.example.test_junitest.sobes.algoritms.quicksort;

public class QuickSort {

static void quickSort(int[] arr){
    int low = 0;
    int high = arr.length-1;
        quickSort(arr,low,high);

}
    static void quickSort(int[] array, int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1) {// sort left
            quickSort(array, left, index - 1);
        }
        if (index < right) {// sort right part
            quickSort(array, index, right);

        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2]; //  select  center point
        while (left <= right) {
            //найдем с лева элемент который должен быть с права
            while (array[left] < pivot) left++;
            //найти с права элемент который должен быть с лева
            while (array[right] > pivot) right--;
            //поменять местами индексы left & right
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                right --;
                left ++;
          }

        }
        return left;
    }
}

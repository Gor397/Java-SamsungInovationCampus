public class QuickSort implements Sort {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (array.length == 0){
            return;
        }
        if (low == high){
            return;
        }
        int mid = (low + high)/2;
        int pivot = array[mid];
        int i = low, j = high;

        while(i <= j){
            while(array[i] < pivot){
                ++i;
            }
            while (array[j] > pivot){
                --j;
            }

            if (i <= j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            if (low < j){
                quickSort(array, low, j);
            }

            if (high > i){
                quickSort(array, i, high);
            }
        }
    }
}

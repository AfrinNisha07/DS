public class QuickSort {
    static void quicksort(int arr[], int l, int h) {
        if (l < h) {
            int mid = partition(arr, l, h);
            quicksort(arr, l, mid - 1);
            quicksort(arr, mid + 1, h);
        }
    }
    static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;

        while (i < j) {
            while (i <= h && arr[i] <= pivot) i++;
            while (j >= l && arr[j] > pivot) j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int nums[] = {10, 16, 8, 12, 15, 6, 3, 9, 5};
        quicksort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
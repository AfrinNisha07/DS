public class MergeSort {
    public static void main(String[] args) {
        int[] number = {5, 3, 8, 4, 2, 7, 1, 6};
        int[] sortnumbers = mergeSorted(number);
        for (int num : sortnumbers) {
            System.out.print(num + " ");
        }
    }

    // Recursive merge sort
    public static int[] mergeSorted(int[] number) {
        if (number.length <= 1) return number;

        int mid = number.length / 2;
        int[] left = new int[mid];
        int[] right = new int[number.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = number[i];
        }
        for (int i = mid; i < number.length; i++) {
            right[i - mid] = number[i];
        }

        left = mergeSorted(left);
        right = mergeSorted(right);

        return mergeSortedArray(left, right);
    }

    // Merge two sorted arrays
    public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] newArr = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                newArr[k++] = arr1[i++];
            } else {
                newArr[k++] = arr2[j++];
            }
        }

        while (i < len1) {
            newArr[k++] = arr1[i++];
        }

        while (j < len2) {
            newArr[k++] = arr2[j++];
        }

        return newArr;
    }
}
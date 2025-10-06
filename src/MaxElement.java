public class MaxElement {
        static int findMax(int[] arr, int n) {
            if (n == 1) {
                return arr[0];
            }
            int maxRest = findMax(arr, n - 1);
            return Math.max(arr[n - 1], maxRest);
        }
        public static void main(String[] args) {
            int[] arr = {6, 64, 1, 23, 65, 8, 98, 123, 545, 45, 56, 6};
            int max = findMax(arr, arr.length);
            System.out.println("Maximum element in array: " + max);
        }
}

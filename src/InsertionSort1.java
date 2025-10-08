public class InsertionSort1 {
    public static void main(String[] args) {
        int arr []={8,3,6,2,4,5};
        int a=arr.length;
        for (int i = 1; i < a; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}

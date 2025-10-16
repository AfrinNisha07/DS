public class SortZeroes {
    public static void main(String[] args) {
        int arr[]={0,0,1,0,1,1,2,1,2,1,2,0};
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

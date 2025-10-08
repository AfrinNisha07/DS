public class SelectionSort1 {
    public static void main(String[] args) {
        int arr[]={2,7,4,1,35,6,9,8};
        int a=arr.length;
        for (int i = 0; i < a-1; i++) {
            int minOfindex=i;
            for (int j = i+1; j < a; j++) {
                if (arr[j]<arr[minOfindex]){
                    minOfindex=j;
                }
            }
           int temp=arr[i];
            arr[i]=arr[minOfindex];
            arr[minOfindex]=temp;
        }
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}

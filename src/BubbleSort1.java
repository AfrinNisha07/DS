public class BubbleSort1 {
    public static void main(String[] args) {
        int arr[]={7,6,5,4,3,2};
        int a=arr.length;
        for (int i = 0; i <a-1 ; i++) {
            for (int j = 0; j <a-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }

            }

        }
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}

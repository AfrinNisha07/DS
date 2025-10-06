public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={2,34,6,2,57,8,4};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length-1-i ; j++) {
                int current =arr[j];
                int next =arr[j+1];
                if(current>next){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}

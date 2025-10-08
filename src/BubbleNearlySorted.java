public class BubbleNearlySorted {
    public static void main(String[] args) {
        int arr[]={8,2,35,32,54,56,78,98};
        int a=arr.length;
        for (int i = 0; i <a-1 ; i++) {
            boolean flag=false;
            for (int j = 0; j < a-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
                if (!flag){
                     break;

                }
            }
        }
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}

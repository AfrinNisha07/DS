 public class moveZeroes {
    public static void main(String[] args) {
        int arr[]={0,5,3,0,52};
        int a=arr.length;
        for (int i = 0; i < a-1; i++) {
            for (int j = 0; j <a-1-i ; j++) {
                if (arr[j]==0&&arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int num:arr){
            System.out.print(num+"  ");
        }
    }
}

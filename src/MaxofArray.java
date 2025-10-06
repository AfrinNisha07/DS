public class MaxofArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,1,2,3};
        int ans=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>ans){
                ans=arr[i];
            }

        }
        System.out.println(ans);
    }
}

public class MinofArray {
    public static void main(String[] args) {
        int arr[]={2,3,46,6,8,4,0};
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}

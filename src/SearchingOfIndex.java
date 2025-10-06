public class SearchingOfIndex {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,8,99,5};
       int x=5;
       int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                ans =i;
                break;
            }
            if (ans==-1){
                System.out.println("not found");
            }else {
                System.out.println("found"+x+"at index"+ans);
            }
        }
        System.out.println(ans);

    }
}

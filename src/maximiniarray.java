public class maximiniarray {
    public static void main(String[] args) {
        int [] arr={1,3,4,5,6,1};
        int maxi=arr[0];
        int mini=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>maxi){
                maxi=arr[i];
            }
            if (arr[i]<mini){
                mini=arr[i];
            }
        }
        System.out.println("max element:"+maxi);
        System.out.println("min element:"+mini);

    }
}

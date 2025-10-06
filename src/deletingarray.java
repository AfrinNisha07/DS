public class deletingarray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
       int deleteIndex=5;
        for (int i = deleteIndex; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];

        }
        System.out.println("after deletion of the given index");
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}

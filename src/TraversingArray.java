import java.util.Scanner;
public class TraversingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[3];
        System.out.println("enter the element of array:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
            System.out.println(arr[i]+"  ");

        }

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);

        }
        for (int arrs :arr){
            System.out.println(arr);
        }
        int i=0;
        while (i < 3) {
            System.out.println(arr[i]);
            i++;
        }
    }
}

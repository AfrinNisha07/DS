import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.print(" enter the size of the array");
        int size = sc.nextInt();
        int [] arr =new int[size];
        System.out.println("enter size:"+size+" element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("array element are");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+"  ");

        }
        sc.close();

    }
}

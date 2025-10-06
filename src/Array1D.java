import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print(" enter the size of the row array");
        int size = sc.nextInt();
        System.out.print(" enter the size of the  col array");
        int size1 = sc.nextInt();
        int arr[][]  =new int[size][size1];
        System.out.println("enter row" +size+ " col size "+size1+" element");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("array element are");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(arr[i][j]+"  ");

            }

        }

        sc.close();

    }


}

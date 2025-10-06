public class Inputarray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int s=0;
        int count_even=0;
        System.out.println("element of array :");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int num=arr[i][j];
                s+=num;
                if (num%2==0){
                    count_even++;
                }
                System.out.println(num);
            }

        }
        System.out.println("sum of all element of 2d array is :"+s);
        System.out.println("count of even:"+count_even);
        System.out.println("reverse of 2D array:");
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = arr.length-1; j >=0 ; j--) {
                System.out.println(arr[i][j]);
            }

        }
    }
}

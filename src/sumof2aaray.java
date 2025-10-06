public class sumof2aaray {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{5,6,7},{8,9,4}};
        int [][]arr1={{9,8,4},{7,6,5},{3,2,1}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                int num=arr[i][j]+arr1[i][j];
                sum+=num;

                System.out.println(num);
            }

        }
    }
}

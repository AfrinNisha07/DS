import java.util.Arrays;

public class mergeThreeArray {
    public static int[] mergetwoarray(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int merged[]=new int [n1+n2];
        int i=0,j=0,k=0;
        while (i<n1&&j<n2){
            if (arr1[i]<=arr2[j]){
                merged[k++]=arr1[i++];
            }else {
                merged[k++]=arr2[j++];
            }
        }
        while (i<n1) merged[k++]=arr1[i++];
        while (i<n2) merged[k++]=arr2[j++];
        return merged;
    }
    public static int[] mergethreearray(int arr1[],int arr2[],int [] arr3){
        int [] temp=mergetwoarray(arr1,arr2);
        int [] result=mergetwoarray(temp, arr3);
        return result;
    }
    public static void main(String[] args) {
        int arr1[]= {1, 4, 7};
        int arr2[]={2,5,8};
        int arr3[]={3,6,9};
        int [] mergedArray=mergethreearray(arr1,arr2,arr3);
        System.out.println(Arrays.toString(mergedArray));
    }
}

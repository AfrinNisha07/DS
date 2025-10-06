public class factorialrecursion{
    static int recurSum(int n){
        if(n==0 || n==1)
            return 1;
        return n * recurSum(n-1);
    }

    public static void main(String[] args) {
        int  n=5;
        System.out.println(recurSum(n));
    }
}

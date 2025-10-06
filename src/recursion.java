public class recursion {
    static int fib( int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int term = 10;
        System.out.println(" fibanacci series  :");
        for (int i = 0; i < term; i++) {
            System.out.println(fib(i) + "  ");
        }
    }
}

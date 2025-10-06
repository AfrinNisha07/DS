public class Headtail {
    public static void printntoone(int n){
        if (n <=0) {
            return;
        }else {
            System.out.println(n+"  ");
            printntoone(n-1);

        }
    }
    public static void printoneton(int n) {
        if (n <= 0) {
            return ;
        } else {
            printoneton(n - 1);
            System.out.println(n + "  ");
        }
    }


    public static void main(String[] args) {
        int limit=10;
        printoneton(limit);
        printntoone(limit);
    }
}

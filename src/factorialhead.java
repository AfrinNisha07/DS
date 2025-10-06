public class factorialhead {
  int  go (int n, int a){
        if(n==0){
            return a;
        }
    return go(n-1,n*a); // by  head recursion reduse the time complexity of program
    }
    public static void main(String[] args) {
        factorialhead f=new factorialhead();
        System.out.println(f.go(5,1));
    }
}

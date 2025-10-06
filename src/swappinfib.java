public class swappinfib {
    public static void main(String[] args) {
        int n=10;
        int a=0, b=1;
        for (int i = 2; i <n ; i++) {
            int next =a+b;
            System.out.println(next);
            a=b;
            b=next;

        }
    }
}

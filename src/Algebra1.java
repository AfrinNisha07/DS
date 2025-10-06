 class Algebra {
    int a;
    int b;
    Algebra(int x, int y ){
        a=x;
        b=y;
    }
    int sum(){
        int ans=a+b;
        return ans;
    }
    int sub(){
        return a-b;
    }
    int multi(){
        return a*b;
    }
}
public class Algebra1{
    public static void main(String[] args) {
        Algebra obj=new Algebra( 9,5);
        int ans =obj.sum();
        System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.multi());
    }
}


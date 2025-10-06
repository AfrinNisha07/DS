public class Array {
    void demoarray(){
        int [] ages=new int[3];
        float [] weights =new float[3];
        String [] name=new String[3];
        ages[0]=19;
        name[2]="mirzaaaaa";
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);


    }

    public static void main(String[] args) {
        Array obj=new Array();
        obj.demoarray();

    }
}

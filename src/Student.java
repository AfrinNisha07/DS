public class Student {
    int rollno;
    String Studentname;

    public static void main(String[] args) {
        Student a1 =new Student();
        a1.rollno=19;
        a1.Studentname="afrin";
        System.out.println(a1.Studentname);
        System.out.println(a1.rollno);

        Student a2=new Student();
        a2.rollno=20;
        a2.Studentname="ragib";
        System.out.println(a2.Studentname);
        System.out.println(a2.rollno);
    }
}

package OOPS;

public class StudentUse {
    public static void main(String[] args) throws Exception {

        Student s1=new Student("mohit",20);
//        s1.age=20;
//        s1.name="muskan";

      //  System.out.println(s1.age+" "+s1.name);

        Student s2=new Student();
//        s2.age=22;
//        s2.name="mohit";

       // System.out.println(s2.age+" "+s2.name);

       // s1=s2;

        //System.out.println(s1.age+" "+s1.name);

//        swap(s1,s2);
//        System.out.println(s1.age+" "+s1.name);
//        swap2(s1,s2);
//        System.out.println(s1.age+" "+s1.name);
    }

    private static void swap2(Student s1, Student s2) {
//       int temp=s1.age;
//       s1.age=s2.age;
//       s2.age=temp;
//
//        String str=s1.name;
//        s1.name=s2.name;
//        s2.name=str;

    }

    private static void swap(Student s1, Student s2) {

        Student  temp=s1;
        s1=s2;
        s2=temp;


    }
}

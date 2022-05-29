package OOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentUse2 {
    public static void main(String[] args) throws Exception {
//        Student s1=new Student();
//       s1.setAge(20);
//       s1.setName("Muskan");

        Student s2=new Student();

        try {
            System.out.println("line 1");
            s2.setAge(-20);
            System.out.println("line 3");
        }
        catch (Exception e){
            System.out.println("in catch");
        }
       finally{
            System.out.println("in finally");
        }

        s2.setName("komal");


        s2.setAge(20);

       System.out.println(s2);

    }
}

package OOPS;

public class Student {

    private int age;
    private String name;

    final int MAX_STUDENTS;

    public Student() {
   MAX_STUDENTS=98;

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        MAX_STUDENTS=67;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {

            if (age < 0)
                throw new Exception("age cant be negative");

            this.age = age;



    }



    public void bolneKiPower(String name) {

        System.out.println(this.name+" ke pass bolne ki power hai");

    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

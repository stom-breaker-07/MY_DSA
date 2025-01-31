package MY_DSA.OOPS;

public class oop01 {
    public static class Student{
        String name;
        int rno;
        double percentage;
    }

    public static void main(String[] args) {
       Student s1=new Student();//decleration
       s1.name="Chinmay";
       s1.rno=19;               // Initilizion
       s1.percentage=95.80;
       System.out.print(s1.rno);
    }
}

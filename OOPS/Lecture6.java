public class Lecture6 {
public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Jatin Kumar");
    Student s3 = new Student(38);
    //i have created three constructor s1,2,3 java will choose suitable constructor from the class
}
}

class Student {
    String name;
    int rollno;

    Student() {
        System.out.println("constructor is called..");

    }

    Student(String name) {
        this.name = name;

    }

    Student(int rollno) {
        this.rollno = rollno;
    }
}

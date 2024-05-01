public class Lecture7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "jatin";
        s1.roll = 38;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 0;
        s1.marks[2] = 199;

        //i have created three constructor s1,2,3 java will choose suitable constructor from the class

        Student s2 = new Student(s1);//here i have copied all the properties of s1 into s2
        s2.password = "xyz";
        s1.marks[2] = 100;//but by doing this it changes the value of s1.marks[2] beacuse of reference this is happened because this is an array the whole array is not copied its reference is just copied
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;

    // }

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

    Student() {
        marks = new int[3];

        System.out.println("constructor is called..");

    }

    Student(String name) {
        marks = new int[3];

        this.name = name;

    }

    Student(int rollno) {
        marks = new int[3];

        this.roll = rollno;
    }
}


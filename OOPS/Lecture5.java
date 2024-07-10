public class Lecture5 {
    public static void main(String[] args) {
        Student s1 = new Student("ramprashad");
        System.out.println(s1.name);
    }

}

class Student {
    String name;
    int rollno;

    Student(String name) {
        //in the above line :we can pass argument in the constructor parameter just to intiallize some object in the class
        this.name = name;
        // System.out.println("constructor is called.."); this will give output the constructor is called.. when we just call the constructor
    }
}

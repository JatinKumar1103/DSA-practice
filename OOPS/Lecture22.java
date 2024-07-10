public class Lecture22 {
public static void main(String[] args) {
    Student s1 = new Student();
    s1.schoolName = "jk";

    Student s2 = new Student();
    System.out.println(s2.schoolName);//here i didn't intialize the name of school for s2 but it will print jk because in student class I have defined school as static that why it will work for all 

    Student s3 = new Student();
    s3.schoolName = "kj";
    System.out.println("new school name " + s2.schoolName);//here i have changed the value of schoolname for s3 but the changes will reflect to all the object s1,s2,s3 
   

}
}

class Student {
    String name;
    static String schoolName;
    int roll;

    void setName(String name) {
        this.name = name;

    }

    String getName() {
        return this.name;
    }
}

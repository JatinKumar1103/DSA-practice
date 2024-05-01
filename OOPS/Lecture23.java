public class Lecture23 {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super();//it is used to call immediate parent class due to this animal constructor is called
        super.color = "brown";
        System.out.println("horse constructor is called");//by default java will use super keyword and it will print both animal and horse constructor output

    }
}
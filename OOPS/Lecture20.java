public class Lecture20 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eats();
        h.legs();

    }
//we cannot create object of abstract classes
}

abstract class Animal {
    void eats() {
        System.out.println("eats");
    }

    abstract void legs();
}

class Horse extends Animal {
    void legs()
    {
        System.out.println(4);
    }
    
}

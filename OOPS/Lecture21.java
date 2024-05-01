public class Lecture21 {
public static void main(String[] args) {
    Queen q = new Queen();
    Bear b = new Bear();
    b.eat();
}
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("all direction");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("either vertical or diagonal");
    }
}



//with the help of interfaces we can achieve multiple inheritance 

//example of multiple inheritance 

interface Herbivore {
    void eats();
}

interface Carnivore {
    void eat();
}

class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("eat veg ");
    }

    public void eat() {
        System.out.println("eat non-veg");
    }

    
}

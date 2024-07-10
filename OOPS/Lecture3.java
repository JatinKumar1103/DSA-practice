public class Lecture3 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("yello");
        System.out.println(p1.getColor());
        
    }
}
class Pen {
    //classes are formed by attributes and properties

    //settter and getter are used to modify those objects which are private
    private String color;
    private int tip;

    //these are getters
    String getColor() {
        return this.color;
    }
    int gettip() {
        return this.tip;
    }
    //these are setters

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

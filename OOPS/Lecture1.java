

public class Lecture1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");//to change the property we do this
        System.out.println(p1.color);
        p1.color = "red";//we can also the property like this 
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "jatin";
        myAcc.setPassword("jatinkumar");
        System.out.println(myAcc.username);
        // System.out.println(myAcc.password);//this cannot be access because password is in private class
    }
}
//always write classes after the public class
class Pen {
    //classes are formed by attributes and properties
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

//Lecture2
class BankAccount {
    public String username;
    private String password;

public void setPassword(String pwd){
    password = pwd;
    }
}

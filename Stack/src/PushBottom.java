import java.util.Stack;

public class PushBottom {
    public static void pushAtBottom(Stack<Integer> s ,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    //reverseStack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop ());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

//        pushAtBottom(st,4);
//       printStack(st); // because in the process of recursion it got empty that why when i am again calling it shows me nothing
       reverseStack(st);
       printStack(st);
    }
}

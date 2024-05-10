import java.util.Stack;

public class GreatestNumberStr {
    public static String findElement(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> s = new Stack<>();

        for (char ch : str.toCharArray()) {
            while (!s.isEmpty() && s.peek() < ch) {
                sb.insert(0, s.pop());  // Insert at the beginning to maintain correct order
            }
            s.push(ch);
        }

        while (!s.isEmpty()) {
            sb.insert(0, s.pop());  // Insert at the beginning to maintain correct order
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "6126";
        System.out.println(findElement(str));  // Output: 654
    }
}

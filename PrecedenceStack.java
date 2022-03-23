import java.util.Stack;

public class PrecedenceStack {
    public static int precedence(char operator) {
        switch (operator) {
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void infixToPostfix(String expression) {
        String result = new String("");
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isAlphabetic(c)) {
                result += c;
            } else if (c == '(') {
                s.push(c);
            } else if (c == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    result += s.pop();
                }
                s.pop();
            } else {
                while (!s.isEmpty() && precedence(c) <= precedence(s.peek())) {
                    result += s.pop();
                }
                s.push(c);
            }
        }

        while (!s.isEmpty()) {
            result += s.pop();
        }
        System.out.println(result);
    }
}

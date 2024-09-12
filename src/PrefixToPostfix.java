import java.util.Stack;

   public class PrefixToPostfix {
    public static String convert(String prefix) {
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                stack.push(operand1 + operand2 + ch);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix = "+ * a b - c d";
        String postfix = convert(prefix);
        System.out.println("Prefix: " + prefix);
        System.out.println("Postfix: " + postfix);
    }
}
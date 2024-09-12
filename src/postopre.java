import java.util.Stack;

  public class PostfixToPrefix {
    public static String convert(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                stack.push(ch + operand2 + operand1);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "ab*cd- +";
        String prefix = convert(postfix);
        System.out.println("Postfix: " + postfix);
        System.out.println("Prefix: " + prefix);
    }
}

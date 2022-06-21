import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String sentence = br.readLine();
            Stack<Character> stack = new Stack<>();
            if (sentence.equals(".")) break;

            for (int j=0; j < sentence.length(); j++) {
                char c = sentence.charAt(j);

                if (c == '.') {
                    break;
                }
                if (c == '(' || c == '[') {
                    stack.push(c);
                }
                if (c == ')') {
                    if (stack.peek() == '('){
                        stack.pop();
                        break;
                    }
                }
                if (c == ']'){
                    if (stack.peek() == '['){
                        stack.pop();
                        break;
                    }
                }
            }
            String answer = "no";
            if(stack.empty()){
                answer = "yes";
            }
            System.out.println(answer);

        }
    }
}

import java.util.Stack;

public class lib {
    public void a(){
        Stack<String> stacks = new Stack<>();
        String[] word = new String[]{"a", "b", "c", "d", "e", "f"};
        for (int i = 0; i < word.length; i++) {
            stacks.pop();
        }
        System.out.println(stacks);



    }
}

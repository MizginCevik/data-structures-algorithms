import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack {

    public static void main(String[] args) {

        Deque<Integer> cStack = new LinkedList<>();
        cStack.push(1); //add first
        cStack.push(2);
        cStack.push(3);
        System.out.println(cStack.peek()); //get first
        System.out.println(cStack.pop()); //remove and print first
        System.out.println("peek is: " + cStack.peek()); //3 is removed from top

    }
}

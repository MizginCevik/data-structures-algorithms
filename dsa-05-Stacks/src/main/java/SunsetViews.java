import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {

    public static void main(String[] args) {

        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings, "West").forEach(System.out::println);
    }

    private static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        Stack<Integer> stack = new Stack<>(); //stack to hold building indices that can see sunset
        // this part is for EAST by default
        int i=0;
        int step=1; //step is for visiting buildings with index number

        // this part is for WEST
        if (direction.equalsIgnoreCase("west")){
            i=buildings.length-1;
            step=-1;
        }

        while (i >= 0 && i < buildings.length) {
            //current building height is taller than peek or not? if it is pop it(peak one).
            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
            i+=step; //increasing i with step because of shifting to next index
        }

        // now I have a stack with the building indices that can see sunset
        if (direction.equalsIgnoreCase("west")){
            Collections.reverse(stack);
        }

        return new ArrayList<Integer>(stack);
    }
}

//reverse complexity is O(n)
//sort complexity is O(nlogn)

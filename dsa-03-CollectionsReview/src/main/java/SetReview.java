import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        //1. create a set
        Set<Student> set = new HashSet<>();

        //2. add element
        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary")); // duplicates are not allowed

        System.out.println(set);

        Set<Student> linkedSet = new LinkedHashSet<>(); // keeps the insertion order
        linkedSet.add(new Student(1, "Jack"));
        linkedSet.add(new Student(2, "Julia"));
        linkedSet.add(new Student(4, "Mary"));
        linkedSet.add(new Student(3, "Mike"));
        linkedSet.add(new Student(4, "Susan"));

        System.out.println(linkedSet);

        // Task:
        String st = "Java Developer";
        System.out.println(firstRepeatingChar(st));

    }

    public static Character firstRepeatingChar(String str) { // time complexity O(n)
        // create a hashSet
        Set<Character> chars = new HashSet<>(); // in here I have Space Complexity of O(n)

        // iterate over the char array and add chars into hashSet
        for (Character ch : str.toCharArray()) {
            if (!chars.add(ch)) { // if add ops is false return that char
                return ch;
            }
        }
        return null;
    }

}

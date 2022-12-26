import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {

    public static void main(String[] args) {
        // create hash map
        Map<Integer,String> studentsMap = new HashMap<>();
        // add element
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia"); // with key, I can access the value

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(2));

        // Task:
        String st = "JJavvaDevelloopperr";
        System.out.println(findFirstNonRepeating(st));
    }

    public static Character findFirstNonRepeating(String str) { // time complexity O(n)
        // create a map : this will cost me space complexity O(n)
        Map<Character,Integer> map = new HashMap<>();
        int count;
        // count the frequency of chars
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }
        // start from the beginning and check if there is a char with frequency 1
        for (Character ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }

}

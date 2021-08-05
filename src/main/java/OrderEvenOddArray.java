import java.util.Collections;
import java.util.List;

public class OrderEvenOddArray {

    public static List<Integer> order(List<Integer> unordered) {
        int nextEven = 0;
        int nextOdd = unordered.size() - 1;
        while(nextEven < nextOdd) {
            if (unordered.get(nextEven) % 2 == 0) {
                nextEven++;
            } else {
                Collections.swap(unordered, nextEven, nextOdd);
                nextOdd--;
            }
        }
        return unordered;
    }
}

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderEvenOddArrayTest {

    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        System.out.println(OrderEvenOddArray.order(list));
    }
}

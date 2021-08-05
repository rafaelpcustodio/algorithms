import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DutchFlagTest {

    @Test
    public void firstTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(2);
        DutchFlag.execute(list, 2);
    }
}

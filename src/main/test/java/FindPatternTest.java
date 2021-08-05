import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindPatternTest {
    @Test
    public void firstExample() {
        String pattern = "abr";
        String string = "abraaadsaeabr";
        FindPattern findPattern = new FindPattern();
        List<Integer> ints = findPattern.find(pattern, string);
        Assert.assertEquals(Integer.valueOf(0), ints.get(0));
        Assert.assertEquals(Integer.valueOf(10), ints.get(1));
    }

    @Test
    public void secondExample() {
        String pattern = "a";
        String string = "aaaaaaaa";
        FindPattern findPattern = new FindPattern();
        List<Integer> ints = findPattern.find(pattern, string);
        Assert.assertEquals(Integer.valueOf(0), ints.get(0));
        Assert.assertEquals(Integer.valueOf(1), ints.get(1));
        Assert.assertEquals(8, ints.size());
    }

    @Test
    public void thirdExample() {
        String pattern = "ab";
        String string = "ababababababaab";
        FindPattern findPattern = new FindPattern();
        List<Integer> ints = findPattern.find(pattern, string);
        Assert.assertEquals(Integer.valueOf(0), ints.get(0));
        Assert.assertEquals(Integer.valueOf(2), ints.get(1));
        Assert.assertEquals(7, ints.size());
    }

    @Test
    public void fourthExample() {
        String pattern = "ab";
        String string = "aaaaaaaaaaaaab";
        FindPattern findPattern = new FindPattern();
        List<Integer> ints = findPattern.find(pattern, string);
        Assert.assertEquals(Integer.valueOf(12), ints.get(0));
        Assert.assertEquals(1, ints.size());
    }

    @Test
    public void fifthExample() {
        String pattern = "123456789";
        String string = "123456789";
        FindPattern findPattern = new FindPattern();
        List<Integer> ints = findPattern.find(pattern, string);
        Assert.assertEquals(Integer.valueOf(0), ints.get(0));
        Assert.assertEquals(1, ints.size());
    }

    @Test
    public void sixthExample() {
        String pattern = "123456789";
        String string = "12345678";
        FindPattern findPattern = new FindPattern();
        List<Integer> ints = findPattern.find(pattern, string);
        Assert.assertNull(ints);
    }

    @Test
    public void cornerCaseOne() {
        String pattern = "";
        String string = "abraaadsaeabr";
        FindPattern findPattern = new FindPattern();
        List<Integer> ints = findPattern.find(pattern, string);
        Assert.assertNull(ints);
    }

    @Test
    public void cornerCaseTwo() {
        String pattern = "abr";
        String string = "";
        FindPattern findPattern = new FindPattern();
        List<Integer> ints = findPattern.find(pattern, string);
        Assert.assertNull(ints);
    }
}

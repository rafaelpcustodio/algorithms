import org.junit.Test;

public class CountBitsTest {

    @Test
    public void firstTest() {
        CountBits countBitsTest = new CountBits();
        short answer = countBitsTest.countBits(10);
        System.out.println(answer);
    }
}

import org.junit.Test;

public class ParityTest {

    @Test
    public void firstTest() {
        Parity p = new Parity();
        int answer = p.find(10L);
        System.out.println(answer);
    }
}

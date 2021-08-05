import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IpAddressPossibilitiesTest {
    @Test
    public void firstCase() {
        String number = "2542540123";
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("254.25.40.123");
        expectedResult.add("254.254.0.123");
        IpAddressPossibilities ipAddressPossibilities = new IpAddressPossibilities();
        List<String> result = ipAddressPossibilities.find(number);
        Assert.assertEquals(expectedResult.get(0), result.get(0));
        Assert.assertEquals(expectedResult.get(1), result.get(1));
    }
}

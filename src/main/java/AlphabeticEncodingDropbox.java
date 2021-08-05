import java.util.HashMap;
import java.util.Map;

public class AlphabeticEncodingDropbox {
    public String encode(int number) {
        Map<Integer, String> map = generateMapNumberToLetter();
        System.out.println(map);
        StringBuilder sb = new StringBuilder();
        if(number < 1) {
            return null;
        }
        if(number <= 26) {
            return map.get(number);
        } else {
            int received = number;
            int count = 0;
            while(received > 26 || count == 0) {
                received = (received / 26);
                count++;
            }
            if(count >= 26) {
                while(count > 26) {
                    count = count - 26;
                    sb.append("A");
                }
            } else {
                sb.append(map.get(received));
            }
            sb.append(map.get(received % 26));
        }
        return sb.toString();
    }

    private Map<Integer, String> generateMapNumberToLetter() {
        Map<Integer,String> map = new HashMap<>();
        for (int i = 1; i < 27 ; i++) {
            map.put(i, "" + (char) ('A' + i - 1) );
        }
        return map;
    }
}

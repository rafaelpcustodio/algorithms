import java.util.ArrayList;
import java.util.List;

public class IpAddressPossibilities {
    public List<String> find(String number) {
        if (number.length() < 4) {
            return null;
        }
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;
        List<Integer> tempAns = new ArrayList<>();
        for (int i = 0; i < number.length() ; i++) {
            int tempNumb = Integer.parseInt(number.substring(0, i));
            if(tempNumb < 255) {
                tempAns.add(tempNumb);
            }
        }
        return null;
    }

}

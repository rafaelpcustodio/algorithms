import java.util.ArrayList;
import java.util.List;

public class FindPattern {
    public List<Integer> find(String pattern, String find) {
        if(pattern == null || pattern.length() == 0 || find == null || find.length() == 0) return null;
        if(pattern.length() > find.length())return null;
        List<Integer> answer = new ArrayList<>();
        for (int k = 0 ; k < find.toCharArray().length; k++) {
            if(find.charAt(k) == pattern.charAt(0)) {
                for(int l = 0; l < pattern.length(); l++) {
                    if(find.charAt(k+l) == pattern.charAt(l) && l == pattern.length() - 1) {
                        answer.add(k);
                    }
                }
            }
        }
        return answer;
    }

}

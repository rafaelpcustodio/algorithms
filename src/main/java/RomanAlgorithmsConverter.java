import java.util.HashMap;
import java.util.Map;

public class RomanAlgorithmsConverter {
    public Integer convert(final String numberToConvert) {
        int answer = 0;
        for (int i = 0; i < numberToConvert.length() ; i++) {
            String currentValue = String.valueOf(numberToConvert.charAt(i));
            if(i != numberToConvert.length() - 1 &&
                    mapperRoman(currentValue.toUpperCase()) < mapperRoman(String.valueOf(numberToConvert.charAt(i+1)).toUpperCase())) {
                answer = answer +
                        (mapperRoman(String.valueOf(numberToConvert.charAt(i+1)).toUpperCase()) -
                                (mapperRoman(currentValue.toUpperCase())));
                i++;
            } else {
                answer = answer + mapperRoman(currentValue.toUpperCase());
            }
        }
        return answer;
    }

    private Integer mapperRoman(String romanNumber) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        return map.get(romanNumber);
    }

}

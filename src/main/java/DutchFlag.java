import java.util.Collections;
import java.util.List;

public class DutchFlag {
    public static void execute(List<Integer> list, int index) {
        
        int pivot = list.get(index);
        here: for (int i = 0 ; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if(list.get(j) <= pivot) {
                    Collections.swap(list, i, j);
                    System.out.println(list);
                    System.out.println("first");
                }
                if(j == list.size() - 1) {
                    break here;
                }
            }
        }
        pivot = list.get(list.size()-1);
        for (int i = list.size() - 2 ; i >= 0; i--) {
            for (int j = list.size() - 3; j >= 0; j--) {
                if(list.get(j) == pivot) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}

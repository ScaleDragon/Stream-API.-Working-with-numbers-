package HomeWork.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        List<Integer> inList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < inList.size(); i++) {
            if (inList.get(i) > 0) {
                if (inList.get(i) % 2 == 0) {
                    resultList.add(inList.get(i));
                }
                Collections.sort(inList);
            }
        }
        System.out.println(resultList);
    }
}

package t1;  // ← required by your exam

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class first_task {

    /**
     * Generates the third list by using each integer in firstList (1-based)
     * as an index into secondList (which is 0-based internally).
     *
     * @param firstList  List of Integer indices (1 = first element of secondList)
     * @param secondList List of String values
     * @return a new List<String> where each element is secondList.get(index-1)
     */
    public static List<String> generateThirdList(List<Integer> firstList, List<String> secondList) {
        List<String> thirdList = new ArrayList<>(firstList.size());
        for (Integer oneBasedIdx : firstList) {
            if (oneBasedIdx == null || oneBasedIdx < 1 || oneBasedIdx > secondList.size()) {
                throw new IndexOutOfBoundsException(
                        "Invalid 1-based index " + oneBasedIdx +
                                " for secondList of size " + secondList.size()
                );
            }
            thirdList.add(secondList.get(oneBasedIdx - 1));
        }
        return thirdList;
    }

    public static void main(String[] args) {
        List<Integer> firstList  = Arrays.asList(1, 5, 3, 2, 4);
        List<String>  secondList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> thirdList = generateThirdList(firstList, secondList);

        System.out.println("First list (1-based indices): " + firstList);
        System.out.println("Second list (values):        " + secondList);
        System.out.println("Resulting third list:        " + thirdList);
    }
}

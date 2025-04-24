package t1;  // ← required by your exam
// This line specifies the package name "t1" for this Java class.
// Packages are used to organize related classes together.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// These import statements bring in necessary classes from the Java Collections Framework.
// ArrayList: Implementation of a dynamic array that can grow as needed.
// Arrays: Utility class for array operations, including converting arrays to Lists.
// List: Interface that defines the basic operations for ordered collections.

public class first_task {
// This declares a public class named "first_task" that can be accessed from other packages.
// The class name matches the filename (first_task.java).

    /**
     * Generates the third list by using each integer in firstList (1-based)
     * as an index into secondList (which is 0-based internally).
     *
     * @param firstList  List of Integer indices (1 = first element of secondList)
     * @param secondList List of String values
     * @return a new List<String> where each element is secondList.get(index-1)
     */
    // This is a Javadoc comment that documents the purpose and behavior of the method.
    // It explains the parameters and return value, which helps other developers understand the code.
    
    public static List<String> generateThirdList(List<Integer> firstList, List<String> secondList) {
    // This method:
    // - Is public (can be called from other classes)
    // - Is static (can be called without creating a class instance)
    // - Returns a List of Strings
    // - Takes two parameters: a List of Integers and a List of Strings
        
        List<String> thirdList = new ArrayList<>(firstList.size());
        // Creates a new ArrayList to store the result.
        // The constructor is given firstList.size() as an initial capacity,
        // which is an optimization to avoid multiple internal array resizings.
        
        for (Integer oneBasedIdx : firstList) {
        // This enhanced for loop iterates through each Integer in firstList.
        // "oneBasedIdx" is a variable that will hold each value in turn.
            
            if (oneBasedIdx == null || oneBasedIdx < 1 || oneBasedIdx > secondList.size()) {
            // This conditional checks for three error conditions:
            // 1. The index is null (possible since we're using Integer objects, not primitive ints)
            // 2. The index is less than 1 (invalid for a 1-based index system)
            // 3. The index is greater than the size of secondList (would cause an out-of-bounds error)
                
                throw new IndexOutOfBoundsException(
                        "Invalid 1-based index " + oneBasedIdx +
                                " for secondList of size " + secondList.size()
                );
                // If any of the error conditions are true, throws an exception with a detailed message.
                // This helps debugging by providing information about what went wrong.
            }
            
            thirdList.add(secondList.get(oneBasedIdx - 1));
            // If the index is valid:
            // 1. Subtract 1 to convert from the 1-based index to Java's 0-based indexing
            // 2. Use that index to get a value from secondList
            // 3. Add that value to thirdList
        }
        
        return thirdList;
        // After processing all indices, return the completed thirdList
    }

    public static void main(String[] args) {
    // The main method is the entry point of the program when it's executed.
    // It demonstrates how to use the generateThirdList method.
        
        List<Integer> firstList  = Arrays.asList(1, 5, 3, 2, 4);
        // Creates a List of Integer values containing 1, 5, 3, 2, 4.
        // These will be used as 1-based indices into secondList.
        
        List<String>  secondList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        // Creates a List of String values containing fruit names.
        // These are the values that will be selected by the indices.

        List<String> thirdList = generateThirdList(firstList, secondList);
        // Calls the generateThirdList method with our two lists.
        // The result will be stored in thirdList.

        System.out.println("First list (1-based indices): " + firstList);
        // Prints the first list, which contains the indices.
        
        System.out.println("Second list (values):        " + secondList);
        // Prints the second list, which contains the values to be selected.
        
        System.out.println("Resulting third list:        " + thirdList);
        // Prints the third list, which contains the selected values.
        // Based on the indices, this will be: ["apple", "elderberry", "cherry", "banana", "date"]
    }
}

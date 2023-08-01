//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?h_r=next-challenge&h_v=zen

/*
An array is a simple data structure used to store a collection of data in a contiguous block of memory. Each element in the collection is accessed using an index, and the elements are easy to find because they're stored sequentially in memory.

Because the collection of elements in an array is stored as a big block of data, we typically use arrays when we know
 exactly how many pieces of data we're going to have. For example, you might use an array to store a list of student
 ID numbers, or the names of state capitals. To create an array of integers named myArray that can hold four integer
 values, you would write the following code:
 int[] myArray = new int[4];
 This sets aside a block of memory that's capable of storing 4 integers. Each integer storage cell is assigned a
 unique index ranging from 0 to one less than the size of the array, and each cell initially contains a 0. In the case
 of myArray, we can store integers at indices 0, 1, 2, and 3. Let's say we wanted the last cell to store the number
 12; to do this, we write:
 myArray[3] = 12;

 Write the following code in the unlocked portion of your editor:

 -> Create an array, a, capable of holding n integers.
 -> Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. For
    example, the first value must be stored in a0, the second value must be stored in a1, and so on.
 */
import java.util.*;

public class Java1DArray {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    // Using IntStream to populate the array
//    Arrays.setAll(a, i -> scan.nextInt());
    for(int i =0; i< a.length; i++){
      a[i] = scan.nextInt();
    }
    scan.close();

    // Prints each sequential element in array a
    for (int j : a) {
      System.out.println(j);
    }
  }
}

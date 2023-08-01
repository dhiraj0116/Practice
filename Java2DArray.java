//https://www.hackerrank.com/challenges/java-2d-array/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
/*
  You are given a 6*6 2D array. An hourglass in an array is a portion shaped like this:
  a b c
    d
  e f g

  For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
  1 1 1 0 0 0
  0 1 0 0 0 0
  1 1 1 0 0 0
  0 0 0 0 0 0
  0 0 0 0 0 0
  0 0 0 0 0 0

  Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
  1 1 1     1 1 0     1 0 0
    1         0         0
  1 1 1     1 1 0     1 0 0
  The sum of an hourglass is the sum of all the numbers within it.
  The sum for the hourglasses above are 7, 4, and 2, respectively.
  In this problem you have to print the largest sum among all the hourglasses in the array.

  Sample Input

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 2 4 4 0
    0 0 0 2 0 0
    0 0 1 2 4 0

    Sample Output: 19
    Explanation:
    The hourglass which has the largest sum is:
    2 4 4
      2
    1 2 4
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Java2DArray {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, 6).forEach(i -> {
      try {
        arr.add(
          Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });
//    int maxHourGlassSum = IntStream.range(0, 4).flatMap(i -> IntStream.range(0, 4).map(
//      j -> arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) +
//        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2))).max().orElse(0);
    int maxHourGlassSum = Integer.MIN_VALUE;
    for(int i = 0; i<4; i++){
      for(int j =0; j<4; j++){
        int currentSum = arr.get(i).get(j) + arr.get(i).get(j+1)
          + arr.get(i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j)
          + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
        if(currentSum > maxHourGlassSum) {
          maxHourGlassSum = currentSum;
        }
      }
    }
    System.out.println(maxHourGlassSum);
    bufferedReader.close();
  }
}


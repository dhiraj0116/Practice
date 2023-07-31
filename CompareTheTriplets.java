//https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=false

/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

-> If a[i] > b[i], then Alice is awarded 1 point.
-> If a[i] < b[i], then Bob is awarded 1 point.
-> If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.

Example

a = [1, 2, 3]
b = [3, 2, 1]
-> For elements *0*, Bob is awarded a point because a[0] .
-> For the equal elements a[1] and b[1], no points are earned.
-> Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.

Function Description

Complete the function compareTriplets in the editor below.

compareTriplets has the following parameter(s):

-> int a[3]: Alice's challenge rating
-> int b[3]: Bob's challenge rating
Return

-> int[2]: Alice's score is in the first position, and Bob's score is in the second.

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

class CompareTheTripletsResult {

  /*
   * Complete the 'compareTriplets' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */

  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int alicePoint = (int) IntStream.range(0, a.size())
      .filter(i -> a.get(i) > b.get(i))
      .count();

    int bobPoint = (int) IntStream.range(0, a.size())
      .filter(i -> a.get(i) < b.get(i))
      .count();

    List<Integer> list = new ArrayList<>();
    list.add(alicePoint);
    list.add(bobPoint);
    return list;
  }

 /*
  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int alicePoint = 0;
    int bobPoint = 0;
    List<Integer> list = new ArrayList<> ();
    for (int i = 0; i<a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        alicePoint++;
      } else if (a.get(i) < b.get(i)) {
        bobPoint++;
      }
    }
    list.add(alicePoint);
    list.add(bobPoint);
    return list;
  }
  */

}

public class CompareTheTriplets {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Integer::parseInt)
      .collect(toList());

    List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Integer::parseInt)
      .collect(toList());

    List<Integer> result = CompareTheTripletsResult.compareTriplets(a, b);

    bufferedWriter.write(
      result.stream()
        .map(Object::toString)
        .collect(joining(" "))
        + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();
  }
}


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void plusMinus(List<Integer> arr) {
      // Write your code here
      int posInputs = 0;
      int negInputs = 0;
      int zeroInputs = 0;
      float n = arr.size();
      for (Integer integer : arr) {
        if (integer > 0){
          posInputs++;
        }
        else if(integer < 0){
          negInputs++;
        }
        else{
          zeroInputs++;
        }
      }
      String PositiveResults = String.format("%1.6f", posInputs/n);
      String NegativeResults = String.format("%1.6f", negInputs/n);
      String zeroresults = String.format("%1.6f", zeroInputs/n);

      System.out.println(PositiveResults);
      System.out.println(NegativeResults);
      System.out.println(zeroresults);
    }
  }


public class PlusMinus
{
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Integer::parseInt)
      .collect(toList());

    Result.plusMinus(arr);

    bufferedReader.close();
  }
}


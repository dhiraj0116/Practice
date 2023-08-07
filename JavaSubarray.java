/*
https://www.hackerrank.com/challenges/java-negative-subarray/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

    count = 5
    Array = 1 -2 4 -5 1
    Total negative sub array = 9
    Sub array example: 1 -2 4 -5 1, 1 -2 4 -5 ,1 -2 4, 1 -2, -2 4 -5 1, -2 4 -5, -2 4,etc
 */
import java.io.*;
import java.util.*;

public class JavaSubarray {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];

    for(int i =0; i< n; i++){
      arr[i] = scanner.nextInt();
    }

    scanner.close();
    int negative_subarray = 0;
    for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
        int current_sum = 0;
        for(int k =i; k<=j; k++){
          current_sum += arr[k];
        }
        if(current_sum < 0){
          negative_subarray++;
        }
      }
    }
    System.out.println(negative_subarray);
  }
}

//Write a function to print the sum of all odd numbers from 1 to n.

package practice;

import java.util.Scanner;

public class Practice2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;

    for(int i=1; i<=n ;i++) {
      if ( i%2 != 0) {
        System.out.println(i);
        sum = sum + i;
      }
    }
    System.out.println("the sum of all odd no.s:" + sum);
  }
}

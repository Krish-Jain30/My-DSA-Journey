//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

package practice;
import java.util.Scanner;

public class Practice5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if ( age>=18 ) {
      System.out.println("Adult : Eligible to vote");
    } else {
      System.out.println("NOT Eligible to vote");
    }
  }
  
}

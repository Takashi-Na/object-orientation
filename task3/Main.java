package task3;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("開始：");
    int start = scanner.nextInt();

    System.out.print("終了：");
    int last = scanner.nextInt();

    scanner.close();

    for (int num = start; num <= last; num++) {
      if (num % 3 == 0 && num % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (num % 3 == 0) {
        System.out.println("Fizz");
      } else if (num % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(num);
      }
    }
  }
}

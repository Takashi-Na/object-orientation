import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    while (true) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Input >");
      // .replaceで半角スペースを削除
      String inputNum = scanner.nextLine().replace(" ", "");

      // .splitで","を区切りにして配列:arrayNumに格納
      String[] arrayNum = inputNum.split(",", 0);

      try {

        // 配列:arrayNumをint型に変換
        for (int i = 0; i < arrayNum.length; i++) {
          Integer.parseInt(arrayNum[i]);
        }

        // 昇順にソート
        Arrays.sort(arrayNum);

        // 配列:arrayを表示
        System.out.print("Output >");
        for (int i = 0; i < arrayNum.length; i++) {
          System.out.print(arrayNum[i]);
          if (i != arrayNum.length - 1) {
            System.out.print(",");
          }
        }
        // 例外処理
      } catch (NumberFormatException e) {
        System.out.println("「0-9」、「,」で入力してください");
        continue;
      }
      scanner.close();
      break;
    }
  }
}
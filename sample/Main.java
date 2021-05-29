import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    while (true) {
      Scanner scanner = new Scanner(System.in);
      int[] arrayScoreInt = new int[17];
      int[] parScore = { 4, 4, 3, 4, 5, 4, 5, 3, 4, 4, 3, 4, 5, 4, 3, 4, 5, 4 };

      try {
        // 読み取り
        System.out.print("Input >");
        String inputScore = scanner.nextLine().replace(" ", "");
        String[] arrayScore = inputScore.split(",", 0);

        // String型をint型に変換
        for (int i = 0; i < arrayScore.length; i++) {
          arrayScoreInt[i] = Integer.parseInt(arrayScore[i]);
        }

        // スコア計算
        int totalScore = 0;
        for (int i = 0; i < arrayScore.length; i++) {
          int holeScore = arrayScoreInt[i] - parScore[i];
          totalScore += holeScore;
        }

        // 表示
        System.out.println("Output >" + (arrayScore.length) + "ホール終了して" + totalScore);

        // 例外処理
      } catch (NullPointerException e) {
        System.out.println("Please re-enter");
      }
      scanner.close();
      break;
    }
  }
}

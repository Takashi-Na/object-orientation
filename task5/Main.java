import java.util.Scanner;

class Player {

  String name;
  int[] score;
  int result;

  Player(String name, int[] score) {
    this.name = name;
    this.score = score;
    this.result = 0;
  }
}

public class Main {
  public static void main(String[] args) {
    int[] parScore = {4, 4, 3, 4, 5, 4, 5, 3, 4, 4, 3, 4, 5, 4, 3, 4, 5, 4};

    // 入力
    System.out.print("Input >");
    String[] data = arrayInputLine();

    Player player1 = new Player(data[0], strToInt(data, 1));
    Player player2 = new Player(data[1], strToInt(data, 2));

    player1.result = result(player1.score, parScore);
    player2.result = result(player2.score, parScore);

    // 表示
    printResult(player1, player2);
  }

  // 入力をStringで保存し、「,」区切りで配列に格納
  public static String[] arrayInputLine() {
    while (true) {
      try {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().replace(" ", "");
        scanner.close();
        String[] arrayData = str.split(",");
        if (arrayData.length == 38) {
          return arrayData;
        }

      } catch (NullPointerException e) {
        continue;
      }
    }
  }


  // 配列を、str型→int型に変更する
  public static int[] strToInt(String strList[], int player) {
    int[] score = new int[18];

    if (player == 1) {
      for (int i = 2; i < 20; i++) {
        score[i - 2] = Integer.parseInt(strList[i]);
      }
    } else {
      for (int i = 20; i < 38; i++) {
        score[i - 20] = Integer.parseInt(strList[i]);
      }
    }
    return score;
  }

  // ScoreをparScoreと比較し計算する
  public static int result(int[] score, int[] parScore) {
    int result = 0;

    for (int i = 0; i < score.length; i++) {
      result += (score[i] - parScore[i]);
    }
    return result;
  }

  // player同士のScoreの比較
  public static boolean judge(int player1Result, int player2Result) {
    return player1Result < player2Result;
  }

  // Score表示の際の符号追記
  public static String judgePosi(Player p) {
    if (p.result == 0) {
      return "+=" + String.valueOf(p.result);
    } else if (p.result > 0) {
      return "+" + String.valueOf(p.result);
    } else {
      return String.valueOf(p.result);
    }
  }

  // result表示
  public static void printResult(Player player1,Player player2) {
    System.out.println("name\tscore");
    System.out.println(player1.name + "\t" + judgePosi(player1));
    System.out.println(player2.name + "\t" + judgePosi(player2));
    if (judge(player1.result, player2.result)) {
      System.out.println(player1.name + "の勝利です");
    } else {
      System.out.println(player2.name + "の勝利です");
    }
  }

  // 再入力表示
  public static void reEnrter() {
    System.out.println("入力し直してください");
    System.out.println("Input >");
  }

}
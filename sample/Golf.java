class Golf {
  private int score;
  private int totalScore = 0;
  private int[] parScore = { 4, 4, 3, 4, 5, 4, 5, 3, 4, 4, 3, 4, 5, 4, 3, 4, 5, 4 };

  Golf(int score, int totalScore) {
    this.score = score;
    this.totalScore = totalScore;
  }

  public void inputScore() {
    while (true) {
      try {
        
      } catch (Exception e) {
        //TODO: handle exception
      }
    }
  }

  public void setScore() {
    
  }

  public void scoreCalc() {
    
  }

  public void printScore() {
    System.out.println("Output >" + "(ホール数)" + "ホール終了して" + totalScore);
  }
}
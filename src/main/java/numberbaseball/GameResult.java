package numberbaseball;

public class GameResult {
    private int strikeCount;  // 스트라이크 개수
    private int ballCount;    // 볼 개수

    public GameResult() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }

    public void incrementCount(String result) {
        if (result.equals("STRIKE")) {
            strikeCount++;
        } else if (result.equals("BALL")) {
            ballCount++;
        }
    }

    public boolean isGameOver() {
        return strikeCount == 3;
    }
}
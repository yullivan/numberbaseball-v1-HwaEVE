package numberbaseball;

public class Balls {

    Ball ball1;
    Ball ball2;
    Ball ball3;

    public Balls(Ball ball1, Ball ball3, Ball ball2) {
        this.ball1 = ball1;
        this.ball3 = ball3;
        this.ball2 = ball2;
    }

    String matchStatus(Ball other) {
        if (ball1.getNumber() == other.getNumber() && ball1.getPosition() == other.getPosition()) {
            return "STRIKE";
        } else if (ball1.getNumber() == other.getNumber()) {
            return "BALL";
        } else if (ball2.getNumber() == other.getNumber() && ball2.getPosition() == other.getPosition()) {
            return "STRIKE";
        } else if (ball2.getNumber() == other.getNumber()) {
            return "BALL";
        } else if (ball3.getNumber() == other.getNumber() && ball3.getPosition() == other.getPosition()) {
            return "STRIKE";
        } else if (ball3.getNumber() == other.getNumber()) {
            return "BALL";
        }
        return "NOTHING";
    }
}
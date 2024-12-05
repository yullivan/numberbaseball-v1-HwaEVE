package numberbaseball;

public class Balls {

    Ball ball1;
    Ball ball2;
    Ball ball3;

    String matchStatus(Ball other) {
        if (ball1.number == other.number && ball1.position == other.position) {
            return "STRIKE";
        } else if (ball1.number == other.number) {
            return "BALL";
        } else if (ball2.number == other.number && ball2.position == other.position) {
            return "STRIKE";
        } else if (ball2.number == other.number) {
            return "BALL";
        } else if (ball3.number == other.number && ball3.position == other.position) {
            return "STRIKE";
        } else if (ball3.number == other.number) {
            return "BALL";
        }
        return "NOTHING";
    }
}
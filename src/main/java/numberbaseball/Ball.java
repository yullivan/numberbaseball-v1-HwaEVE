package numberbaseball;

public class Ball {
    int number;
    int position;

    String matchStatus(Ball other) {
        if (number == other.number && position == other.position) {
            return "Strike";
        } else if (number == other.number) {
            return "Ball";
        } else {
            return "none";
        }
    }
}
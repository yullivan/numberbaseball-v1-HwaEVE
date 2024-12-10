package numberbaseball;

import java.util.Objects;

public class Ball {
    private int number;
    private int position;

    public Ball() {
    }

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    String matchStatus(Ball other) {
        if (this.equals(other)){
            return "STRIKE";
        }

        if (this.number == other.number) {
            return "Ball";
        } else {
            return "none";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return number == ball.number && position == ball.position;
    }
    @Override
    public int hashCode() {
        return Objects.hash(number, position);
    }

    public int getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }
}
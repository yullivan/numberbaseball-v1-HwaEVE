package numberbaseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApTest {
    @Test
    void 비교테스트_스트라이크() {
// given
        Ball userBall = new Ball();
        userBall.number = 3;
        userBall.position = 1;
        Ball comBall = new Ball();
        comBall.number = 3;
        comBall.position = 1;

// when
        String 비교결과 = comBall.matchStatus(userBall);
// then
        assertThat(비교결과).isEqualTo("Strike");
    }

    @Test
    void testMatchStatusBall() {

        Ball ball1 = new Ball();
        ball1.number = 1;
        ball1.position = 1;
        Ball ball2 = new Ball();
        ball2.number = 2;
        ball2.position = 2;
        Ball ball3 = new Ball();
        ball3.number = 3;
        ball3.position = 3;

        Balls balls = new Balls();
        balls.ball1 = ball1;
        balls.ball2 = ball2;
        balls.ball3 = ball3;

        Ball other = new Ball();// Same number, different position
        other.number = 1;
        other.position = 1;

        String result = balls.matchStatus(other);

        assertThat(result).isEqualTo("STRIKE");
    }
}





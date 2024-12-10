package numberbaseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    void ballEqualsTest() {

        //given

        Ball ball1 = new Ball(1, 1);
        Ball ball2 = new Ball(1, 1);

        //when
        boolean 비교결과 = ball1.equals(ball2);

        //then
        assertThat(비교결과).isTrue();
    }

    @Test
    void ballEqualsTest_2() {
        // given

        Ball ball1 = new Ball(1, 1);
        Ball ball2 = new Ball(2, 2);
        Ball ball3 = new Ball(3, 3);

        Ball userball =  new Ball(1, 1);

        //when
        Balls balls = new Balls(ball1, ball2, ball3);

        String result = balls.matchStatus(userball);

        // then
        assertThat(result).isEqualTo("STRIKE");
    }





}
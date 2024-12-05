package numberbaseball;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 컴퓨터의 숫자를 미리 정해둡니다 (예: 3, 8, 1)
        int com1 = 3;
        int com2 = 8;
        int com3 = 1;

        // 게임 진행에 필요한 변수들을 선언합니다
        int strike = 0;           // 스트라이크 개수
        int ball = 0;             // 볼 개수
        boolean isCorrect = false; // 정답 여부

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        while (!isCorrect) {
            // 사용자 입력 받기 (이 부분은 미리 제공됨)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int user1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int user2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int user3 = scanner.nextInt();

            // 여기서부터 학생들이 작성할 코드 영역입니다
            // TODO: strike와 ball의 개수를 계산하세요

            // 스트라이크 계산 자리와 숫자가 모두 같은 경우
            if (user1 == com1) {
                strike++;
            }
            if (user2 == com2) {
                strike++;
            }
            if (user3 == com3) {
                strike++;
            }

            // 볼 계산 자리 다르고 숫자만 일치
            if (user1 == com2 || user1 == com3) {
                ball++;}
            if (user2 == com1 || user2 == com3) {
                ball++;}
            if (user3 == com1 || user3 == com2) {
                ball++;}

            // TODO: 결과를 출력하세요 (예: "1 스트라이크 1 볼")

            System.out.println("strike = " + strike + " " + "ball = " + ball);

            // TODO: 3 스트라이크인 경우 isCorrect를 true로 변경하세요

            if (strike == 3) {
                isCorrect = true;
                System.out.println("축하합니다! 정답을 맞추셨습니다.");
            }
        }
        scanner.close();
    }
}
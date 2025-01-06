package algorithm;

import java.util.Scanner;

public class 두수의합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("첫 번째 정수를 입력하세요 (-50000 ~ 50000): ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요 (-50000 ~ 50000): ");
        int num2 = scanner.nextInt();

        // solution 메서드 호출
        int result = solution(num1, num2);

        // 결과 출력
        if (result != -1) {
            System.out.println("결과: " + result);
        } else {
            System.out.println("입력 값이 범위를 벗어났습니다.");
        }

        scanner.close();
    }

    // solution 메서드
    public static int solution(int num1, int num2) {
        int answer = -1; // 기본값 설정
        if (-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000) {
            answer = num1 + num2;
        }
        return answer;
    }
}
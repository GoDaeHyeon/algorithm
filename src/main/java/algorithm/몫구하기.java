package algorithm;

import java.util.Scanner;

public class 몫구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요 (0 ~ 100): ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 (0 ~ 100): ");
        int num2 = scanner.nextInt();

        // 계산 및 출력
        if (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) {
            int result = num1 / num2;
            System.out.println("결과: " + result);
        } else {
            System.out.println("입력 값이 유효하지 않습니다.");
        }

        scanner.close();
    }
}
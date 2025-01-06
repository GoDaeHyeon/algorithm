package algorithm;

import java.util.Scanner;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 두 숫자 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요 (0 < num1 ≤ 100): ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 (0 < num2 ≤ 100): ");
        int num2 = scanner.nextInt();

        // 조건 검사 및 결과 계산
        if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
            int result = (int) ((double) num1 / num2 * 1000);
            System.out.println("결과: " + result);
        } else {
            System.out.println("입력값이 범위를 벗어났습니다.");
        }

        scanner.close();
    }
}
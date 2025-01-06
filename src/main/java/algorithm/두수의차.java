package algorithm;

import java.util.Scanner;

public class 두수의차 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 두 정수 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 계산 후 결과 출력
        int result = calculate(num1, num2);
        System.out.println("두 수의 차: " + result);
    }

    // 두 수의 차를 계산하는 메서드
    public static int calculate(int num1, int num2) {
        return num1 - num2;
    }
}
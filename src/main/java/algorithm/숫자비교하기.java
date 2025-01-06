package algorithm;

import java.util.Scanner;

public class 숫자비교하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 두 숫자 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 숫자 비교 결과 출력
        if (num1 == num2) {
            System.out.println("결과: 두 숫자는 같습니다.");
        } else {
            System.out.println("결과: 두 숫자는 다릅니다.");
        }

        scanner.close(); // Scanner 닫기
    }
}
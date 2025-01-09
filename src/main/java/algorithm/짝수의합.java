package algorithm;

import java.util.Scanner;

public class 짝수의합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력 받기
        System.out.print("정수를 입력하세요 (0 < n ≤ 1000): ");
        int n = scanner.nextInt();

        // 제한사항 체크
        if (n <= 0 || n > 1000) {
            System.out.println("잘못된 입력입니다. 0보다 크고 1000 이하의 값을 입력해주세요.");
            return;
        }

        // 짝수 합 계산
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        // 결과 출력
        System.out.println("짝수의 합: " + sum);
        scanner.close();
    }
}

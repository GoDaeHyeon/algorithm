package algorithm;

import java.util.Scanner;

public class 나이출력 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 (0 < 나이 <= 120): ");
        int age = scanner.nextInt();

        if (age > 0 && age <= 120) {
            int birthYear = solution(age);
            System.out.println("출생 연도는: " + birthYear + "년 입니다.");
        } else {
            System.out.println("유효하지 않은 나이입니다.");
        }

        scanner.close();
    }

    public static int solution(int age) {
        return 2022 - age + 1;
    }
}
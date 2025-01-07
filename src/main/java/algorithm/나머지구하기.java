package algorithm;

import java.util.Scanner;

public class 나머지구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요 (0 < num1 <= 100): ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요 (0 < num2 <= 100): ");
        int num2 = sc.nextInt();

        if (0 < num1 && 100 >= num1 && 0 < num2 && 100 >= num2) {
            int result = num1 % num2;
            System.out.println("결과: " + result);
        } else {
            System.out.println("입력 값이 유효하지 않습니다. 다시 시도해주세요.");
        }
        sc.close();
    }
}

package algorithm;

import java.util.Scanner;

public class 자릿수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("자연수를 입력하세요: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("0보다 큰 자연수를 입력해야 합니다.");
        } else {
            int sum = 0;    // 자릿수의 합을 저장할 매개변수

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println("자릿수의 합: " + sum);
        }
        sc.close();
    }
}

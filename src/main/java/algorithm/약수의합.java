package algorithm;

import java.util.Scanner;

public class 약수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int n = sc.nextInt();

        int sum = solution(n);

        System.out.println(n + "의 약수의 합은: " + sum);
    }
    public static int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

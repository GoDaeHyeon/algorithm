package algorithm;

import java.util.Scanner;

public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("자연수 n을 입력하세요: ");
        int n = sc.nextInt();

        int result = findSmallestX(n);

        System.out.println("결과: " + result);
    }
    public static int findSmallestX(int n) {
        for (int x = 2; x <= n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return n - 1;
    }
}

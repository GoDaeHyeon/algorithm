package algorithm;

import java.util.Scanner;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int x = sc.nextInt();

        System.out.println("자연수 n을 입력하세요: ");
        int n = sc.nextInt();

        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        System.out.println("결과: ");
        for (long num : answer) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}

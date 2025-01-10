package algorithm;

import java.util.Scanner;

public class 짝수와홀수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        System.out.print("숫자를 입력하세요: "); // 안내 메시지 출력
        int num = scanner.nextInt(); // 사용자가 입력한 숫자를 num 변수에 저장

        // 결과 출력
        System.out.println("결과: " + solution(num));
    }

    // 짝수와 홀수를 판별하는 메서드
    public static String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd"; // 짝수면 "Even", 홀수면 "Odd" 반환
    }
}

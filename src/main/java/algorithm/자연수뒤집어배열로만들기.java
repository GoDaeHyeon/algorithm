package algorithm;

import java.util.Scanner;
import java.util.Arrays;

class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("자연수를 입력하세요: ");
        long n = sc.nextLong(); // 입력받은 자연수 저장

        // 뒤집은 숫자 배열 구하기
        int[] result = solution(n);

        // 결과 출력
        System.out.println("결과: " + Arrays.toString(result));

        sc.close();
    }

    public static int[] solution(long n) {
        // 입력 숫자를 문자열로 변환
        String numStr = Long.toString(n);
        // 결과를 저장할 배열 생성
        int[] answer = new int[numStr.length()];

        // 문자열을 뒤에서부터 읽어 각 자릿수를 배열에 저장
        for (int i = 0; i < numStr.length(); i++) {
            answer[i] = numStr.charAt(numStr.length() - 1 - i) - '0';
        }

        return answer;
    }
}

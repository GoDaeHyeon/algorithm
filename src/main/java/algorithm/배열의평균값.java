import java.util.Scanner;

public class 배열의평균값 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("배열의 길이를 입력하세요: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("배열의 원소를 입력하세요:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Solution 클래스 사용
        Solution solution = new Solution();
        double result = solution.solution(numbers);

        // 결과 출력
        System.out.println("배열의 평균값은: " + result);
    }
}

// 문제 풀이 메서드
class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}
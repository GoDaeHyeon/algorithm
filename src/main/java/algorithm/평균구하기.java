import java.util.Scanner;

class 평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("배열의 요소를 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        평균구하기 sol = new 평균구하기();
        double result = sol.solution(arr);
        System.out.println("배열의 평균값: " + result);
    }
}
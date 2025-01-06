package algorithm;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int num1 = 7;
        int num2 = 3;
        int result = solution.solution(num1, num2);

        System.out.println("결과: " + result);
    }
}
class Solution {
    public int solution(int num1, int num2) {
        if (0 < num1 && 100 >= num1 && 0 < num2 && 100 >= num2) {
            int result = (int) ((double) num1 / num2 * 1000);
            return result;
        }
        return -1;
    }
}

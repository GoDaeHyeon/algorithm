package algorithm;

import java.util.Scanner;

public class 각도기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력받기
        System.out.println("숫자를 입력하세요 (0 ~ 180): ");
        int angle = sc.nextInt();

        // 계산 및 출력
        if (0 < angle && 90 > angle) {
            System.out.println("1, 예각입니다!");
        }
        else if (angle == 90) {
            System.out.println("2, 직각입니다!");
        }
        else if (90 < angle && 180 > angle) {
            System.out.println("3, 둔각입니다!");
        }
        else if (180 == angle) {
            System.out.println("4, 평각입니다!");
        }
        else {
            System.out.println("5, 잘못된 입력값입니다.");
        }
    }
}

package lv1;

import java.util.Scanner;

public class KioskApp {
    public static void main(String[] args) {
        /**
         * [ SHAKESHACK MENU ]
         * 1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
         * 2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
         * 3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
         * 4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
         * 0. 종료      | 종료
         * 0 <- // 0을 입력
         *
         * 프로그램을 종료합니다.
         */
        Scanner sc = new Scanner(System.in);

        //while 반복문을 통해 종료 되기전까지 무한 출력
        while (true) {

            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가R 들어간 기본버거");
            System.out.println("0. 종료      | 종료");

            // 원하는 메뉴 번호 입력
            int select = sc.nextInt();

            // 0 입력 시, 종료
            if (select == 0) {
                break;
            }

        }
    }
}

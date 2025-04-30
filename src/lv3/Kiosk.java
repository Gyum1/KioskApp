package lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Kiosk {
    Scanner sc = new Scanner(System.in);


    void start() {

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        outer:
        while (true) {

            System.out.println("============================");
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료");

            // 원하는 메뉴 번호 입력


            System.out.print("입력 : ");
            int select = getValidIntegerInput();

            if (select == 0) {
                break;
            }


            switch (select) {
                case 1, 2, 3, 4:
                    MenuItem selectdMenu = menuItems.get(select - 1);
                    System.out.println("선택된 메뉴 : " + selectdMenu.getInfo());
                    break;
                case 0:
                    break outer;
                default:
                    System.out.println("0~4내에 숫자를 입력해주세요.");

            }
        }
    }


    // 정수가 아닐 시, 예외처리 메서드
    private int getValidIntegerInput() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하세요");
                System.out.print("다시 입력 : ");


            }
        }
    }
}

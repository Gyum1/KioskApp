package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KioskApp {
    public static void main(String[] args) {

        // 메뉴를 담을 List 생성
        List<MenuItem> menuItems = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // List에 MenuItem 객체 만들어서 메뉴 추가
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // List에 n번째에 있는 정보를 변수에 저장
        MenuItem firstMenu = menuItems.get(0);
        MenuItem secondMenu = menuItems.get(1);
        MenuItem thirdMenu = menuItems.get(2);
        MenuItem forthMenu = menuItems.get(3);

        // outer로 바깥 while문 탈출하기 위한 구조 설정
        outer: while (true) {

            System.out.println("============================");
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");

            // 원하는 메뉴 번호 입력
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.print("선택된 메뉴 : ");
                    System.out.println(firstMenu.getInfo());
                    break ;
                case 2:
                    System.out.print("선택된 메뉴 : ");
                    System.out.println(secondMenu.getInfo());
                    break ;
                case 3:
                    System.out.print("선택된 메뉴 : ");
                    System.out.println(thirdMenu.getInfo());
                    break ;
                case 4:
                    System.out.print("선택된 메뉴 : ");
                    System.out.println(forthMenu.getInfo());
                    break ;
                case 0:
                    break outer;
            }

        }
    }
}

package lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체
    private List<Menu> mainMenus = new ArrayList<>(); // 메인 메뉴 카테고리 리스트

    void start() {
        setup(); // 메뉴 초기화 (카테고리 + 항목 구성)

        outer:
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < mainMenus.size(); i++) {
                System.out.println((i + 1) + ". " + mainMenus.get(i).getCategoryName()); // 카테고리 출력
            }
            System.out.println("0. 종료"); // 0 입력 시 프로그램 종료

            System.out.print("입력 : ");
            int categoryInput = getValidIntegerInput(); // 카테고리 선택 숫자 입력

            if (categoryInput == 0) {
                break; // 0 입력 시 종료
            }

            if (categoryInput < 1 || categoryInput > mainMenus.size()) {
                System.out.println("0~" + mainMenus.size() + " 사이의 숫자를 입력해주세요."); // 유효하지 않은 숫자 입력 시 안내
                continue;
            }

            Menu selectedMenu = mainMenus.get(categoryInput - 1); // 선택한 카테고리 가져오기

            while (true) {
                System.out.println("[ " + selectedMenu.getCategoryName().toUpperCase() + " MENU ]");
                selectedMenu.printMenuItems(); // 해당 카테고리의 메뉴 항목 출력

                System.out.print("입력 : ");
                int itemInput = getValidIntegerInput(); // 항목 선택 입력

                if (itemInput == 0) {
                    break; // 0 입력 시 카테고리 선택으로 돌아가기
                }

                if (itemInput < 1 || itemInput > selectedMenu.getMenuItems().size()) {
                    System.out.println("0~" + selectedMenu.getMenuItems().size() + " 사이의 숫자를 입력해주세요.");
                    continue; // 유효하지 않은 입력 처리
                }

                MenuItem selectedItem = selectedMenu.getMenuItems().get(itemInput - 1); // 선택한 항목 가져오기
                System.out.println("선택된 메뉴 : " + selectedItem.getInfo()); // 선택 결과 출력
                break; // 항목 선택 후 메인 메뉴로 돌아감
            }
        }
    }

    private int getValidIntegerInput() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine()); // 정수 입력 받기
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하세요."); // 숫자가 아닌 경우 예외 처리
                System.out.print("다시 입력 : ");
            }
        }
    }

    private void setup() {
        // 각 카테고리별 메뉴 항목 추가
        Menu burgers = new Menu("Burgers");
        burgers.addItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinks = new Menu("Drinks");
        drinks.addItem(new MenuItem("Coke", 2.0, "콜라"));
        drinks.addItem(new MenuItem("Sprite", 2.0, "사이다"));

        Menu desserts = new Menu("Desserts");
        desserts.addItem(new MenuItem("Ice Cream", 3.0, "바닐라 아이스크림"));

        // 카테고리를 메인 메뉴에 추가
        mainMenus.add(burgers);
        mainMenus.add(drinks);
        mainMenus.add(desserts);
    }
}

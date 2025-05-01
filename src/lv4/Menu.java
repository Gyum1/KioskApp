package lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName; // 메뉴 카테고리 이름 (예: Burgers, Drinks)
    private List<MenuItem> menuItems; // 해당 카테고리의 메뉴 항목 리스트

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        menuItems.add(item); // 카테고리에 메뉴 항목 추가
    }

    public String getCategoryName() {
        return categoryName; // 카테고리 이름 반환
    }

    public List<MenuItem> getMenuItems() {
        return menuItems; // 메뉴 항목 리스트 반환
    }

    public void printMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).getInfo());
        }
        System.out.println("0. 뒤로가기"); // 0번 선택 시 메인 메뉴로 돌아가기
    }
}
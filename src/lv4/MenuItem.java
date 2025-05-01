package lv4;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 정보를 가져오기 위한 메서드
    String getInfo() {
        return name + " | W " + price + " | " + description;
    }

}
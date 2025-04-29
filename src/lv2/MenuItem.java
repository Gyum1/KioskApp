package lv2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 정보를 가져오기 위한 메서드
    String getInfo() {
        return name + " | W " + price + " | " + description;
    }

}


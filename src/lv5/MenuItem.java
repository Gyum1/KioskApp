package lv5;

public class MenuItem {
    private String name; // 메뉴 이름
    private double price; // 가격
    private String description; // 설명

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getInfo() {
        return name + " | W " + price + " | " + description; // 메뉴 정보 출력 포맷
    }

    public String getName() { // 이름 getter
        return name;
    }

    public void setName(String name) { // 이름 setter
        this.name = name;
    }

    public double getPrice() { // 가격 getter
        return price;
    }

    public void setPrice(double price) { // 가격 setter
        this.price = price;
    }

    public String getDescription() { // 설명 getter
        return description;
    }

    public void setDescription(String description) { // 설명 setter
        this.description = description;
    }
}
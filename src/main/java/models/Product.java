package models;

/**
 * Created by ruslan on 14.03.2017.
 */
public class Product {

    int price;
    String color;
    String description;

    public Product(int price,String color,String description) {
        this.price = price;
        this.color = color;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }


}

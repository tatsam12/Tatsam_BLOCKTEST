package Model;

public class Items {

    String item_name;

    int code;

    String brand;

    int price;

    public Items(String item_name, int code, String brand, int price) {
        this.item_name = item_name;
        this.code = code;
        this.brand = brand;
        this.price = price;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Items(){
        System.out.println("item_name "+this.item_name);
        System.out.println("code "+this.code);
        System.out.println("brand "+this.brand);
        System.out.println("price "+this.price);
    }
}

package Model;

import java.util.ArrayList;

public class Users {
    String user_name;

    int user_id;

    ArrayList<Orders> OrdersArrayList;

    public Users(String user_name, int user_id, ArrayList<Orders> orders) {
        this.user_name = user_name;
        this.user_id = user_id;
        ArrayList<Orders> Orders = orders;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public ArrayList<Orders> getOrders() {
        return OrdersArrayList;
    }

    public void setOrders(ArrayList<Model.Orders> orders) {
        this.OrdersArrayList =OrdersArrayList;
    }

    public void Users() {
    }
}
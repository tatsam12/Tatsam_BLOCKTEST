package Model;

import java.util.ArrayList;

public class Orders {


  int order_id;


  String ordered_item;

  ArrayList<Items> Items;



  public int getOrder_id() {
    return order_id;
  }

  public void setOrder_id(int order_id) {
    this.order_id = order_id;
  }

  public ArrayList<Model.Items> getItems() {
    return Items;
  }

  public void setItems(ArrayList<Model.Items> items) {
    Items = items;
  }

  public String getOrdered_item() {
    return ordered_item;
  }

  public void setOrdered_item(String ordered_item) {
    this.ordered_item = ordered_item;
  }

  public Orders(int order_id,String ordered_item,ArrayList<Model.Items> items) {
    this.order_id = order_id;
    this.ordered_item = ordered_item;
    Items = items;
  }


  public void Orders() {
  }
}

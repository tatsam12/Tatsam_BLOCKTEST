import Model.Items;
import Model.Orders;
import Model.Users;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Items I1 = new Items("Shoes", 3782, "nike", 84900);
        Items I2 = new Items("Tshirt", 3739, "Louis_Vitton", 12000);
        Items I3 = new Items("Shirt", 3743, "Local_brand", 20000);
        Items I4 = new Items("belt", 3892, "Fila", 6000);
        Items I5 = new Items("TV", 3322, "Sony", 55000);


        ArrayList<Items> Shoes_Items = new ArrayList<Items>();
        Shoes_Items.add(I1);

        ArrayList<Items> Tshirt_Items2 = new ArrayList<Items>();
        Tshirt_Items2.add(I2);

        ArrayList<Items> Shirt_Items3 = new ArrayList<Items>();
        Shirt_Items3.add(I3);

        ArrayList<Items> belt_Items4 = new ArrayList<Items>();
        belt_Items4.add(I4);

        ArrayList<Items> TV_Items4 = new ArrayList<Items>();
        TV_Items4.add(I4);

        ArrayList<Orders> Shoes = new ArrayList<Orders>();
        ArrayList<Orders> Tshirt = new ArrayList<Orders>();
        ArrayList<Orders> Shirt = new ArrayList<Orders>();
        ArrayList<Orders> belt = new ArrayList<Orders>();
        ArrayList<Orders> TV = new ArrayList<Orders>();

        Orders O1 = new Orders(27183, "Shoes", Shoes_Items);
        Orders O2 = new Orders(27382, "Tshirt", Tshirt_Items2);
        Orders O3 = new Orders(23212, "Shirt", Shirt_Items3);
        Orders O4 = new Orders(362728, "belt", belt_Items4);
        Orders O5 = new Orders(362728, "TV", TV_Items4);

        Users U1 = new Users("Tatsam112", 23045, Shoes);
        Users U2 = new Users("Tatsam112", 23045, Shirt);
        Users U3 = new Users("Utsav102", 23048, TV);
        Users U4 = new Users("Utsav102", 23048, belt);


   I1.Items();
   O1.Orders();
   U1.Users();
    }}

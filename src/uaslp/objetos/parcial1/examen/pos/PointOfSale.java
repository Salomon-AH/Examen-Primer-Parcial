package uaslp.objetos.parcial1.examen.pos;

import java.util.Iterator;
import java.util.ArrayList;

public class PointOfSale {
    private ArrayList<CartItem> items;


    public void addToCart(int quantity, Product product){
        items.add(quantity, product);

    }

    public float getTotal(){
    }

    public ArrayList<CartItem> getProducts() {
        Iterator iterator;

        iterator = items.iterator();

        while(iterator.hasNext()){
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }

    public int getCountByName(String name){

    }
}

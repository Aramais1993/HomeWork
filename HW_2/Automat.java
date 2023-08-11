package HW_2;

import java.util.ArrayList;

public class Automat {

    public Product findProduct(ArrayList<Product> list_products, String name) {
        for (Product el : list_products) {
            if (el.getName().equals(name)) {
                return el;
            }
        }
        return null;
    }
}
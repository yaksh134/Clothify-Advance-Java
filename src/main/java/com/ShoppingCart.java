package com;

import java.util.ArrayList;
import java.util.List;

import com.bean.ProductBean;

public class ShoppingCart {
    private List<ProductBean> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public List<ProductBean> getItems() {
        return items;
    }

    public void addItem(ProductBean item) {
        items.add(item);
    }

    public void removeItem(ProductBean item) {
        items.remove(item);
    }

    public double getTotal() {
        double total = 0;
        for (ProductBean item : items) {
            total += item.getPrice() * item.getQty();
        }
        return total;
    }
}

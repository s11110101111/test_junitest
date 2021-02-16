package org.example.test_junitest.sobes.patterns.adapter;

public class ProductB {
    private StringBuilder productList = new StringBuilder();

    public void addProductList(String name) {
        if (productList != null) {
            productList.append(",");
        }
        productList.append(name);
    }

    public StringBuilder getProductB() {
        return productList;
    }
}

package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.adapter;

import org.junit.Before;
import org.junit.Test;

public class ProductsATest {
    private Product p1 = new Product("Product A1");
    private Product p2 = new Product("Product A2");
    private Product p3 = new Product("Product A3");
    private Product p4 = new Product("Product A4");
    private IterProduct itProducts ;
    private ProductB sbProducts;
private  ProductsA prodCompanyA;
    @Before
    public void setUp() throws Exception {
        itProducts = new IterProduct();
        itProducts.addProduct(p1);
        itProducts.addProduct(p2);
        itProducts.addProduct(p3);
        itProducts.addProduct(p4);
        sbProducts = new ProductB();
        sbProducts.addProductList(p1.getNameProduct());
        sbProducts.addProductList(p2.getNameProduct());
        sbProducts.addProductList(p3.getNameProduct());
        sbProducts.addProductList(p4.getNameProduct());
//

    }


    @Test
    public void displayProduct() {
        prodCompanyA = new ProductsA();
        StringBuilderToIteratorAdaptor sbti = new StringBuilderToIteratorAdaptor(sbProducts);
        prodCompanyA.displayProduct(itProducts.getProduct());
        prodCompanyA.displayProduct(sbti);


    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
public class Product {
    private Double price;
    private Integer quantity;
    private String name;

public Product(String initialName, double initialPrice, int initialQuantity){
    this.name = initialName;
    this.price = initialPrice;
    this.quantity = initialQuantity;
}
public void printProduct(){
    System.out.println(this.name + ", " + this.price + ", " + this.quantity + " pcs" );
}
}

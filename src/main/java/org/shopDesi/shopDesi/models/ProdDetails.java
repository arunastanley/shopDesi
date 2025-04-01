package org.shopDesi.shopDesi.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class ProdDetails extends AbstractEntity {

    @OneToOne(mappedBy = "prodDetails")
    private Product product;

    @NotNull
    private int price;

    @NotNull
    private String seller;


//    Constructors

    public ProdDetails(Product product, int price, String seller) {
        this.product = product;
        this.price = price;
        this.seller = seller;
    }

    public ProdDetails() {
    }


//    Getters and Setters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
}

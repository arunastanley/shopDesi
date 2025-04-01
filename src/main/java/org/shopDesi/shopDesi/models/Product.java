package org.shopDesi.shopDesi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Product extends AbstractEntity {

    @NotNull(message = "Product name cannot be empty")
    @Size(min = 2, max = 60,message = "Product name should be between 2 and 60 characters long")
    private String name;

    @OneToOne
    private ProdDetails prodDetails;


    //    Constructors
    public Product(ProdDetails prodDetails, String name) {
        this.prodDetails = prodDetails;
        this.name = name;
    }

    public Product() {
    }


    //    Getters and Setters
    public String getName() {
        return name;
    }

    public ProdDetails getProdDetails() {
        return prodDetails;
    }

    public void setProdDetails(ProdDetails prodDetails) {
        this.prodDetails = prodDetails;
    }

    public void setName(String name) {
        this.name = name;
    }
}

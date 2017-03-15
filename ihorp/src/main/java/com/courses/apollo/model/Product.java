package com.courses.apollo.model;

/**
 * A Product class to create constructor for object Product.
 */
public class Product {

    /**
     * Create productId.
     */
    private Integer productId;

    /**
     *Create name field.
     */
    private String name;

    /**
     * Create upc field.
     */
    private Integer upc;

    /**
     * Create creator field.
     */
    private String creator;

    /**
     * Create price field.
     */
    private Double price;

    /**
     * Create shelf life field.
     */
    private Integer shelfLife;

    /**
     * Create quantity field.
     */
    private Integer quantity;

    /**
     * Create a constructor of a Product.
     */
    public Product(Integer productId, String name,
                   Integer upc, String creator,
                   Double price, Integer shelfLife,
                   Integer quantity) {
        this.productId = productId;
        this.name = name;
        this.upc = upc;
        this.creator = creator;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    /**
     * Create alternative constructor for Product.
     */
    public Product(Integer productID, String name,
                    String creator, Double price) {
        this.productId = productID;
        this.name = name;
        this.creator = creator;
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUpc() {
        return upc;
    }

    public void setUpc(Integer upc) {
        this.upc = upc;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Integer shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return productId + " " + name + " " + creator + " " + price + " " + shelfLife + " " + quantity;
    }
}

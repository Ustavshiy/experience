package com.courses.apollo.model.shop;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * Create object type Shop.
 */
public class Shop {

    /**
     * Name of Shop.
     */
    private String name;

    /**
     * Address of Shop.
     */
    private String address;

    /**
     * List of products or services in Shop.
     */
    private List<Product> products;

    public Shop() {
    }

    public Shop(String name, String address, List<Product> products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    /**
     * Inner class Product.
     */
    public class Product {

        /**
         * Product/Service detector.
         */
        private boolean isServise;

        /**
         * Department name.
         */
        private String departmentName;

        /**
         * Product name.
         */
        private String productName;

        /**
         * Product price.
         */
        private BigDecimal productPrice;

        public Product(boolean isServise, String departmentName, String productName, String productPrice) {
            this.isServise = isServise;
            this.departmentName = departmentName;
            this.productName = productName;
            this.productPrice = new BigDecimal(productPrice);
        }

        public boolean isServise() {
            return isServise;
        }

        public void setServise(boolean servise) {
            isServise = servise;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public BigDecimal getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(String productPrice) {
            this.productPrice = new BigDecimal(productPrice);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Product)) {
                return false;
            }
            Product product = (Product) o;
            return isServise == product.isServise
                    && Objects.equals(departmentName, product.departmentName)
                    && Objects.equals(productName, product.productName)
                    && Objects.equals(productPrice, product.productPrice);
        }

        @Override
        public int hashCode() {
            return Objects.hash(isServise, departmentName, productName, productPrice);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

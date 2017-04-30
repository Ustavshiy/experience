package com.courses.apollo.model.inermodels;

import java.util.ArrayList;
import java.util.List;

/**
 * Shop to create inner class.
 */
public class Shop {

    /**
     * name of Shop.
     */
    private String name;

    /**
     * Shop office.
     */
    private ShopOffice shopOffice;

    public Shop() {
        shopOffice = new ShopOffice();
    }

    /**
     * inner class.
     */
    private final class ShopOffice {

        /**
         * List of departments.
         */
        private List<String> departments;

        /**
         * List of Services.
         */
        private List<String> services;

        /**
         * List of Products.
         */
        private List<String> products;

        private ShopOffice() {
            departments = new ArrayList<>();
            services = new ArrayList<>();
            products = new ArrayList<>();
        }

        public List<String> getDepartments() {
            return departments;
        }

        public void setDepartments(List<String> departments) {
            this.departments = departments;
        }

        public List<String> getServices() {
            return services;
        }

        public void setServices(List<String> services) {
            this.services = services;
        }

        public List<String> getProducts() {
            return products;
        }

        public void setProducts(List<String> products) {
            this.products = products;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Add a new Department.
     * @param department is string.
     */
    public void addNewDepartment(String department) {
        shopOffice.departments.add(department);
    }

    /**
     * Get all departments.
     * @return all departments.
     */
    public List<String> getAllDepartments() {
        return shopOffice.departments;
    }

    /**
     * Add a new Service.
     * @param service is string.
     */
    public void addNewService(String service) {
        shopOffice.services.add(service);
    }

    /**
     * Get all services.
     * @return all services.
     */
    public List<String> getAllServices() {
        return shopOffice.getServices();
    }

    /**
     *  Add a new product.
     * @param product is string.
     */
    public void addNewProduct(String product) {
        shopOffice.products.add(product);
    }

    /**
     *  Get all products.
     * @return List of Products.
     */
    public List<String> getAllProducts() {
        return shopOffice.products;
    }
}
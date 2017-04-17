package com.courses.apollo.model.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Create object type Shop.
 */
public class Shop {

    /**
     *  Name of Shop.
     */
    private String name;

    /**
     * Address of Shop.
     */
    private String address;

    /**
     * List of Departments Shop.
     */
    private List<Department> departments;

     public Shop() {
    }

    public Shop(String name, String address, List<Department> departments) {
        this.name = name;
        this.address = address;
        this.departments = departments;
    }

    /**
     * Inner class Department.
     */
    public class Department {

        /**
         * Department name.
         */
        private String departmentName;

        /**
         * List of products in Department.
         */
        private ArrayList<Product> products;

        /**
         * List of services in Department.
         */
        private ArrayList<Service> services;

        public Department() {
        }

        public Department(String departmentName, Product product, Service service) {
            this.departmentName = departmentName;
            products.add(product);
            services.add(service);
        }


        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public ArrayList<Product> getProducts() {
            return products;
        }

        /**
         * Setter.
         * @param product object type Product.
         */
        public void setProduct(Product product) {
            products.add(product);
        }

        public ArrayList<Service> getServices() {
            return services;
        }

        /**
         * Setter.
         * @param service object type Service.
         */
        public void setService(Service service) {
            services.add(service);
        }

        /**
         * Inner class Product.
         */
        public class Product {

            /**
             * Name of a Product.
             */
            private String productName;

            /**
             * Price of a Product.
             */
            private BigDecimal productPrice;

            public Product(String productName, String productPrice) {
                this.productName = productName;
                this.productPrice = new BigDecimal(productPrice).setScale(2, BigDecimal.ROUND_HALF_UP);
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
                this.productPrice = new BigDecimal(productPrice).setScale(2, BigDecimal.ROUND_HALF_UP);
            }
        }

        /**
         * Inner class Service.
         */
        public class Service {

            /**
             * Name of a Service.
             */
            private String serviceName;

            /**
             * Price of a Service.
             */
            private BigDecimal servicePrice;

            public Service(String serviceName, String servicePrice) {
                this.serviceName = serviceName;
                this.servicePrice = new BigDecimal(servicePrice).setScale(2, BigDecimal.ROUND_HALF_UP);
            }

            public String getServiceName() {
                return serviceName;
            }

            public void setServiceName(String serviceName) {
                this.serviceName = serviceName;
            }

            public BigDecimal getServicePrice() {
                return servicePrice;
            }

            public void setServicePrice(String servicePrice) {
                this.servicePrice = new BigDecimal(servicePrice).setScale(2, BigDecimal.ROUND_HALF_UP);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Department)) {
                return false;
            }
            Department that = (Department) o;
            return Objects.equals(departmentName, that.departmentName)
                    && Objects.equals(products, that.products)
                    && Objects.equals(services, that.services);
        }

        @Override
        public int hashCode() {
            return Objects.hash(departmentName, products, services);
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

    public List<Department> getDepartments() {
        return departments;
    }

    /**
     * Setter.
     * @param department object type Department.
     */
    public void setDepartments(Department department) {
        departments.add(department);
    }
}

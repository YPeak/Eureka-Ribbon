package com.example.order.po;

/**
 * Created by shuwei.yu.
 * on 2018/5/17.
 */
public class Order {
    private Integer id;
    private String price;
    private String name;
    private String address;
    private String phone;

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", price='" + price + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Order(Integer id, String price, String name, String address, String phone) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}

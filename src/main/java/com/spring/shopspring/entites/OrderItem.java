package com.spring.shopspring.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.shopspring.entites.pk.OrderItemPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "order_item_table")
public class OrderItem implements Serializable {

    @EmbeddedId
    private OrderItemPK id;

    private Integer quantity;

    private Double price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        super();
        this.id = new OrderItemPK();
        this.id.setOrder(order);
        this.id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder() {
        return this.id.getOrder();
    }

    public void setOrder(Order order) {
        this.id.setOrder(order);
    }

    @JsonIgnore
    public Product getProduct() {
        return this.id.getProduct();
    }

    public void setProduct(Product product) {
        this.id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem orderItem)) return false;
        return id.equals(orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}

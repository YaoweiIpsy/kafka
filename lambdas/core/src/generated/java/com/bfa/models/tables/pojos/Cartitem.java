/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cartitem implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  id;
    private String  item;
    private String  productid;
    private Integer quantity;
    private String  user;

    public Cartitem() {}

    public Cartitem(Cartitem value) {
        this.id = value.id;
        this.item = value.item;
        this.productid = value.productid;
        this.quantity = value.quantity;
        this.user = value.user;
    }

    public Cartitem(
        String  id,
        String  item,
        String  productid,
        Integer quantity,
        String  user
    ) {
        this.id = id;
        this.item = item;
        this.productid = productid;
        this.quantity = quantity;
        this.user = user;
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for <code>next_graphql_admin.CartItem.id</code>.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.item</code>.
     */
    public String getItem() {
        return this.item;
    }

    /**
     * Setter for <code>next_graphql_admin.CartItem.item</code>.
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.productId</code>.
     */
    public String getProductid() {
        return this.productid;
    }

    /**
     * Setter for <code>next_graphql_admin.CartItem.productId</code>.
     */
    public void setProductid(String productid) {
        this.productid = productid;
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.quantity</code>.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for <code>next_graphql_admin.CartItem.quantity</code>.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.user</code>.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Setter for <code>next_graphql_admin.CartItem.user</code>.
     */
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cartitem (");

        sb.append(id);
        sb.append(", ").append(item);
        sb.append(", ").append(productid);
        sb.append(", ").append(quantity);
        sb.append(", ").append(user);

        sb.append(")");
        return sb.toString();
    }
}
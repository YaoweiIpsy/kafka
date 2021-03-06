/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private String googlemapslocationid;
    private String id;
    private String userid;

    public Orderdetail() {}

    public Orderdetail(Orderdetail value) {
        this.googlemapslocationid = value.googlemapslocationid;
        this.id = value.id;
        this.userid = value.userid;
    }

    public Orderdetail(
        String googlemapslocationid,
        String id,
        String userid
    ) {
        this.googlemapslocationid = googlemapslocationid;
        this.id = id;
        this.userid = userid;
    }

    /**
     * Getter for
     * <code>next_graphql_admin.OrderDetail.googleMapsLocationId</code>.
     */
    public String getGooglemapslocationid() {
        return this.googlemapslocationid;
    }

    /**
     * Setter for
     * <code>next_graphql_admin.OrderDetail.googleMapsLocationId</code>.
     */
    public void setGooglemapslocationid(String googlemapslocationid) {
        this.googlemapslocationid = googlemapslocationid;
    }

    /**
     * Getter for <code>next_graphql_admin.OrderDetail.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for <code>next_graphql_admin.OrderDetail.id</code>.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for <code>next_graphql_admin.OrderDetail.userId</code>.
     */
    public String getUserid() {
        return this.userid;
    }

    /**
     * Setter for <code>next_graphql_admin.OrderDetail.userId</code>.
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orderdetail (");

        sb.append(googlemapslocationid);
        sb.append(", ").append(id);
        sb.append(", ").append(userid);

        sb.append(")");
        return sb.toString();
    }
}

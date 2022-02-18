/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Card implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  brand;
    private Integer expmonth;
    private Integer expyear;
    private String  id;
    private String  last4digits;
    private String  stripepaymentmethodid;

    public Card() {}

    public Card(Card value) {
        this.brand = value.brand;
        this.expmonth = value.expmonth;
        this.expyear = value.expyear;
        this.id = value.id;
        this.last4digits = value.last4digits;
        this.stripepaymentmethodid = value.stripepaymentmethodid;
    }

    public Card(
        String  brand,
        Integer expmonth,
        Integer expyear,
        String  id,
        String  last4digits,
        String  stripepaymentmethodid
    ) {
        this.brand = brand;
        this.expmonth = expmonth;
        this.expyear = expyear;
        this.id = id;
        this.last4digits = last4digits;
        this.stripepaymentmethodid = stripepaymentmethodid;
    }

    /**
     * Getter for <code>next_graphql_admin.Card.brand</code>.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Setter for <code>next_graphql_admin.Card.brand</code>.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for <code>next_graphql_admin.Card.expMonth</code>.
     */
    public Integer getExpmonth() {
        return this.expmonth;
    }

    /**
     * Setter for <code>next_graphql_admin.Card.expMonth</code>.
     */
    public void setExpmonth(Integer expmonth) {
        this.expmonth = expmonth;
    }

    /**
     * Getter for <code>next_graphql_admin.Card.expYear</code>.
     */
    public Integer getExpyear() {
        return this.expyear;
    }

    /**
     * Setter for <code>next_graphql_admin.Card.expYear</code>.
     */
    public void setExpyear(Integer expyear) {
        this.expyear = expyear;
    }

    /**
     * Getter for <code>next_graphql_admin.Card.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for <code>next_graphql_admin.Card.id</code>.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for <code>next_graphql_admin.Card.last4Digits</code>.
     */
    public String getLast4digits() {
        return this.last4digits;
    }

    /**
     * Setter for <code>next_graphql_admin.Card.last4Digits</code>.
     */
    public void setLast4digits(String last4digits) {
        this.last4digits = last4digits;
    }

    /**
     * Getter for <code>next_graphql_admin.Card.stripePaymentMethodId</code>.
     */
    public String getStripepaymentmethodid() {
        return this.stripepaymentmethodid;
    }

    /**
     * Setter for <code>next_graphql_admin.Card.stripePaymentMethodId</code>.
     */
    public void setStripepaymentmethodid(String stripepaymentmethodid) {
        this.stripepaymentmethodid = stripepaymentmethodid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Card (");

        sb.append(brand);
        sb.append(", ").append(expmonth);
        sb.append(", ").append(expyear);
        sb.append(", ").append(id);
        sb.append(", ").append(last4digits);
        sb.append(", ").append(stripepaymentmethodid);

        sb.append(")");
        return sb.toString();
    }
}

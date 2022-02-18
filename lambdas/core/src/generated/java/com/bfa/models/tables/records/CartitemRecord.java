/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables.records;


import com.bfa.models.tables.Cartitem;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CartitemRecord extends UpdatableRecordImpl<CartitemRecord> implements Record5<String, String, String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>next_graphql_admin.CartItem.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>next_graphql_admin.CartItem.item</code>.
     */
    public void setItem(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.item</code>.
     */
    public String getItem() {
        return (String) get(1);
    }

    /**
     * Setter for <code>next_graphql_admin.CartItem.productId</code>.
     */
    public void setProductid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.productId</code>.
     */
    public String getProductid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>next_graphql_admin.CartItem.quantity</code>.
     */
    public void setQuantity(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>next_graphql_admin.CartItem.user</code>.
     */
    public void setUser(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>next_graphql_admin.CartItem.user</code>.
     */
    public String getUser() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Cartitem.CARTITEM.ID;
    }

    @Override
    public Field<String> field2() {
        return Cartitem.CARTITEM.ITEM;
    }

    @Override
    public Field<String> field3() {
        return Cartitem.CARTITEM.PRODUCTID;
    }

    @Override
    public Field<Integer> field4() {
        return Cartitem.CARTITEM.QUANTITY;
    }

    @Override
    public Field<String> field5() {
        return Cartitem.CARTITEM.USER;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getItem();
    }

    @Override
    public String component3() {
        return getProductid();
    }

    @Override
    public Integer component4() {
        return getQuantity();
    }

    @Override
    public String component5() {
        return getUser();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getItem();
    }

    @Override
    public String value3() {
        return getProductid();
    }

    @Override
    public Integer value4() {
        return getQuantity();
    }

    @Override
    public String value5() {
        return getUser();
    }

    @Override
    public CartitemRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public CartitemRecord value2(String value) {
        setItem(value);
        return this;
    }

    @Override
    public CartitemRecord value3(String value) {
        setProductid(value);
        return this;
    }

    @Override
    public CartitemRecord value4(Integer value) {
        setQuantity(value);
        return this;
    }

    @Override
    public CartitemRecord value5(String value) {
        setUser(value);
        return this;
    }

    @Override
    public CartitemRecord values(String value1, String value2, String value3, Integer value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CartitemRecord
     */
    public CartitemRecord() {
        super(Cartitem.CARTITEM);
    }

    /**
     * Create a detached, initialised CartitemRecord
     */
    public CartitemRecord(String id, String item, String productid, Integer quantity, String user) {
        super(Cartitem.CARTITEM);

        setId(id);
        setItem(item);
        setProductid(productid);
        setQuantity(quantity);
        setUser(user);
    }

    /**
     * Create a detached, initialised CartitemRecord
     */
    public CartitemRecord(com.bfa.models.tables.pojos.Cartitem value) {
        super(Cartitem.CARTITEM);

        if (value != null) {
            setId(value.getId());
            setItem(value.getItem());
            setProductid(value.getProductid());
            setQuantity(value.getQuantity());
            setUser(value.getUser());
        }
    }
}
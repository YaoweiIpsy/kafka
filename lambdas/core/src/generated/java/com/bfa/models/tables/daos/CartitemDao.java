/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables.daos;


import com.bfa.models.tables.Cartitem;
import com.bfa.models.tables.records.CartitemRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CartitemDao extends DAOImpl<CartitemRecord, com.bfa.models.tables.pojos.Cartitem, String> {

    /**
     * Create a new CartitemDao without any configuration
     */
    public CartitemDao() {
        super(Cartitem.CARTITEM, com.bfa.models.tables.pojos.Cartitem.class);
    }

    /**
     * Create a new CartitemDao with an attached configuration
     */
    public CartitemDao(Configuration configuration) {
        super(Cartitem.CARTITEM, com.bfa.models.tables.pojos.Cartitem.class, configuration);
    }

    @Override
    public String getId(com.bfa.models.tables.pojos.Cartitem object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Cartitem.CARTITEM.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchById(String... values) {
        return fetch(Cartitem.CARTITEM.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.bfa.models.tables.pojos.Cartitem fetchOneById(String value) {
        return fetchOne(Cartitem.CARTITEM.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.bfa.models.tables.pojos.Cartitem> fetchOptionalById(String value) {
        return fetchOptional(Cartitem.CARTITEM.ID, value);
    }

    /**
     * Fetch records that have <code>item BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchRangeOfItem(String lowerInclusive, String upperInclusive) {
        return fetchRange(Cartitem.CARTITEM.ITEM, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>item IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchByItem(String... values) {
        return fetch(Cartitem.CARTITEM.ITEM, values);
    }

    /**
     * Fetch records that have <code>productId BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchRangeOfProductid(String lowerInclusive, String upperInclusive) {
        return fetchRange(Cartitem.CARTITEM.PRODUCTID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>productId IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchByProductid(String... values) {
        return fetch(Cartitem.CARTITEM.PRODUCTID, values);
    }

    /**
     * Fetch records that have <code>quantity BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchRangeOfQuantity(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Cartitem.CARTITEM.QUANTITY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>quantity IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchByQuantity(Integer... values) {
        return fetch(Cartitem.CARTITEM.QUANTITY, values);
    }

    /**
     * Fetch records that have <code>user BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchRangeOfUser(String lowerInclusive, String upperInclusive) {
        return fetchRange(Cartitem.CARTITEM.USER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Cartitem> fetchByUser(String... values) {
        return fetch(Cartitem.CARTITEM.USER, values);
    }
}

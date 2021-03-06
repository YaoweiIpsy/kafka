/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables.daos;


import com.bfa.models.tables.Orderdetail;
import com.bfa.models.tables.records.OrderdetailRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderdetailDao extends DAOImpl<OrderdetailRecord, com.bfa.models.tables.pojos.Orderdetail, String> {

    /**
     * Create a new OrderdetailDao without any configuration
     */
    public OrderdetailDao() {
        super(Orderdetail.ORDERDETAIL, com.bfa.models.tables.pojos.Orderdetail.class);
    }

    /**
     * Create a new OrderdetailDao with an attached configuration
     */
    public OrderdetailDao(Configuration configuration) {
        super(Orderdetail.ORDERDETAIL, com.bfa.models.tables.pojos.Orderdetail.class, configuration);
    }

    @Override
    public String getId(com.bfa.models.tables.pojos.Orderdetail object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>googleMapsLocationId BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Orderdetail> fetchRangeOfGooglemapslocationid(String lowerInclusive, String upperInclusive) {
        return fetchRange(Orderdetail.ORDERDETAIL.GOOGLEMAPSLOCATIONID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>googleMapsLocationId IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Orderdetail> fetchByGooglemapslocationid(String... values) {
        return fetch(Orderdetail.ORDERDETAIL.GOOGLEMAPSLOCATIONID, values);
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Orderdetail> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Orderdetail.ORDERDETAIL.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Orderdetail> fetchById(String... values) {
        return fetch(Orderdetail.ORDERDETAIL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.bfa.models.tables.pojos.Orderdetail fetchOneById(String value) {
        return fetchOne(Orderdetail.ORDERDETAIL.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.bfa.models.tables.pojos.Orderdetail> fetchOptionalById(String value) {
        return fetchOptional(Orderdetail.ORDERDETAIL.ID, value);
    }

    /**
     * Fetch records that have <code>userId BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Orderdetail> fetchRangeOfUserid(String lowerInclusive, String upperInclusive) {
        return fetchRange(Orderdetail.ORDERDETAIL.USERID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>userId IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Orderdetail> fetchByUserid(String... values) {
        return fetch(Orderdetail.ORDERDETAIL.USERID, values);
    }
}

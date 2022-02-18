/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables.daos;


import com.bfa.models.tables.Author;
import com.bfa.models.tables.records.AuthorRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorDao extends DAOImpl<AuthorRecord, com.bfa.models.tables.pojos.Author, Integer> {

    /**
     * Create a new AuthorDao without any configuration
     */
    public AuthorDao() {
        super(Author.AUTHOR, com.bfa.models.tables.pojos.Author.class);
    }

    /**
     * Create a new AuthorDao with an attached configuration
     */
    public AuthorDao(Configuration configuration) {
        super(Author.AUTHOR, com.bfa.models.tables.pojos.Author.class, configuration);
    }

    @Override
    public Integer getId(com.bfa.models.tables.pojos.Author object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Author> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Author.AUTHOR.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Author> fetchById(Integer... values) {
        return fetch(Author.AUTHOR.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.bfa.models.tables.pojos.Author fetchOneById(Integer value) {
        return fetchOne(Author.AUTHOR.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.bfa.models.tables.pojos.Author> fetchOptionalById(Integer value) {
        return fetchOptional(Author.AUTHOR.ID, value);
    }

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Author> fetchRangeOfFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Author.AUTHOR.FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Author> fetchByFirstName(String... values) {
        return fetch(Author.AUTHOR.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bfa.models.tables.pojos.Author> fetchRangeOfLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Author.AUTHOR.LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    public List<com.bfa.models.tables.pojos.Author> fetchByLastName(String... values) {
        return fetch(Author.AUTHOR.LAST_NAME, values);
    }
}

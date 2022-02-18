/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Googlemapslocation implements Serializable {

    private static final long serialVersionUID = 1L;

    private String googleplacesid;
    private String id;
    private String name;

    public Googlemapslocation() {}

    public Googlemapslocation(Googlemapslocation value) {
        this.googleplacesid = value.googleplacesid;
        this.id = value.id;
        this.name = value.name;
    }

    public Googlemapslocation(
        String googleplacesid,
        String id,
        String name
    ) {
        this.googleplacesid = googleplacesid;
        this.id = id;
        this.name = name;
    }

    /**
     * Getter for
     * <code>next_graphql_admin.GoogleMapsLocation.googlePlacesId</code>.
     */
    public String getGoogleplacesid() {
        return this.googleplacesid;
    }

    /**
     * Setter for
     * <code>next_graphql_admin.GoogleMapsLocation.googlePlacesId</code>.
     */
    public void setGoogleplacesid(String googleplacesid) {
        this.googleplacesid = googleplacesid;
    }

    /**
     * Getter for <code>next_graphql_admin.GoogleMapsLocation.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for <code>next_graphql_admin.GoogleMapsLocation.id</code>.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for <code>next_graphql_admin.GoogleMapsLocation.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>next_graphql_admin.GoogleMapsLocation.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Googlemapslocation (");

        sb.append(googleplacesid);
        sb.append(", ").append(id);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}

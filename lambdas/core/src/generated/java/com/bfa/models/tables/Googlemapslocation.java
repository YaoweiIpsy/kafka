/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables;


import com.bfa.models.Keys;
import com.bfa.models.NextGraphqlAdmin;
import com.bfa.models.tables.records.GooglemapslocationRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Googlemapslocation extends TableImpl<GooglemapslocationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>next_graphql_admin.GoogleMapsLocation</code>
     */
    public static final Googlemapslocation GOOGLEMAPSLOCATION = new Googlemapslocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GooglemapslocationRecord> getRecordType() {
        return GooglemapslocationRecord.class;
    }

    /**
     * The column
     * <code>next_graphql_admin.GoogleMapsLocation.googlePlacesId</code>.
     */
    public final TableField<GooglemapslocationRecord, String> GOOGLEPLACESID = createField(DSL.name("googlePlacesId"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.GoogleMapsLocation.id</code>.
     */
    public final TableField<GooglemapslocationRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.GoogleMapsLocation.name</code>.
     */
    public final TableField<GooglemapslocationRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    private Googlemapslocation(Name alias, Table<GooglemapslocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Googlemapslocation(Name alias, Table<GooglemapslocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>next_graphql_admin.GoogleMapsLocation</code>
     * table reference
     */
    public Googlemapslocation(String alias) {
        this(DSL.name(alias), GOOGLEMAPSLOCATION);
    }

    /**
     * Create an aliased <code>next_graphql_admin.GoogleMapsLocation</code>
     * table reference
     */
    public Googlemapslocation(Name alias) {
        this(alias, GOOGLEMAPSLOCATION);
    }

    /**
     * Create a <code>next_graphql_admin.GoogleMapsLocation</code> table
     * reference
     */
    public Googlemapslocation() {
        this(DSL.name("GoogleMapsLocation"), null);
    }

    public <O extends Record> Googlemapslocation(Table<O> child, ForeignKey<O, GooglemapslocationRecord> key) {
        super(child, key, GOOGLEMAPSLOCATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : NextGraphqlAdmin.NEXT_GRAPHQL_ADMIN;
    }

    @Override
    public UniqueKey<GooglemapslocationRecord> getPrimaryKey() {
        return Keys.KEY_GOOGLEMAPSLOCATION_PRIMARY;
    }

    @Override
    public Googlemapslocation as(String alias) {
        return new Googlemapslocation(DSL.name(alias), this);
    }

    @Override
    public Googlemapslocation as(Name alias) {
        return new Googlemapslocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Googlemapslocation rename(String name) {
        return new Googlemapslocation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Googlemapslocation rename(Name name) {
        return new Googlemapslocation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

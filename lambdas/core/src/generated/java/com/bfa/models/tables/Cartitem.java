/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables;


import com.bfa.models.Indexes;
import com.bfa.models.Keys;
import com.bfa.models.NextGraphqlAdmin;
import com.bfa.models.tables.records.CartitemRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class Cartitem extends TableImpl<CartitemRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>next_graphql_admin.CartItem</code>
     */
    public static final Cartitem CARTITEM = new Cartitem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CartitemRecord> getRecordType() {
        return CartitemRecord.class;
    }

    /**
     * The column <code>next_graphql_admin.CartItem.id</code>.
     */
    public final TableField<CartitemRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.CartItem.item</code>.
     */
    public final TableField<CartitemRecord, String> ITEM = createField(DSL.name("item"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.CartItem.productId</code>.
     */
    public final TableField<CartitemRecord, String> PRODUCTID = createField(DSL.name("productId"), SQLDataType.VARCHAR(191), this, "");

    /**
     * The column <code>next_graphql_admin.CartItem.quantity</code>.
     */
    public final TableField<CartitemRecord, Integer> QUANTITY = createField(DSL.name("quantity"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.CartItem.user</code>.
     */
    public final TableField<CartitemRecord, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    private Cartitem(Name alias, Table<CartitemRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cartitem(Name alias, Table<CartitemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>next_graphql_admin.CartItem</code> table
     * reference
     */
    public Cartitem(String alias) {
        this(DSL.name(alias), CARTITEM);
    }

    /**
     * Create an aliased <code>next_graphql_admin.CartItem</code> table
     * reference
     */
    public Cartitem(Name alias) {
        this(alias, CARTITEM);
    }

    /**
     * Create a <code>next_graphql_admin.CartItem</code> table reference
     */
    public Cartitem() {
        this(DSL.name("CartItem"), null);
    }

    public <O extends Record> Cartitem(Table<O> child, ForeignKey<O, CartitemRecord> key) {
        super(child, key, CARTITEM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : NextGraphqlAdmin.NEXT_GRAPHQL_ADMIN;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CARTITEM_ITEM, Indexes.CARTITEM_PRODUCTID, Indexes.CARTITEM_USER);
    }

    @Override
    public UniqueKey<CartitemRecord> getPrimaryKey() {
        return Keys.KEY_CARTITEM_PRIMARY;
    }

    @Override
    public List<ForeignKey<CartitemRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CARTITEM_IBFK_2, Keys.CARTITEM_IBFK_1);
    }

    private transient Product _product;
    private transient User _user;

    /**
     * Get the implicit join path to the <code>next_graphql_admin.Product</code>
     * table.
     */
    public Product product() {
        if (_product == null)
            _product = new Product(this, Keys.CARTITEM_IBFK_2);

        return _product;
    }

    /**
     * Get the implicit join path to the <code>next_graphql_admin.User</code>
     * table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.CARTITEM_IBFK_1);

        return _user;
    }

    @Override
    public Cartitem as(String alias) {
        return new Cartitem(DSL.name(alias), this);
    }

    @Override
    public Cartitem as(Name alias) {
        return new Cartitem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Cartitem rename(String name) {
        return new Cartitem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Cartitem rename(Name name) {
        return new Cartitem(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}

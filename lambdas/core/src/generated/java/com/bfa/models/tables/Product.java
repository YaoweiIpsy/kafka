/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables;


import com.bfa.models.Indexes;
import com.bfa.models.Keys;
import com.bfa.models.NextGraphqlAdmin;
import com.bfa.models.tables.records.ProductRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class Product extends TableImpl<ProductRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>next_graphql_admin.Product</code>
     */
    public static final Product PRODUCT = new Product();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductRecord> getRecordType() {
        return ProductRecord.class;
    }

    /**
     * The column <code>next_graphql_admin.Product.category</code>.
     */
    public final TableField<ProductRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Product.createdAt</code>.
     */
    public final TableField<ProductRecord, LocalDateTime> CREATEDAT = createField(DSL.name("createdAt"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>next_graphql_admin.Product.description</code>.
     */
    public final TableField<ProductRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Product.discount</code>.
     */
    public final TableField<ProductRecord, Integer> DISCOUNT = createField(DSL.name("discount"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Product.id</code>.
     */
    public final TableField<ProductRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Product.name</code>.
     */
    public final TableField<ProductRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Product.price</code>.
     */
    public final TableField<ProductRecord, Integer> PRICE = createField(DSL.name("price"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Product.salePrice</code>.
     */
    public final TableField<ProductRecord, Integer> SALEPRICE = createField(DSL.name("salePrice"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Product.sku</code>.
     */
    public final TableField<ProductRecord, String> SKU = createField(DSL.name("sku"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Product.unit</code>.
     */
    public final TableField<ProductRecord, String> UNIT = createField(DSL.name("unit"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Product.updatedAt</code>.
     */
    public final TableField<ProductRecord, LocalDateTime> UPDATEDAT = createField(DSL.name("updatedAt"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>next_graphql_admin.Product.user</code>.
     */
    public final TableField<ProductRecord, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    private Product(Name alias, Table<ProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private Product(Name alias, Table<ProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>next_graphql_admin.Product</code> table reference
     */
    public Product(String alias) {
        this(DSL.name(alias), PRODUCT);
    }

    /**
     * Create an aliased <code>next_graphql_admin.Product</code> table reference
     */
    public Product(Name alias) {
        this(alias, PRODUCT);
    }

    /**
     * Create a <code>next_graphql_admin.Product</code> table reference
     */
    public Product() {
        this(DSL.name("Product"), null);
    }

    public <O extends Record> Product(Table<O> child, ForeignKey<O, ProductRecord> key) {
        super(child, key, PRODUCT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : NextGraphqlAdmin.NEXT_GRAPHQL_ADMIN;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PRODUCT_CATEGORY, Indexes.PRODUCT_USER);
    }

    @Override
    public UniqueKey<ProductRecord> getPrimaryKey() {
        return Keys.KEY_PRODUCT_PRIMARY;
    }

    @Override
    public List<UniqueKey<ProductRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_PRODUCT_PRODUCT_SKU);
    }

    @Override
    public List<ForeignKey<ProductRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PRODUCT_IBFK_1, Keys.PRODUCT_IBFK_2);
    }

    private transient Category _category;
    private transient User _user;

    /**
     * Get the implicit join path to the
     * <code>next_graphql_admin.Category</code> table.
     */
    public Category category() {
        if (_category == null)
            _category = new Category(this, Keys.PRODUCT_IBFK_1);

        return _category;
    }

    /**
     * Get the implicit join path to the <code>next_graphql_admin.User</code>
     * table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.PRODUCT_IBFK_2);

        return _user;
    }

    @Override
    public Product as(String alias) {
        return new Product(DSL.name(alias), this);
    }

    @Override
    public Product as(Name alias) {
        return new Product(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(String name) {
        return new Product(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(Name name) {
        return new Product(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, LocalDateTime, String, Integer, String, String, Integer, Integer, String, String, LocalDateTime, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}

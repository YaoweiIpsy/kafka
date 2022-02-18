/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables;


import com.bfa.models.Keys;
import com.bfa.models.NextGraphqlAdmin;
import com.bfa.models.tables.records.CategoryRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class Category extends TableImpl<CategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>next_graphql_admin.Category</code>
     */
    public static final Category CATEGORY = new Category();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryRecord> getRecordType() {
        return CategoryRecord.class;
    }

    /**
     * The column <code>next_graphql_admin.Category.createdAt</code>.
     */
    public final TableField<CategoryRecord, LocalDateTime> CREATEDAT = createField(DSL.name("createdAt"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>next_graphql_admin.Category.id</code>.
     */
    public final TableField<CategoryRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Category.name</code>.
     */
    public final TableField<CategoryRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Category.parent</code>.
     */
    public final TableField<CategoryRecord, String> PARENT = createField(DSL.name("parent"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Category.slug</code>.
     */
    public final TableField<CategoryRecord, String> SLUG = createField(DSL.name("slug"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.Category.updatedAt</code>.
     */
    public final TableField<CategoryRecord, LocalDateTime> UPDATEDAT = createField(DSL.name("updatedAt"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private Category(Name alias, Table<CategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Category(Name alias, Table<CategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>next_graphql_admin.Category</code> table
     * reference
     */
    public Category(String alias) {
        this(DSL.name(alias), CATEGORY);
    }

    /**
     * Create an aliased <code>next_graphql_admin.Category</code> table
     * reference
     */
    public Category(Name alias) {
        this(alias, CATEGORY);
    }

    /**
     * Create a <code>next_graphql_admin.Category</code> table reference
     */
    public Category() {
        this(DSL.name("Category"), null);
    }

    public <O extends Record> Category(Table<O> child, ForeignKey<O, CategoryRecord> key) {
        super(child, key, CATEGORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : NextGraphqlAdmin.NEXT_GRAPHQL_ADMIN;
    }

    @Override
    public UniqueKey<CategoryRecord> getPrimaryKey() {
        return Keys.KEY_CATEGORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<CategoryRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_CATEGORY_CATEGORY_SLUG);
    }

    @Override
    public Category as(String alias) {
        return new Category(DSL.name(alias), this);
    }

    @Override
    public Category as(Name alias) {
        return new Category(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Category rename(String name) {
        return new Category(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Category rename(Name name) {
        return new Category(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<LocalDateTime, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}

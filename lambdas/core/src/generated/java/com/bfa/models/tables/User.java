/*
 * This file is generated by jOOQ.
 */
package com.bfa.models.tables;


import com.bfa.models.Keys;
import com.bfa.models.NextGraphqlAdmin;
import com.bfa.models.enums.UserRole;
import com.bfa.models.enums.UserStatus;
import com.bfa.models.tables.records.UserRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>next_graphql_admin.User</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>next_graphql_admin.User.billing</code>.
     */
    public final TableField<UserRecord, String> BILLING = createField(DSL.name("billing"), SQLDataType.VARCHAR(191), this, "");

    /**
     * The column <code>next_graphql_admin.User.email</code>.
     */
    public final TableField<UserRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.User.emailConfirmationToken</code>.
     */
    public final TableField<UserRecord, String> EMAILCONFIRMATIONTOKEN = createField(DSL.name("emailConfirmationToken"), SQLDataType.VARCHAR(191), this, "");

    /**
     * The column <code>next_graphql_admin.User.googleId</code>.
     */
    public final TableField<UserRecord, String> GOOGLEID = createField(DSL.name("googleId"), SQLDataType.VARCHAR(191), this, "");

    /**
     * The column <code>next_graphql_admin.User.hasCompletedOnboarding</code>.
     */
    public final TableField<UserRecord, Byte> HASCOMPLETEDONBOARDING = createField(DSL.name("hasCompletedOnboarding"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>next_graphql_admin.User.hasVerifiedEmail</code>.
     */
    public final TableField<UserRecord, Byte> HASVERIFIEDEMAIL = createField(DSL.name("hasVerifiedEmail"), SQLDataType.TINYINT, this, "");

    /**
     * The column <code>next_graphql_admin.User.id</code>.
     */
    public final TableField<UserRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.User.name</code>.
     */
    public final TableField<UserRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(191).nullable(false), this, "");

    /**
     * The column <code>next_graphql_admin.User.password</code>.
     */
    public final TableField<UserRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(191), this, "");

    /**
     * The column <code>next_graphql_admin.User.resetToken</code>.
     */
    public final TableField<UserRecord, String> RESETTOKEN = createField(DSL.name("resetToken"), SQLDataType.VARCHAR(191), this, "");

    /**
     * The column <code>next_graphql_admin.User.resetTokenExpiry</code>.
     */
    public final TableField<UserRecord, BigDecimal> RESETTOKENEXPIRY = createField(DSL.name("resetTokenExpiry"), SQLDataType.DECIMAL(65, 30), this, "");

    /**
     * The column <code>next_graphql_admin.User.role</code>.
     */
    public final TableField<UserRecord, UserRole> ROLE = createField(DSL.name("role"), SQLDataType.VARCHAR(7).nullable(false).defaultValue(DSL.inline("USER", SQLDataType.VARCHAR)).asEnumDataType(com.bfa.models.enums.UserRole.class), this, "");

    /**
     * The column <code>next_graphql_admin.User.status</code>.
     */
    public final TableField<UserRecord, UserStatus> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(8).nullable(false).defaultValue(DSL.inline("ACTIVE", SQLDataType.VARCHAR)).asEnumDataType(com.bfa.models.enums.UserStatus.class), this, "");

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>next_graphql_admin.User</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>next_graphql_admin.User</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    /**
     * Create a <code>next_graphql_admin.User</code> table reference
     */
    public User() {
        this(DSL.name("User"), null);
    }

    public <O extends Record> User(Table<O> child, ForeignKey<O, UserRecord> key) {
        super(child, key, USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : NextGraphqlAdmin.NEXT_GRAPHQL_ADMIN;
    }

    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_USER_USER_EMAIL, Keys.KEY_USER_USER_GOOGLEID);
    }

    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, Byte, Byte, String, String, String, String, BigDecimal, UserRole, UserStatus> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}

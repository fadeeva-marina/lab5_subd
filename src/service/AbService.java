/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lab5.DbManager;

/**
 *
 * @author ДНС
 */
public abstract class AbService<T> {

    protected DbManager dbManager;

    public AbService() {
    }

    public AbService(DbManager dbManager) {
        this.dbManager = dbManager;
    }

    public abstract void add(T entity) throws SQLException;

    public abstract ArrayList<T> all() throws SQLException;
//    public abstract void delete(T entity) throws SQLException;
//    public abstract void update(T entity) throws SQLException;

    public void setManager(DbManager dbManager) {
        this.dbManager = dbManager;
    }
}

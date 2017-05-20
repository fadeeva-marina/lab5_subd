/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab5.Area;
import lab5.DbManager;
import lab5.Hosp;
import lab5.JFrame;

/**
 *
 * @author ДНС
 */
public class HospService extends AbService<Hosp> {

    public HospService() {
    }

    public HospService(DbManager dbManager) {
        super(dbManager);
    }

    @Override
    public void add(Hosp entity) throws SQLException {
        try {
            String str = "INSERT INTO hosp " + " values('" + entity.getId() + "','" + entity.getName() + "','" + entity.getId_area() + "');";
            dbManager.executeUpdate(str);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList<Hosp> all() throws SQLException {
        ArrayList<Hosp> hosps = null;
        try {
            hosps = new ArrayList<>();
            hosps.add(null);
            ResultSet rs = dbManager.executeQuery("SELECT * FROM hosp");
            while (rs.next()) {
                Hosp hosp = new Hosp();
                hosp.setId(rs.getLong("id_hosp"));
                hosp.setId_area(rs.getLong("id_area"));
                hosp.setName(rs.getString("name"));
                hosps.add(hosp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hosps;
    }

}

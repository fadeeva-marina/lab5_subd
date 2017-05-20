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
import lab5.JFrame;

/**
 *
 * @author ДНС
 */
public class AreaService extends AbService<Area> {

    public AreaService() {
    }

    public AreaService(DbManager dbManager) {
        super(dbManager);
    }

    @Override
    public void add(Area entity) throws SQLException {
        try {
            String str = "INSERT INTO area " + " values('" + entity.getId() + "','" + entity.getDistrict() + "');";
            dbManager.executeUpdate(str);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList<Area> all() throws SQLException {
        ArrayList<Area> areas = null;
        //areas.add(null);
        try {
            areas = new ArrayList<>();
            areas.add(null);
            ResultSet rs = dbManager.executeQuery("SELECT * FROM area");
            while (rs.next()) {
                Area area = new Area();
                area.setId(rs.getLong("id_area"));
                area.setDistrict(rs.getString("district"));
                areas.add(area);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return areas;
    }
}

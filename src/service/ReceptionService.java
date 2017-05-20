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
import lab5.Reception;

/**
 *
 * @author ДНС
 */
public class ReceptionService extends AbService<Reception>{

    public ReceptionService() {
    }

    public ReceptionService(DbManager dbManager) {
        super(dbManager);
    }

    @Override
    public void add(Reception entity) throws SQLException {
        try {
            String query = "insert into reception values('" + entity.getId() + "','"
                    + entity.getDate() + "','" + entity.getId_doc() + "','" + entity.getId_serv() + "','" + entity.getId_card() + "','" + entity.getId_hosp() + "');";
            dbManager.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList<Reception> all() throws SQLException {
                ArrayList<Reception> receptions = null;
        try {
            receptions = new ArrayList<>();
            receptions.add(null);
            ResultSet rs = dbManager.executeQuery("SELECT * FROM reception");
            while (rs.next()) {
                Reception reception = new Reception();
                reception.setId(rs.getLong("id_rec"));
                reception.setDate(rs.getDate("data"));
                reception.setId_card(rs.getLong("id_card"));
                reception.setId_doc(rs.getLong("id_doctor"));
                reception.setId_hosp(rs.getLong("id_hosp"));
                reception.setId_serv(rs.getLong("id_service"));
                receptions.add(reception);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return receptions;
    }
    
}

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
import lab5.ServicePrice;

/**
 *
 * @author ДНС
 */
public class ServiceSerice extends AbService<ServicePrice> {

    public ServiceSerice() {
    }

    public ServiceSerice(DbManager dbManager) {
        super(dbManager);
    }

    @Override
    public void add(ServicePrice entity) throws SQLException {
        String str = "INSERT INTO hosp " + " values('" + entity.getId() + "','" + entity.getService() + "','" + entity.getPrice() + "');";
        dbManager.executeUpdate(str);
    }

    @Override
    public ArrayList<ServicePrice> all() throws SQLException {
                ArrayList<ServicePrice> servicePrices = null;
        try {
            servicePrices = new ArrayList<>();
            servicePrices.add(null);
            ResultSet rs = dbManager.executeQuery("SELECT * FROM serviceprice");
            while (rs.next()) {
                ServicePrice servicePrice = new ServicePrice();
                servicePrice.setId(rs.getLong("id_service"));
                servicePrice.setService(rs.getString("service"));
                servicePrice.setPrice(rs.getDouble("serviceprice"));
                servicePrices.add(servicePrice);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return servicePrices;
    }

}

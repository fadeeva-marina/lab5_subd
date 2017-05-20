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
import lab5.Doctor;
import lab5.JFrame;

/**
 *
 * @author ДНС
 */
public class DoctorService extends AbService<Doctor> {

    public DoctorService() {
    }

    public DoctorService(DbManager dbManager) {
        super(dbManager);
    }

    @Override
    public void add(Doctor entity) throws SQLException {
        try {
            String query = "insert into doctor values('" + entity.getId() + "','"
                    + entity.getFirstName() + "','" + entity.getLastName() + "','" + entity.getMiddleName() + "','" + entity.getId_post() + "','" + entity.getId_hosp() + "');";
            dbManager.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList<Doctor> all() throws SQLException {
                ArrayList<Doctor> doctors = null;
        //areas.removeAll(areas);
        //areas.add(null);
        try {
            doctors = new ArrayList<>();
            doctors.add(null);
            ResultSet rs = dbManager.executeQuery("SELECT * FROM doctor");
            while (rs.next()) {
                Doctor doctor = new Doctor();
                doctor.setId(rs.getLong("id_doctor"));
                doctor.setLastName(rs.getString("surname"));
                doctor.setFirstName(rs.getString("name"));
                doctor.setMiddleName(rs.getString("middlename"));
                doctor.setId_post(rs.getLong("id_post"));
                doctor.setId_hosp(rs.getLong("id_hosp"));
                doctors.add(doctor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doctors;
    }

}

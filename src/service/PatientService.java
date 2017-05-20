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
import lab5.Patient;

/**
 *
 * @author ДНС
 */
public class PatientService extends AbService<Patient> {

    public PatientService() {
    }

    public PatientService(DbManager dbManager) {
        super(dbManager);
    }

    @Override
    public void add(Patient entity) throws SQLException {
        try {
            String query = "insert into patient values('" + entity.getId() + "','"
                    + entity.getFirstName() + "','" + entity.getLastName() + "','" + entity.getMiddleName() + "','" + entity.getDob() + "','" + entity.getId_area() + "');";
            dbManager.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList<Patient> all() throws SQLException {
        ArrayList<Patient> patients = null;
        try {
            patients = new ArrayList<>();
            patients.add(null);
            ResultSet rs = dbManager.executeQuery("SELECT * FROM patient");
            while (rs.next()) {
                Patient patient = new Patient();
                patient.setId(rs.getLong("id_card"));
                patient.setLastName(rs.getString("surname"));
                patient.setFirstName(rs.getString("name"));
                patient.setMiddleName(rs.getString("middlename"));
                patient.setDob(rs.getDate("dob"));
                patient.setId_area(rs.getLong("id_area"));
                patients.add(patient);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patients;
    }

}

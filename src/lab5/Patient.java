/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.sql.Date;

/**
 *
 * @author ДНС
 */
public class Patient {

    private long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date dob;
    private long id_area;

    public Patient() {
    }

    public Patient(long id, String firstName, String lastName, String middleName, Date dob, long id_area) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dob = dob;
        this.id_area = id_area;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getDob() {
        return dob;
    }

    public long getId_area() {
        return id_area;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setId_area(long id_area) {
        this.id_area = id_area;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }

    public String toString2() {
        return lastName + " " + firstName + " " + middleName;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author ДНС
 */
public class Doctor {

    private long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private long id_post;
    private long id_hosp;

    public Doctor() {
    }

    public Doctor(long id, String firstName, String lastName, String middleName, long id_post, long id_hosp) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.id_post = id_post;
        this.id_hosp = id_hosp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public long getId_post() {
        return id_post;
    }

    public void setId_post(long id_post) {
        this.id_post = id_post;
    }

    public long getId_hosp() {
        return id_hosp;
    }

    public void setId_hosp(long id_hosp) {
        this.id_hosp = id_hosp;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String toString2() {
        return firstName + " " + lastName + " " + middleName;
    }
}

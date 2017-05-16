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
public class Hosp {

    private long id;
    private String name;
    private long id_area;

    public Hosp() {
    }

    public Hosp(long id, String name, long id_area) {
        this.id = id;
        this.name = name;
        this.id_area = id_area;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId_area() {
        return id_area;
    }

    public void setId_area(long id_area) {
        this.id_area = id_area;
    }

    @Override
    public String toString() {
        return name;
    }

}

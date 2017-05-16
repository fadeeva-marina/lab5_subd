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
public class Reception {

    private long id;
    private Date date;
    private long id_doc;
    private long id_serv;
    private long id_card;
    private long id_hosp;

    public Reception() {
    }

    public Reception(long id, Date date, long id_doc, long id_serv, long id_card, long id_hosp) {
        this.id = id;
        this.date = date;
        this.id_doc = id_doc;
        this.id_serv = id_serv;
        this.id_card = id_card;
        this.id_hosp = id_hosp;
    }

    public long getId_doc() {
        return id_doc;
    }

    public void setId_doc(long id_doc) {
        this.id_doc = id_doc;
    }

    public long getId_serv() {
        return id_serv;
    }

    public void setId_serv(long id_serv) {
        this.id_serv = id_serv;
    }

    public long getId_card() {
        return id_card;
    }

    public void setId_card(long id_card) {
        this.id_card = id_card;
    }

    public long getId_hosp() {
        return id_hosp;
    }

    public void setId_hosp(long id_hosp) {
        this.id_hosp = id_hosp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reception{" + "date=" + date + ", id_doc=" + id_doc + ", id_serv=" + id_serv + ", id_card=" + id_card + ", id_hosp=" + id_hosp + '}';
    }

}

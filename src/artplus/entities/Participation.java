/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.entities;

import java.sql.Timestamp;

/**
 *
 * @author rahma
 */
public class Participation {
    private int id_part;
    private int id_user;
    private int id_ev;
    private Timestamp date_participation;

    public Participation() {
    }

    public Participation(int id_part, int id_user, int id_ev, Timestamp date_participation) {
        this.id_part = id_part;
        this.id_user = id_user;
        this.id_ev = id_ev;
        this.date_participation = date_participation;
    }

    public Participation(int id_user, int id_ev, Timestamp date_participation) {
        this.id_user = id_user;
        this.id_ev = id_ev;
        this.date_participation = date_participation;
    }

    public int getId_part() {
        return id_part;
    }

    public void setId_part(int id_part) {
        this.id_part = id_part;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_ev() {
        return id_ev;
    }

    public void setId_ev(int id_ev) {
        this.id_ev = id_ev;
    }

    public Timestamp getDate_participation() {
        return date_participation;
    }

    public void setDate_participation(Timestamp date_participation) {
        this.date_participation = date_participation;
    }

    @Override
    public String toString() {
        return "Participation{" + "id_part=" + id_part + ", id_user=" + id_user + ", id_ev=" + id_ev + ", date_participation=" + date_participation + '}';
    }
    
    
}

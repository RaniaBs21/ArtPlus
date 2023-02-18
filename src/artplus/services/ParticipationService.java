/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;

import artplus.entities.Participation;
import artplus.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rahma
 */
public class ParticipationService implements InterfaceParticipation<Participation> {

    Connection cnx;

    public ParticipationService() {
        cnx = MyConnection.getInstance().getCnx();
    }

    @Override
    public void ajouterParticipation(Participation part) {
        try {
            String req = "INSERT INTO participation(Id_Ut,id_ev) VALUES (?,?)";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, part.getId_user());
            pst.setInt(2, part.getId_ev());
            pst.setTimestamp(3, part.getDate_participation());

            pst.executeUpdate();
            System.out.println("participation est ajoutée avec succès! ");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Participation> afficherParticipation() {
        List<Participation> listParticipation = new ArrayList<>();

        try {
            String req2 = "SELECT * FROM participation";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req2);
            while (rs.next()) {
                Participation part = new Participation();
                part.setId_part(rs.getInt(1));
                part.setId_user(rs.getInt("Id_Ut"));
                part.setId_ev(rs.getInt("id_ev"));
                part.setDate_participation(rs.getTimestamp("date_participation"));
                listParticipation.add(part);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listParticipation;
    }

}

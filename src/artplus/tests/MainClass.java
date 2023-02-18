/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.tests;

import artplus.entities.Evenement;
import artplus.services.EvenementService;
import artplus.utils.MyConnection;

/**
 *
 * @author rahma
 */
public class MainClass {

    public static void main(String[] args) {

        MyConnection mc = MyConnection.getInstance();
        EvenementService evs = new EvenementService();
        Evenement e = new Evenement(4, "CONCERT 50 ANS EN CHANSONS DU CARTHAGE SYMPHONY ORCHESTRA, LE 20 FÉVRIER 2023",
                "Musique",
                "Le theatre municipal de Tunis acueillera le CARTHAGE SYMPHONY ORCHESTRA, le 20 Fevrier",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tekiano.com%2F2021%2F12%2F28%2Fconcert-nouvel-an-2022-carthage-symphony-orchestra-lorchestre-symphonique-tunisien-au-rdv%2F&psig=AOvVaw2HOAzWvy337JLR8wyAC8TL&ust=1676806733434000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCKCgkIT-nv0CFQAAAAAdAAAAABAI",
                "Le theatre municipal de Tunis",
                java.sql.Timestamp.valueOf("2023-03-04 13:30:00"),
                25);
        Evenement e2 = new Evenement(4, "CONCERT 50 ANS EN CHANSONS DU CARTHAGE SYMPHONY ORCHESTRA, LE 20 FÉVRIER 2023",
                "Art",
                "Le theatre municipal de Tunis acueillera le CARTHAGE SYMPHONY ORCHESTRA, le 20 Fevrier ",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tekiano.com%2F2021%2F12%2F28%2Fconcert-nouvel-an-2022-carthage-symphony-orchestra-lorchestre-symphonique-tunisien-au-rdv%2F&psig=AOvVaw2HOAzWvy337JLR8wyAC8TL&ust=1676806733434000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCKCgkIT-nv0CFQAAAAAdAAAAABAI",
                "Le theatre municipal de Tunis",
                java.sql.Timestamp.valueOf("2023-03-04 13:30:00"),
                25);
        //evs.ajouterEvenement(e);
        evs.modifierEvenement(e2);
        evs.supprimerEvenement(5);

        //*** pour afficher la liste des evenements
        System.out.println(evs.afficherEvenements());

    }

}

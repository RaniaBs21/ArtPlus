/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.artplus.services;

import edu.artplus.entities.Abonement;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface InterfaceAbonement {
     public void ajouterAbonement();
      public void ajouterAbonment2(Abonement ab);
       public void modifierAbonement(Abonement ab) ;
       public List<Abonement> afficherAbonement();
        public void supprimerAbonement(int Id_abon);
    
}

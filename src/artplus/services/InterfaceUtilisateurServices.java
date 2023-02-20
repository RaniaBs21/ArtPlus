/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;
import artplus.entities.Utilisateur;
import java.util.List;

/**
 *
 * @author OACA
 */
public interface InterfaceUtilisateurServices {
    
     public void ajouterUtilisateur();
    public void ajouterUtilisateur2(Utilisateur u);
    public void modifierUtilisateur(Utilisateur u);
    public void supprimerUtilisateur(int Id_Ut);
    public List<Utilisateur> afficherUtilisateur();
    
    
}

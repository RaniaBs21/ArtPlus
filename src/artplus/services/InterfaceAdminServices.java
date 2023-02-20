/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;

import artplus.entities.Admin;
import java.util.List;

/**
 *
 * @author OACA
 */
public interface InterfaceAdminServices {
    
     public void ajouterAdmin();
    public void ajouterAdmin2(Admin a);
    public void modifierAdmin(Admin a);
    public void supprimerAdmin(int Id_Ad);
    public List<Admin> afficherAdmin();
    
}
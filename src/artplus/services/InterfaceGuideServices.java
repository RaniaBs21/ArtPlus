/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;

import artplus.entities.Guide;
import java.util.List;

/**
 *
 * @author OACA
 */
public interface InterfaceGuideServices {
    
     public void ajouterGuide();
    public void ajouterGuide2(Guide g);
    public void modifierGuide(Guide g);
    public void supprimerGuide(int Id_Gd);
    public List<Guide> afficherGuide();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.services;

import java.util.List;

/**
 *
 * @author rahma
 * @param <Participation>
 */
public interface InterfaceParticipation <Participation> {
    public void ajouterParticipation(Participation p);
    public List<Participation> afficherParticipation();
    
}

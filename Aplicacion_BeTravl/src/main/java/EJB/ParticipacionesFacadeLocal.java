/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.Participaciones;

/**
 *
 * @author julian
 */
@Local
public interface ParticipacionesFacadeLocal {

    void create(Participaciones participaciones);

    void edit(Participaciones participaciones);

    void remove(Participaciones participaciones);

    Participaciones find(Object id);

    List<Participaciones> findAll();

    List<Participaciones> findRange(int[] range);

    int count();
    
}

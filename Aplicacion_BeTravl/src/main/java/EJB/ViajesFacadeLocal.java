/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.Viajes;

/**
 *
 * @author julian
 */
@Local
public interface ViajesFacadeLocal {

    void create(Viajes viajes);

    void edit(Viajes viajes);

    void remove(Viajes viajes);

    Viajes find(Object id);

    List<Viajes> findAll();

    List<Viajes> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.Recompensas;

/**
 *
 * @author julian
 */
@Local
public interface RecompensasFacadeLocal {

    void create(Recompensas recompensas);

    void edit(Recompensas recompensas);

    void remove(Recompensas recompensas);

    Recompensas find(Object id);

    List<Recompensas> findAll();

    List<Recompensas> findRange(int[] range);

    int count();
    
}

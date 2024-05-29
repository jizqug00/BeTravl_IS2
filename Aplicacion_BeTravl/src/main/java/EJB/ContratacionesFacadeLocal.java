/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.Contrataciones;

/**
 *
 * @author julian
 */
@Local
public interface ContratacionesFacadeLocal {

    void create(Contrataciones contrataciones);

    void edit(Contrataciones contrataciones);

    void remove(Contrataciones contrataciones);

    Contrataciones find(Object id);

    List<Contrataciones> findAll();

    List<Contrataciones> findRange(int[] range);

    int count();
    
}

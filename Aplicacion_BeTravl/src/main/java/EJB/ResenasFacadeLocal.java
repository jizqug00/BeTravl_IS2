/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.Resenas;

/**
 *
 * @author julian
 */
@Local
public interface ResenasFacadeLocal {

    void create(Resenas resenas);

    void edit(Resenas resenas);

    void remove(Resenas resenas);

    Resenas find(Object id);

    List<Resenas> findAll();

    List<Resenas> findRange(int[] range);

    int count();
    
}

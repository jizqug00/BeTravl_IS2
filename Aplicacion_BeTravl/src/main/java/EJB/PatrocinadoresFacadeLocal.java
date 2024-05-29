/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.Patrocinadores;

/**
 *
 * @author julian
 */
@Local
public interface PatrocinadoresFacadeLocal {

    void create(Patrocinadores patrocinadores);

    void edit(Patrocinadores patrocinadores);

    void remove(Patrocinadores patrocinadores);

    Patrocinadores find(Object id);

    List<Patrocinadores> findAll();

    List<Patrocinadores> findRange(int[] range);

    int count();
    
}

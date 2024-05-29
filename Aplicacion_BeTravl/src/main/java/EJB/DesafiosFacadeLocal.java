/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.util.List;
import javax.ejb.Local;
import modelo.Desafios;

/**
 *
 * @author julian
 */
@Local
public interface DesafiosFacadeLocal {

    void create(Desafios desafios);

    void edit(Desafios desafios);

    void remove(Desafios desafios);

    Desafios find(Object id);

    List<Desafios> findAll();

    List<Desafios> findRange(int[] range);

    int count();
    
}

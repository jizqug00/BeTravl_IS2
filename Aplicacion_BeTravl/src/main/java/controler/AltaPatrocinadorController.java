/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import EJB.PatrocinadoresFacadeLocal;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Patrocinadores;

/**
 *
 * @author julian
 */

@Named
@ViewScoped

public class AltaPatrocinadorController implements Serializable{
    
    private Patrocinadores patrocinador;
    
    @EJB
    private PatrocinadoresFacadeLocal patrocinadoresEJB;
    
    @PostConstruct
    public void init(){
        patrocinador = new Patrocinadores();
    }
    
    public void insertarPatrocinador(){
        
        patrocinadoresEJB.create(patrocinador);
        
    }

    public Patrocinadores getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinadores patrocinador) {
        this.patrocinador = patrocinador;
    }

    public PatrocinadoresFacadeLocal getPatrocinadoresEJB() {
        return patrocinadoresEJB;
    }

    public void setPatrocinadoresEJB(PatrocinadoresFacadeLocal patrocinadoresEJB) {
        this.patrocinadoresEJB = patrocinadoresEJB;
    }
    
    
}

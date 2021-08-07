/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

import java.util.logging.Logger;

/**
 *
 * @author laura
 */
public class ProcedimientoVO {

    private String PRO_ID, PRO_NOMBRE, PRO_ESTADO;
     
    public ProcedimientoVO(String PRO_ID, String PRO_NOMBRE, String PRO_ESTADO) {
        this.PRO_ID = PRO_ID;
        this.PRO_NOMBRE = PRO_NOMBRE;
        this.PRO_ESTADO = PRO_ESTADO;
    }
    
    
    public ProcedimientoVO(){
    }

    public String getPRO_ID() {
        return PRO_ID;
    }

    public void setPRO_ID(String PRO_ID) {
        this.PRO_ID = PRO_ID;
    }

    public String getPRO_NOMBRE() {
        return PRO_NOMBRE;
    }

    public void setPRO_NOMBRE(String PRO_NOMBRE) {
        this.PRO_NOMBRE = PRO_NOMBRE;
    }

    public String getPRO_ESTADO() {
        return PRO_ESTADO;
    }

    public void setPRO_ESTADO(String PRO_ESTADO) {
        this.PRO_ESTADO = PRO_ESTADO;
    }
   

}

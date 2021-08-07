/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorgito Oooome
 */
public class PruebaVO {

    private String pru_id, pru_fecha_inicio,  pru_fecha_fin, pru_nombre, FK_Usuario, FK_muestra,Fk_Solicitud, PRU_ESTADO;

    public PruebaVO(String pru_id, String pru_fecha_inicio, String pru_fecha_fin, String pru_nombre, String FK_Usuario, String FK_muestra, String Fk_Solicitud, String PRU_ESTADO) {
        this.pru_id = pru_id;
        this.pru_fecha_inicio = pru_fecha_inicio;
        this.pru_fecha_fin = pru_fecha_fin;
        this.pru_nombre = pru_nombre;
        this.FK_Usuario = FK_Usuario;
        this.FK_muestra = FK_muestra;
        this.Fk_Solicitud = Fk_Solicitud;
        this.PRU_ESTADO = PRU_ESTADO;
    }




    
    
    public PruebaVO() {
    }

    public PruebaVO(PruebaVO pruVO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getFK_Usuario() {
        return FK_Usuario;
    }

    public void setFK_Usuario(String FK_Usuario) {
        this.FK_Usuario = FK_Usuario;
    }

    public String getFK_muestra() {
        return FK_muestra;
    }

    public void setFK_muestra(String FK_muestra) {
        this.FK_muestra = FK_muestra;
    }
  
    public String getPru_id() {
        return pru_id;
    }

    public void setPru_id(String pru_id) {
        this.pru_id = pru_id;
    }

    public String getPru_fecha_inicio() {
        return pru_fecha_inicio;
    }

    public void setPru_fecha_inicio(String pru_fecha_inicio) {
        this.pru_fecha_inicio = pru_fecha_inicio;
    }

    public String getPru_fecha_fin() {
        return pru_fecha_fin;
    }

    public void setPru_fecha_fin(String pru_fecha_fin) {
        this.pru_fecha_fin = pru_fecha_fin;
    }

    public String getPru_nombre() {
        return pru_nombre;
    }

    public void setPru_nombre(String pru_nombre) {
        this.pru_nombre = pru_nombre;
    }

    public String getPRU_ESTADO() {
        return PRU_ESTADO;
    }

    public void setPRU_ESTADO(String PRU_ESTADO) {
        this.PRU_ESTADO = PRU_ESTADO;
    }

    public String getFk_Solicitud() {
        return Fk_Solicitud;
    }

    public void setFk_Solicitud(String Fk_Solicitud) {
        this.Fk_Solicitud = Fk_Solicitud;
    }

    
    
}

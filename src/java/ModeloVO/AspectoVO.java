/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author laura
 */
public class AspectoVO {
    
    private String ASP_ID, ASP_NOMBRE,  ASP_DESCRIPCION, FK_procedimiento, FK_Tipo_ensayo, ASP_ESTADO;
    
    public AspectoVO(String ASP_ID, String ASP_NOMBRE, String ASP_DESCRIPCION, String FK_procedimiento, String FK_Tipo_ensayo, String ASP_ESTADO) {
        this.ASP_ID = ASP_ID;
        this.ASP_NOMBRE = ASP_NOMBRE;
        this.ASP_DESCRIPCION = ASP_DESCRIPCION;
        this.FK_procedimiento = FK_procedimiento;
        this.FK_Tipo_ensayo = FK_Tipo_ensayo;
        this.ASP_ESTADO = ASP_ESTADO;
    }
    public AspectoVO() {
    }

    public String getASP_ID() {
        return ASP_ID;
    }

    public void setASP_ID(String ASP_ID) {
        this.ASP_ID = ASP_ID;
    }

    public String getASP_NOMBRE() {
        return ASP_NOMBRE;
    }

    public void setASP_NOMBRE(String ASP_NOMBRE) {
        this.ASP_NOMBRE = ASP_NOMBRE;
    }

    public String getASP_DESCRIPCION() {
        return ASP_DESCRIPCION;
    }

    public void setASP_DESCRIPCION(String ASP_DESCRIPCION) {
        this.ASP_DESCRIPCION = ASP_DESCRIPCION;
    }

    public String getFK_procedimiento() {
        return FK_procedimiento;
    }

    public void setFK_procedimiento(String FK_procedimiento) {
        this.FK_procedimiento = FK_procedimiento;
    }

    public String getFK_Tipo_ensayo() {
        return FK_Tipo_ensayo;
    }

    public void setFK_Tipo_ensayo(String FK_Tipo_ensayo) {
        this.FK_Tipo_ensayo = FK_Tipo_ensayo;
    }

    public String getASP_ESTADO() {
        return ASP_ESTADO;
    }

    public void setASP_ESTADO(String ASP_ESTADO) {
        this.ASP_ESTADO = ASP_ESTADO;
    }
    
    }
    

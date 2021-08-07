/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.PruebaVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorgito Oooome
 */
public class PruebaDAO extends Conexion implements Crud {
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion = false;
    private String sql;
    
    private String pru_id= "", pru_fecha_inicio="", pru_fecha_fin="", pru_nombre="", FK_Usuario="", FK_muestra="",Fk_Solicitud="",PRU_ESTADO="";
    
   
    private int max_records = 1000;
    private PruebaVO pruVO;
 
    public PruebaDAO() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbestudiosuelos", "root", "");
 
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public PruebaDAO(PruebaVO pruVO) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbestudiosuelos", "root", "");
            pru_id = pruVO.getPru_id();
            pru_fecha_inicio = pruVO.getPru_fecha_inicio();
            pru_fecha_fin= pruVO.getPru_fecha_fin();
            pru_nombre= pruVO.getPru_nombre();
            FK_Usuario= pruVO.getFK_Usuario();
            FK_muestra= pruVO.getFK_muestra();
            Fk_Solicitud = pruVO.getFk_Solicitud();
            PRU_ESTADO = pruVO.getPRU_ESTADO();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
    }
    
    
      public List<PruebaVO> getprueba2() throws SQLException {
        List<PruebaVO> res = new ArrayList<PruebaVO>();
        PruebaVO  red= null;
        
            sql = "CALL SeleccionarPrueba";

            puente = conexion.prepareStatement( "CALL SeleccionarPrueba ");
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                red = new PruebaVO(mensajero.getString("pru_id"), mensajero.getString("pru_fecha_inicio"),mensajero.getString("pru_fecha_fin"), mensajero.getString("pru_nombre"), mensajero.getString("FK_Usuario"), mensajero.getString("FK_muestra"),mensajero.getString("Fk_Solicitud"),mensajero.getString("PRU_ESTADO"));
                res.add(red);
            }
 
        return res;
    }

   public boolean agregarRegistro() {
        
      try {
            sql = "call RegistrarPrueba (?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, pru_fecha_inicio);
            puente.setString(2, pru_fecha_fin);
            puente.setString(3, pru_nombre);
            puente.setString(4, FK_Usuario);
            puente.setString(5, FK_muestra);
            puente.setString(6, Fk_Solicitud);
            puente.setString(7, PRU_ESTADO);


            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(PruebaDAO.class.getName()).log(Level.SEVERE, null, e);
       
          }
        return operacion;
   }     
     

    @Override
    public boolean actualizarRegistro() {
        
        try {

            sql = "CALL ActualizarPrueba(?,?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            
            puente.setString(1, pru_id);
            puente.setString(2, pru_fecha_inicio);
            puente.setString(3, pru_fecha_fin);
            puente.setString(4, pru_nombre);
            puente.setString(5, FK_Usuario);
            puente.setString(6, FK_muestra);
            puente.setString(7, Fk_Solicitud);
            puente.setString(8, PRU_ESTADO);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(PruebaDAO.class.getName()).log(Level.SEVERE, null, e);
       
        }
        return operacion; 
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PruebaVO consultarPrueba(String pru_id){

        PruebaVO pruVO = null;
        try {
            sql = "call ConsultarPrueba (?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, pru_id);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

                pruVO = new PruebaVO(mensajero.getString("pru_id"), 
                        mensajero.getString("pru_fecha_inicio"),
                        mensajero.getString("pru_fecha_fin"), 
                        mensajero.getString("pru_nombre"), 
                        mensajero.getString("FK_Usuario"), 
                        mensajero.getString("FK_muestra"),
                        mensajero.getString("Fk_Solicitud"),
                        mensajero.getString("PRU_ESTADO"));
            }

        } catch (Exception e) {
            Logger.getLogger(PruebaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return pruVO;
    }
    public ArrayList<PruebaVO> listar() {
        ArrayList<PruebaVO> listaPrueba = new ArrayList<>();

        try {
            sql = "CALL seleccionarPrueba";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                PruebaVO pruVO = new PruebaVO(mensajero.getString("pru_id"), 
                        mensajero.getString("pru_fecha_inicio"),
                        mensajero.getString("pru_fecha_fin"), 
                        mensajero.getString("pru_nombre"), 
                        mensajero.getString("FK_Usuario"), 
                        mensajero.getString("FK_muestra"),
                        mensajero.getString("Fk_Solicitud"),
                        mensajero.getString("PRU_ESTADO"));

                listaPrueba.add(pruVO);

            }

        } catch (Exception e) {
            Logger.getLogger(PruebaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaPrueba;

    }

}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ProcedimientoVO;
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
import javax.servlet.annotation.WebServlet;


/**
 *
 * @author laura
 */
@WebServlet(name = "ProcedimientoDAO", urlPatterns = {"/ProcedimientoDAO"})
public class ProcedimientoDAO extends Conexion implements Crud {
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion = false;
    private String sql;
    
    private String PRO_ID= "", PRO_NOMBRE="", PRO_ESTADO="";
    
   
    private int max_records = 1000;
    private ProcedimientoVO proVO;
 
    public ProcedimientoDAO() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbestudiosuelos", "root", "");
 
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public ProcedimientoDAO(ProcedimientoVO proVO) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbestudiosuelos", "root", "");
            PRO_ID = proVO.getPRO_ID();
            PRO_NOMBRE = proVO.getPRO_NOMBRE();
            PRO_ESTADO= proVO.getPRO_ESTADO();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
    }
    
    
      public List<ProcedimientoVO> Listar() throws SQLException {
        List<ProcedimientoVO> res = new ArrayList<ProcedimientoVO>();
        ProcedimientoVO  red= null;
        
            sql = "Call SeleccionarProcedimiento";

            puente = conexion.prepareStatement( "Call SeleccionarProcedimiento");
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                red = new ProcedimientoVO(mensajero.getString("PRO_Id"), mensajero.getString("PRO_Nombre"),mensajero.getString("PRO_Estado"));
                res.add(red);
            }
 
        return res;
    }
      public ProcedimientoVO consultarProcedimiento(String PRO_ID){

        ProcedimientoVO proVO = null;
        try {
            sql = "CALL ConsultarProcedimiento (?) ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, PRO_ID);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

                proVO = new ProcedimientoVO(mensajero.getString("PRO_ID"), 
                        mensajero.getString("PRO_NOMBRE"),
                        mensajero.getString("PRO_ESTADO"));
            }

        } catch (Exception e) {
            Logger.getLogger(PruebaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return proVO;
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "call RegistrarProcedimiento (?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, PRO_NOMBRE);
            puente.setString(2, PRO_ESTADO);
            
            
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

            sql = "CALL ActualizarProcedimiento(?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, PRO_ID);
            puente.setString(2, PRO_NOMBRE);
            puente.setString(3, PRO_ESTADO);
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

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.UsuarioVO;
import Util.Conexion;
import Util.Crud;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilo
 */
public class UsuarioDAO extends Conexion implements Crud{
//1.  Declarar variables u objetos 

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String usuId = "", UsuNombre = "", UsuPassword = "",UsuCorreo="";

    //2. Metodo principal para recibir los datos del VO
    public UsuarioDAO(UsuarioVO usuVO) {

        super();
        try {
            //3.Conectarse a la BD 
            conexion = this.obtenerConexión();
            //4. Traer el DAO los datos del VO para la operacion
            usuId = usuVO.getUsuId();
            UsuNombre = usuVO.getUsuNombre();
            UsuCorreo = usuVO.getUsuCorreo();
            UsuPassword = usuVO.getUsuPassword();
            
            

        } catch (Exception e) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @Override
    public boolean agregarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean iniciarSesion(String correo, String clave){
        try {

            conexion = this.obtenerConexión();
            sql = "select * from usuario where usuLogin=? and usuPassWord=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, correo);
            puente.setString(2, clave);
            mensajero = puente.executeQuery();
            if (mensajero.next()) {
                operacion = true;
            }

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            
        } finally {
            //this.cerrarConexion();

        }
        return operacion;

    }
    public ArrayList<UsuarioVO> rol(String usuario) {

        
        ArrayList<UsuarioVO> listaRoles = new ArrayList<>();

        try {

            conexion = this.obtenerConexión();
            sql = "SELECT usuario.USUID, rol.ROLTIPO\n"
                    + "FROM rol INNER JOIN\n"
                    + "usuario_rol ON rol.ROLID = usuario_rol.ROLID INNER JOIN\n"
                    + "usuario ON usuario_rol.USUID = usuario.USUID\n"
                    + "WHERE usuario.USULOGIN = ?";
            puente  = conexion.prepareStatement(sql);
            puente.setString(1,usuario);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                UsuarioVO usuVO = new UsuarioVO(mensajero.getString(1),mensajero.getString(2));
                listaRoles.add(usuVO);
            }

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
            

        
        return listaRoles;
    }
    }


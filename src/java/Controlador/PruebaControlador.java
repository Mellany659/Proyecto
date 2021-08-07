/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.PruebaDAO;
import ModeloVO.PruebaVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author laura
 */
@WebServlet(name = "PruebaControlador", urlPatterns = {"/PruebaControlador"})
public class PruebaControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String pru_id = request.getParameter("Id");
        String pru_fecha_inicio = request.getParameter("FechaInicio");
        String pru_fecha_fin = request.getParameter("FechaFin");
        String pru_nombre = request.getParameter("Nombre");
        String FK_Usuario = request.getParameter("Usuario");
        String FK_muestra = request.getParameter("Muestra");
        String PRU_ESTADO = request.getParameter("Estado");
        String Fk_Solicitud = request.getParameter("Solicitud");
        
        PruebaVO pruVO = new PruebaVO(pru_id, pru_fecha_inicio, pru_fecha_fin, pru_nombre, FK_Usuario, FK_muestra,Fk_Solicitud, PRU_ESTADO);
        
        PruebaDAO pruDAO = new PruebaDAO(pruVO);
        
        
                switch (opcion){
                    
                    case 1:
                        if (pruDAO.agregarRegistro()) {
                            request.setAttribute("Mesanjeexito","La prueba se registro correctamente" );
                            
                        }else{
                            request.setAttribute("Mesanjeerror","La prueba no se registro correctamente" );
                        
                        }
                        response.sendRedirect("Prueba.jsp");
                        break;
                        
                case 2: // Actualizar Registro

                if (pruDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "La prueba se Actualizó correctamente");
                    
                    
                } else {
                    request.setAttribute("mensajeError", "La prueba NO se Actualizó correctamente");

                }
                    request.getRequestDispatcher("Prueba.jsp").forward(request, response);
                break;

                       
                
                case 3:

                pruVO = pruDAO.consultarPrueba(pru_id);
                if (pruVO != null) {

                    request.setAttribute("PruebaConsultada", pruVO);
                request.getRequestDispatcher("actualizarPrueba.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "La prueba NO Existe");
                request.getRequestDispatcher("Prueba.jsp").forward(request, response);
                

                }
                break;

    
    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.ProcedimientoDAO;
import ModeloVO.ProcedimientoVO;
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
@WebServlet(name = "ProcedimientoControlador", urlPatterns = {"/ProcedimientoControlador"})
public class ProcedimientoControlador extends HttpServlet {

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
        int opciones = Integer.parseInt(request.getParameter("opciones"));
        String PRO_ID = request.getParameter("Id");
        String PRO_NOMBRE = request.getParameter("Nombre");
        String PRO_ESTADO = request.getParameter("Estado");
        
        ProcedimientoVO proVO = new ProcedimientoVO(PRO_ID,PRO_NOMBRE,PRO_ESTADO);
        
        ProcedimientoDAO proDAO = new ProcedimientoDAO(proVO);
    
    
     switch (opciones){
         
        case 1:
                        if (proDAO.agregarRegistro()) {
                            request.setAttribute("Mesanjeexito","La prueba se registro correctamente" );
                            
                        }else{
                            request.setAttribute("Mesanjeerror","La prueba no se registro correctamente" );
                        
                        }
                        response.sendRedirect("Procedimiento.jsp");
                        break;
        case 2: 

                if (proDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "La prueba se Actualizó correctamente");

                } else {
                    request.setAttribute("mensajeError", "La prueba NO se Actualizó correctamente");

                }
                 request.getRequestDispatcher("Procedimiento.jsp").forward(request, response);
                break;

                       
               
                case 3:

                proVO = proDAO.consultarProcedimiento(PRO_ID);
                if (proVO != null) {

                    request.setAttribute("PruebaConsultada", proVO);
                request.getRequestDispatcher("ActualizarProcedimiento.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "La prueba NO Existe");
                request.getRequestDispatcher("Procedimiento.jsp").forward(request, response);
                

                }
               
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


<%-- 
    Document   : sesiones
    Created on : 19/06/2021, 09:14:47 PM
    Author     : Camilo
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    response.setHeader("Pragma","No-cache");
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires",0);

%>

<%
HttpSession buscarSesion = (HttpSession)request.getSession();
String usuario = "";
String usuarioId = "";
String datoId ="";
String Nombre ="";
String Apellido ="";
String TipoDoc ="";
String NumeroDoc ="";
String Telefono ="";
String Correo ="";

if (buscarSesion.getAttribute("datosUsuario")== null) {
        
    
    request.getRequestDispatcher("Login.jsp").forward(request, response);
    } else {
    UsuarioVO usuVO = (UsuarioVO)buscarSesion.getAttribute("datosUsuario");
    Correo = usuVO.getUsuCorreo();
   
    
}


%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Bienvenido: <%=usuario%></h1>
        
        <form method="post" action="Sesiones">
            <input type="submit" value="Cerrar Sesion">
        </form>
    </body>
</html>

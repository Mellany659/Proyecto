<%-- 
    Document   : Prueba
    Created on : 22/06/2021, 11:06:08 PM
    Author     : Jorgito Oooome
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PruebaDAO"%>
<%@page import="ModeloVO.PruebaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<DOCTYPE html>
    <html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>

    <title>Prueba</title>
</head>
 <body style="background-image: url('ccs/bootstrap.css'); background-size: cover; background-repeat: no-repeat"> 
       <form method="post" action="PruebaControlador">
     <nav class="navbar navbar-expand-lg navbar-dark bg-info"> 
         <a class="navbar-brand" href="Procedimiento.jsp">Procedimiento</a>
         <a class="navbar-brand" href="Prueba.jsp">Prueba</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <a href="" style="position:absolute; left:1226px; " class='btn btn-danger'>Cerrar sesión</a>
  </div>
</nav>
<div class="container">
<h1>Prueba</h1>

    <div class="row">
      <div class="col-lg-8"  style=" top:15px">
<div class="table-responsive" >
<table class='table table-hover'><div style="color: white;">
    <thead> 
        <tr>

            <th>Id</th>
            <th>Fecha Inicio</th>
            <th>Fecha Fin</th>
            <th>Nombre</th>
            <th>Usuario</th>
            <th>Muestra</th>
            <th>Solicitud</th>
            <th>Estado</th>
                
        </tr> 
   
             <%
           
            PruebaDAO pruDAO = new PruebaDAO();
           
           
                     for (PruebaVO elem : pruDAO.getprueba2()) {
                   
                      
             %>

        <tr>
            
                
                <td><%=elem.getPru_id()%></td>
                <td><%=elem.getPru_fecha_inicio()%></td>
                <td><%=elem.getPru_fecha_fin()%></td>
                <td><%=elem.getPru_nombre()%></td>
                <td><%=elem.getFK_Usuario()%></td>
                <td><%=elem.getFK_muestra()%></td>
                <td><%=elem.getFk_Solicitud()%></td>
                <td><%=elem.getPRU_ESTADO()%></td>
                
                
                
            </tr>
                
                  <%
           
                          }
             %>
           
      <br>
</tbody>
</table>
</div>
</div>
             
<div class="col-lg-4"  style="opacity: 90%; background-color: white;padding: 20px 20px 50px 53px;box-shadow: 0px 0px 10px #10707f;
position: absolute; left: 930px; height: 660px; width: 325px; align-content: center;">
    <h1>Prueba</h1>

            <div class="content-wrapper">

            <table>
                <tr>
                    <th>
                        ID Prueba
                        <input type="number" name="Id"> 
                        
                    </th>     
                </tr>
            </table><br>
            <button class="btn btn-success">Buscar Prueba</button>
          
            <input type="hidden" value="3" name="opcion"> 

        </DIV>
    <br>

      
        <section class="content-header">
            <a href="RegistrarPrueba.jsp" class="btn btn-success">
               <i class="fa fa-plus"></i> Registrar Prueba
            </a>
        </section>
    
    
    </DIV>
    </div>
    </DIV>
            </form>
            
   
</body>
</HTML>

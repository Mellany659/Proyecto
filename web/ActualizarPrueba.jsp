<%-- 
    Document   : actualizarPrueba
    Created on : 07-jul-2021, 19:07:45
    Author     : laura
--%>


<%@page import="ModeloVO.PruebaVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>

    <title>Prueba</title>
</head>
 <body style="background-image: url('ccs/bootstrap.css'); background-size: auto; background-repeat: no-repeat">
       
     <nav class="navbar navbar-expand-lg navbar-dark bg-info">
  <a class="navbar-brand" href="#">proyecto prueba 1</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown"> </DIV>
       
        
      
       <div>
  <%
            PruebaVO pruVO = (PruebaVO) request.getAttribute("PruebaConsultada");
            if (pruVO != null) {
                

       %>
       
      <form method="post" action="PruebaControlador">    
        <div class="col-lg-18"  style="opacity: 90%; background-color: white;  padding: 0px 20px 78px 29px;
    box-shadow: 0px 0px 10px #10707f; position: absolute; left: 80px; height: 600px; width: 537px;
    align-content: center; top: 103px;">
       
            <table>
                <tr>
                    <th>
                        <input type="hidden" name="Id" value="<%=pruVO.getPru_id()%>">
                        Fecha Inicio<br>
                        <input type="date" name="FechaInicio" value="<%=pruVO.getPru_fecha_fin()%>"><br><BR>
                        Fecha Fin<br>
                        <input type="date" name="FechaFin" value="<%=pruVO.getPru_fecha_fin()%>"><br><br>
                        Nombre<br>
                        <input type="text" name="Nombre" value="<%=pruVO.getPru_nombre()%>"><br><br>
                        Usuario<br>
                        <input type="number" name="Usuario" value="<%=pruVO.getFK_Usuario()%>"><br><br>
                        Muestra<br>
                        <input type="number" name="Muestra" value="<%=pruVO.getFK_muestra()%>"><br><br>
                        Solicitud<br>
                        <input type="number" name="Solicitud" value="<%=pruVO.getFk_Solicitud()%>"><br><br>
                        Estado<br>
                        <input type="radio" name="Estado" value="ACTIVO"> ACTIVO<br>
                        <input type="radio" name="Estado" value="INACTIVO"> INACTIVO<br>
                        </p>
                    </th>    
                </tr>           
            </table>
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">   
        <br><br>

    
            
              </DIV>            
       </form>
                    <%}%>
       </DIV>
       
            
                    

    </body>
</html>
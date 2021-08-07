<%-- 
    Document   : Procedimiento
    Created on : 31-jul-2021, 22:38:40
    Author     : laura
--%>

<%@page import="ModeloVO.ProcedimientoVO"%>
<%@page import="ModeloDAO.ProcedimientoDAO"%>
<DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>

    <title>Procedimiento</title>
</HEAD>
 <body style="background-image: url('ccs/bootstrap.css'); background-size: cover; background-repeat: no-repeat"> 
       <form method="post" action="ProcedimientoControlador">
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
<h1>Procedimiento</h1>

    <div class="row">
      <div class="col-lg-8"  style=" top:15px">
<div class="table-responsive" >
<table class='table table-hover'><div style="color: white;">
    <thead> 
        <tr>

            <th>Id</th>
            <th>Nombre</th>
            <th>Estado</th>
                
        </tr> 
   
             <%
           
            ProcedimientoDAO proDAO = new ProcedimientoDAO();
           
           
                     for (ProcedimientoVO elem : proDAO.Listar()) {
                   
                      
             %>

        <tr>
            
                
                <td><%=elem.getPRO_ID()%></td>
                <td><%=elem.getPRO_NOMBRE()%></td>
                <td><%=elem.getPRO_ESTADO()%></td>
                
                
                
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
    <h1>Procedimiento</h1>

            <div class="content-wrapper">

            <table>
                <tr>
                    <th>
                        ID Procedimiento
                        <input type="number" name="Id"> 
                        
                    </th>     
                </tr>
            </table><br>
            <button class="btn btn-success">Buscar Procedimiento</button>
          
            <input type="hidden" value="3" name="opciones"> 

        </DIV>
    <br>

      
        <section class="content-header">
            <a href="RegistrarProcedimiento.jsp" class="btn btn-success">
               <i class="fa fa-plus"></i> Registrar Procemiento
            </a>
        </section>
    
    </DIV>
    </div>
      </DIV>
    </DIV>
            </form>
             
            
    
</body>
</HTML>


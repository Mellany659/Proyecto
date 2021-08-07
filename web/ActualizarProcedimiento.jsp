<%-- 
    Document   : ActualizarProcedimiento
    Created on : 31-jul-2021, 22:39:44
    Author     : laura
--%>

<%@page import="ModeloVO.ProcedimientoVO"%>
<DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>

    <title>Prueba</title>
</HEAD>
 <body style="background-image: url('ccs/bootstrap.css'); background-size: auto; background-repeat: no-repeat">
       
     <nav class="navbar navbar-expand-lg navbar-dark bg-info">
  <a class="navbar-brand" href="#">proyecto prueba 1</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown"> </DIV>
       
        
      
       <div>
  <%
            ProcedimientoVO proVO = (ProcedimientoVO) request.getAttribute("PruebaConsultada");
            if (proVO != null) {
                

       %>
       
      <form method="post" action="ProcedimientoControlador">    
        <div class="col-lg-18"  style="opacity: 90%; background-color: white;  padding: 0px 20px 78px 29px;
    box-shadow: 0px 0px 10px #10707f; position: absolute; left: 80px; height: 600px; width: 537px;
    align-content: center; top: 103px;">
       
            <table>
                <tr>
                    <th>
                        <input type="hidden" name="Id" value="<%=proVO.getPRO_ID()%>">
                        Nombre<br>
                        <input type="text" name="Nombre" value="<%=proVO.getPRO_NOMBRE()%>"><br><br>
                        Estado<br>
                        <input type="text" name="Estado" value="<%=proVO.getPRO_ESTADO()%>"><br><br>
                    </TH>
                </tr>
            </TABLE>
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opciones">   
        <br><br>

    
            
              </DIV>            
       </form>
                    <%}%>
       </DIV>
       
            
                    

    </body>
</html>

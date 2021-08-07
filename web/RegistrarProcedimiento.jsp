<%-- 
    Document   : RegistrarProcedimiento
    Created on : 31-jul-2021, 22:38:57
    Author     : laura
--%>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>

    <title>Procedimiento</title>
</HEAD>
 <body style="background-image: url('ccs/bootstrap.css'); background-size: auto; background-repeat: no-repeat">
       
     <nav class="navbar navbar-expand-lg navbar-dark bg-info">
  <a class="navbar-brand" href="#">proyecto prueba 1</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown"> </DIV>
  
  <form method="GET" action="ProcedimientoControlador">
          
        <div class="col-lg-18"  style="opacity: 90%; background-color: white;  padding: 0px 20px 78px 29px;
    box-shadow: 0px 0px 10px #10707f; position: absolute; left: 80px; height: 600px; width: 537px;
    align-content: center; top: 103px;">
       
            
       <h1>Registrar Procedimiento</h1>

<div class="box-body">
    <div class="form-group">
        <LABEL class="col-sm-18 control-label"> Nombre </LABEL>
        <br>
        <input type="Text" name="Nombre" placeholder="Nombre del procedimiento">
         </DIV>
                    
        <div class="form-group">
        <LABEL class="col-sm-18 control-label"> Estado</LABEL>
        <br>
        <input type="text" name="Estado" placeholder="Estado">
        </DIV>
            <BUTTON> Registrar Procedimiento</BUTTON>
            <input type="hidden" value="1" name="opciones">
        </DIV>
        </div>
       </form>
    </body>
</html>
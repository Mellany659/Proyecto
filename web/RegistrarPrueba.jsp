<%-- 
    Document   : RegistrarPrueba
    Created on : 23/06/2021, 07:34:27 PM
    Author     : Jorgito Oooome
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.PruebaDAO"%>
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
  
      <form method="post" action="PruebaControlador">
          
        <div class="col-lg-18"  style="opacity: 90%; background-color: white;  padding: 0px 20px 78px 29px;
    box-shadow: 0px 0px 10px #10707f; position: absolute; left: 80px; height: 600px; width: 537px;
    align-content: center; top: 103px;">
       
            
       <h1>Registrar Prueba</h1>

<div class="box-body">
    <div class="form-group">
        <LABEL class="col-sm-18 control-label"> Fecha de inicio</LABEL>
        <br>
        <input type="date" name="FechaInicio" placeholder="Fecha Inicio">
         </DIV>
                    
        <div class="form-group">
        <LABEL class="col-sm-18 control-label"> Fecha de Fin</LABEL>
        <br>
        <input type="date" name="FechaFin" placeholder="Fecha Fin">
        </DIV>
                    
        <div class="form-group">
        <LABEL class="col-sm-18 control-label"> Nombre</LABEL>
        <br>
        <input type="text" name="Nombre" placeholder="Nombre">
         </DIV>
                    
        <div class="form-group">
        <LABEL class="col-sm-18 control-label"> Usuario</LABEL>
        <br>
        <input type="number" name="Usuario" placeholder="Id Usuario">
         </DIV>
        
        <div class="form-group">
        <LABEL class="col-sm-18 control-label"> Muestra</LABEL>
        <br>
        <input type="number" name="Muestra" placeholder="Id Muestra">
        </div>
        
           <div class="form-group">
        <LABEL class="col-sm-18 control-label"> Solicitud</LABEL>
        <br>
        <input type="number" name="Solicitud" placeholder="Id Solicitud">
        </div>
            <div class="form-group">
        <LABEL class="col-sm-18 control-label"> Estado</LABEL>
        <br>
        <input type="text" name="Estado" placeholder="Estado">
        </div>
         </DIV>
            <BUTTON> Registrar Prueba</BUTTON>
            <input type="hidden" value="1" name="opcion">
        </DIV>
       </form>
    </body>
</html>
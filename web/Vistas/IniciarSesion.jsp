<%-- 
    Document   : IniciarSesion
    Created on : 19/06/2021, 08:31:55 PM
    Author     : Camilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="assets/css/StyleLogin.css" rel="stylesheet" type="text/css"/>

    <title>Document</title>
</head>

<body>
    <form method="post" action="Usuario">
    <div class="part1">

        <div>


            <div class="login">

                <h1>Login</h1>
                
                <input class="txt" type="email" placeholder="Correo" id="usu">
                <input class="txt" type="password" placeholder="Contraseña" id="pas">
                <input type="hidden" id="opcion" name="opcion" value="1">
                <input class="submit" type="submit" value="Iniciar Sesion" id="boton">

                <label>Olvidaste tu contraseña?</label>
                <label>Terminos y condiciones</label>
                <%
                    if (request.getAttribute("MensajeError") != null) {  %>

                    <h2 id="Error">${mensajeError}</h2>
                        <%} else {%>
                        <h2 id="Error">${mensajeExito}</h2>
                            <% }%>

            </div>

        </div>

    </div>
    <script src="assets/js/Logica.js" type="text/javascript"></script>
  </form>  
</body>

</html>
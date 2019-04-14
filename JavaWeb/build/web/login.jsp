<%--
    Document   : login
    Created on : 11/11/2017, 05:42:25
    Author     : gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page - Login</title>
    </head>

    <body>
    <center>
        <form action="acesso" method="POST">
            <h2>Sistema de Login</h2>
            <p>Email:
                <input type="text" name="email" maxlength="60" >
            </p>

            <p>Senha:
                <input type="password" name="pass" maxlength="8" >
            </p>
            <input type="submit" value="Entrar" />&nbsp;&nbsp;

        </form><br/>
        <a href="/Atividade">Voltar</a>
    </center>
</body>
</html>

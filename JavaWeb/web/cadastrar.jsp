<%--
    Document   : inserir.jsp
    Created on : 04/11/2017, 13:51:05
    Author     : gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page - Cadastrar</title>
    </head>
    <body>
        <h2>Inserindo informações</h2>

        <form action="salvar" method="POST">
            <p>Nome Completo:z
                <input type="text" name="nome" maxlength="30" />
            </p>

            <p>Email:
                <input type="text" name="email" maxlength="60" >
            </p>

            <p>Senha:
                <input type="password" name="pass" maxlength="8" >
            </p>

            <p>Confirmar senha:
                <input type="password" name="pass2" maxlength="8" >
            </p>

            <input type="submit" value="Salvar" >

        </form>
    </body>
</html>





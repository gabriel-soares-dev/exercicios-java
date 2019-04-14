<%--
    Document   : pessoa
    Created on : 25/11/2017, 11:31:37
    Author     : gabriel
--%>

<%

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Pagev - Cadastro</title>
    </head>
    <body>
        <h2>Cadastro Pessoa</h2>
        <form action="save.jsp" method="POST">
            <p>Nome Completo:
                <input type="text" name="nome" required="true" id="nome" maxlength="60" />
            </p>

            <p>Email:
                <input type="email" required="true" name="email" id="email" maxlength="30" />
            </p>

            <p>Data Nascimento:
                <input type="date" required="true" name="nascimento" id="nascimento" maxlength="10" />
            </p>

            <p>Cpf:
                <input type="text" required="true" name="cpf" id="cpf" maxlength="14" />
            </p>

            <input type="submit" value="Salvar" name="salvar" />
            <%                out.print("<button onclick='history.go(-1)'>Voltar</button>");
            %>
        </form>
        <%
        %>
    </body>
</html>

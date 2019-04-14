<%--
    Document   : principal
    Created on : 11/11/2017, 06:32:54
    Author     : gabriel
--%>



<%@page import="Classes.Usuario"%>
<%@page import="java.util.Date"%>
<%@page import="Classes.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page - Home</title>
    </head>

    <body>


        <%

            String name = (String) request.getAttribute("nome");
            String email = (String) request.getAttribute("email");

            if ((request.getParameter("email") != null) && (request.getParameter("pass") != null)) {

        %>
        <h2>Seja bem-vindo</h2>
        <p><a href="busca.jsp"><span>Pesquisar</span></a>  </p>
        <div>
            <p>Nome:<%=name%>  </p>
            <p>Email:<%=email%>  </p>
            <a href="login.jsp"><span>Sair</span></a>
        </div>

        <h4>Cadastro Pessoa
            <a href="pessoa.jsp"><br/><button>Cadastrar</button></a></h4><br/><br/>

    </body>
</html>
<%
    } else {
        response.sendRedirect("login.jsp");
    }
%>
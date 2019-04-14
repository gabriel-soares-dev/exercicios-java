

<%@page import="Dados.DAOFactory"%>
<%@page import="Dados.PessoaDao"%>
<%@page import="Negocios.Fachada"%>
<%@page import="Classes.Pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page - Cadastro</title>
    </head>
    <%
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String cpf = request.getParameter("cpf");
        String nascimento = request.getParameter("nascimento");

        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setEmail(email);
        p.setNascimento(nascimento);
        p.setCpf(cpf);
        try {
            //PessoaDao factoryp = DAOFactory.getPessoaDao();
            //factoryp.insert(p);
            Fachada f = new Fachada();
            f.inserirPessoa(p);
            out.print("<script>alert('Registro salvo com sucesso');</script>");
        } catch (Exception e) {
            out.print(e.getMessage());
        }
    %>
    <body>

        <p><strong>Nome:</strong> <%=nome%> </p>
        <p><strong>Email:</strong> <u><%=email%></u> </p>
        <p><strong>Data Nascimento:</strong> <%=nascimento%> </p>
        <p><strong>Cpf:</strong>  <i> <%=cpf%> </i> </p>
        <button onclick="goBack()">Página inicial</button>
        <script>
            function goBack() {
                window.history.go(-2);
            }
        </script>
    </body>
</html>

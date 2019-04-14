<%--
    Document   : busca
    Created on : 26/11/2017, 10:07:45
    Author     : gabriel
--%>

<%@page import="Classes.Pessoa"%>
<%@page import="Negocios.Fachada"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="#" method="POST">
            <p>
                <strong>Pesquisar:</strong><input type="text" name="nome" placeholder="Nome da Pessoa..." required="true" />
            </p>
            <input type="submit" value="Enviar" name="submit" />

        </form>
    </center>
    <%
        String nome = request.getParameter("nome");
        if (request.getParameter("submit") != null) {
            if (request.getParameter("nome") == "" || request.getParameter("nome") == null) {
                out.print("<script>alert('Informe campo \'Nome\'!')</script>");
            } else {
                out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                out.println("<body>");

                try {

                    Fachada f = new Fachada();
                    for (Pessoa pessoa : f.listarPessoas()) {
                        if (pessoa.getNome().equals(nome)) {
                            out.println("<table border=\"2\">");
                            out.print("<tr bgcolor=\"#DCDCDC\">");
                            out.print("<th>Nome</th>");
                            out.print("<th>Data Nascimento</th>");
                            out.print("<th>Cpf</th>");
                            out.print("<th>Email</th>");
                            out.print("</tr>");
                            out.print("<tr>");
                            out.print("<td bgcolor=\"#87CEEB\">" + pessoa.getNome() + "</td>");
                            out.print("<td bgcolor=\"#EEE8AA\">" + pessoa.getNascimento() + "</td>");
                            out.print("<td bgcolor=\"#FF7F50\">" + pessoa.getCpf() + "</td>");
                            out.print("<td bgcolor=\"#F0FFFF\">" + pessoa.getEmail() + "</td>");
                            out.print("</tr>");
                            out.println("</table>");
                            break;
                        }
                    }

                } catch (Exception e) {
                    out.print(e.getMessage());
                }
                out.println("</body>");
                out.println("</html>");
            }
        }

    %>


</body>
</html>

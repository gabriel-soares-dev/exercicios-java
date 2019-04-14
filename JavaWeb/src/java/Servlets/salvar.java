/*
Estenda o exemplo anterior para salvar no banco de dados as informações passadas.
 */
package Servlets;

import Classes.Usuario;
import Dados.DAOFactory;
import Dados.DAOGenerico;
import Dados.UsuarioDao;

import Negocios.Fachada;
import Negocios.UsuarioControle;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabriel
 */
public class salvar extends HttpServlet {

    private UsuarioDao factoryUsuario;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        response.setContentType("text/html;charset=UTF-8");
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        String password2 = request.getParameter("pass2");
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.print("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />");
            out.println("<title>Valores informados</title>");
            out.println("</head>");
            out.println("<body>");
            if (nome.trim().equals("") && email.trim().equals("") && password.trim().equals("")) {
                out.print("<script>alert('Inserir campos obrigatório!');history.go(-1)</script>");
            } else if (nome.trim().equals("") || nome.trim().equals(null)) {
                out.print("<script>alert('Inserir campo \'Nome\' obrigatório!');history.go(-1)</script>");
            } else if (nome.trim().length() > 30) {
                out.print("<script>alert('Campo \'Nome\' deve ter menos de 30 caracteres!');history.go(-1)</script>");
            } else if (email.trim().equals("") || email.trim().equals(null)) {
                out.print("<script>alert('Inserir campo \'Email\' obrigatório!');history.go(-1)</script>");
            } else if (email.trim().length() > 60) {
                out.print("<script>alert('Campo \'Email\' deve ter menos de 60 caracteres!');history.go(-1)</script>");
            } else if (!m.find()) {
                out.print("<script>alert('Campo \'Email\' inválido');history.go(-1)</script>");
            } else if (password.trim().equals("") || password.trim().equals(null)) {
                out.print("<script>alert('Canpo \'Senha\' não conferem');history.go(-1)</script>");
            } else if (!password.trim().equals(password2.trim())) {
                out.print("<script>alert('Senhas não conferem');history.go(-1)</script>");
            } else {
                try {
                    Usuario user = new Usuario(nome, email, password);
                    Fachada f = new Fachada();
                    f.inserirUsuario(user);
                    out.println("<html>");
                    out.println("<head>");
                    out.print("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />");
                    out.println("<title>Valores informados</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.print("<h2>Registro enviado com sucesso!</h2>");
                    out.println("</body>");
                    out.print("<br/><br/><a href=\"listar\"><button type=\"button\">Lista de Registro</button></a>");
                    out.close();
                } catch (Exception e) {

                    out.println(e.getMessage());
                }
            }
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

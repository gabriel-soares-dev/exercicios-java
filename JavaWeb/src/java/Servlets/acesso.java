/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Classes.Usuario;
import Negocios.Fachada;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabriel
 */
public class acesso extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        String pass = request.getParameter("pass");
        String email = request.getParameter("email");
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet acesso</title>");
            out.println("</head>");
            out.println("<body>");
            if (email.trim().equals("") && pass.trim().equals("")) {
                out.print("<script>alert('Inserir campos obrigatório!');history.go(-1)</script>");
            } else if (email.trim().length() > 60) {
                out.print("<script>alert('Campo \'Email\' deve ter menos de 60 caracteres!');history.go(-1)</script>");
            } else if (!m.find()) {
                out.print("<script>alert('Campo \'Email\'');history.go(-1)</script>");
            } else if (pass.trim().equals("") || pass.trim().equals(null)) {
                out.print("<script>alert('Informe Canpo \'Senha\'');history.go(-1)</script>");
            } else {
                //RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
                //dispatcher.forward(request, response);
                try {
                    Fachada f = new Fachada();
                    for (Usuario funcionario : f.listarUsuarios()) {
                        if (funcionario.getEmail().equals(email) && funcionario.getPassword().equals(pass)) {
                            request.setAttribute("email", email);
                            Object nome = funcionario.getNome();
                            request.setAttribute("nome", nome);
                            request.getRequestDispatcher("principal.jsp").forward(request, response);
                            break;
                        }

                    }
                    response.getWriter().println("<script>alert('Usuário não cadastrado');history.go(-1)</script>");

                } catch (Exception e) {

                    out.println(e.getMessage());
                }

            }
            out.println("</body>");
            out.println("</html>");
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

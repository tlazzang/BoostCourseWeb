package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;

@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        out.print("<h1> Hello ," + name + "</h1>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><h1>Input your name</h1></head>");
        out.print("<body>");
        out.print("<form method = 'post' action = /firstweb/greet accept-charset=UTF-8>" +
                "name : <input type = 'text' name = 'name'><br>" +
                "<input type ='submit' value = '확인'><br>");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}

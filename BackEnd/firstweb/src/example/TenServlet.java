package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/ten")
public class TenServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int value = Integer.parseInt(request.getParameter("value"));
        out.print("<html>");
        out.print("<head>");
        out.print("<h1>1from " + value + "to</h1>");
        out.print("</head>");
        out.print("<body>");
        out.print("한글테스트");
        for(int i = 1; i <= value; i++){
            out.print(i + "<br>");
        }
        out.print("</body>");
        out.print("</html>");
    }
}

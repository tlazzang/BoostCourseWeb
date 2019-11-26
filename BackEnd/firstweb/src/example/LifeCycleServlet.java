package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {
    public LifeCycleServlet() {
        System.out.println("LifeCyclerkkServletkk()!");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service()!");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy()!");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init()!");
    }
}

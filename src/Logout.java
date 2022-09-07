import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ServletContext application = getServletContext();
        PrintWriter out = resp.getWriter();
        out.println("<h2 style = 'float:right'> "+application.getAttribute("Username")+"</h2>");

        out.println("<center><button><a href='Index.html'>Logout</a></button></center>");
//        application.getAttribute("");
        application.removeAttribute("Username");



    }
}

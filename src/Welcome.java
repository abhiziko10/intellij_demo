import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Welcome extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       ServletContext application =getServletContext();
        PrintWriter out = response.getWriter();
        out.println("<h2 style = 'float:right'> "+application.getAttribute("Username")+"</h2>");
        out.println("<center><button><a href='Logout'>Next Page</a></button><center>");





    }
}
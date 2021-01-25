import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name="LoggedOutServlet",urlPatterns = "/logout")
public class LoggedOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req,resp);
        resp.sendRedirect("/WEB-INF/login.jsp");
    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginservlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/partials/login.jsp").forward(req, resp);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        if (req.getMethod().equalsIgnoreCase("post")) {
//        not needed as we are already in post

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            resp.sendRedirect("/profile");
        } else {

            //            if made a mistake redirect
            resp.sendRedirect("/login?error-try-again");
        }
    }

}

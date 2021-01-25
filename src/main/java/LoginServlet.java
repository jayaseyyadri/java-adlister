import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //check if user is an admin /user
        boolean validAttempt = username.equals("admin") || username.equals("user")&& password.equals("password");


        //path for user is an admin
        HttpSession session = request.getSession();

        if (validAttempt && username.equals("admin")) {
            session.setAttribute("isAdmin", true);
            response.sendRedirect("/admin");
//            is an admin so redirect (servlet to be built)
            // is a valid user
        }  else if(validAttempt && username.equals("user")){
            session.setAttribute("isAdmin",false);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    @WebServlet(name="PageViewCounter",urlPatterns ="/counter")
    public class PageViewCounter extends HttpServlet {

        int counter=1;
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            counter+=1;
            out.println(" <h1>  This page has been viewed  </h1>" +"<h1>" +counter +"</h1>");
        }

    }

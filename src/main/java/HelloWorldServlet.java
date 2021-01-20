import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name="HelloWorldServlet",urlPatterns ="/name")
public class HelloWorldServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();


        String YourName = req.getParameter("YourName");

            if(YourName==null) {
                YourName = "  World ";
        }
            out.println("<h1> hello " + YourName +" </h1>");
    }

}
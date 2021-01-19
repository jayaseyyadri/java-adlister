import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name="HelloWorldServlet",urlPatterns ="/name")
public class HelloWorldServlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
//
//    out.println("<h1>Hello, World!</h1>");

    String name = req.getParameter("name");

//      out.println("<h1> Hi" + name + "</h1>");

        if(name==null) {

            name = " Hello World ";
    }
        out.println(" hello " + name);
}

}
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name="DadJokeServlet",urlPatterns ="/dadjoke")
public class DadJokeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text,html");
        PrintWriter out = res.getWriter();

        //pulls from url after the question mark
        String joke = req.getParameter("joke");

        String name= req.getParameter("name");

        if(joke==null){
            joke ="Hungry";
        }
        out.println("<h1> Hi" + joke + " , I am dad!</h1>");

        }
    }
}
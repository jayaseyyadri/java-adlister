import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet  (name = "PizzaServlet",urlPatterns  = "/pizza-order")
public class PizzaServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.getRequestDispatcher("/pizza-order/pizzaorderform.jsp").forward(req, res);
        String[] t = req.getParameterValues("toppings");
        System.out.println(" You selected the following toppings:");

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i] + "\n");
        }
        System.out.println(" You selected :");

        String sauce = req.getParameter("sauce");
        System.out.println("You selected sauce as "+ sauce);


        String size = req.getParameter("size");
        System.out.println("Your pizza size  "+ size);


        String address=req.getParameter("address");
        System.out.println("your address is "+address);
    }


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order/pizzaorderform.jsp").forward(req, res);

    }

}
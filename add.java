import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class add extends HttpServlet{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
	int a =Integer.parseInt(req.getParameter("one"));
	int b=Integer.parseInt(req.getParameter("two"));
	int sum=a+b;
	req.setAttribute("sum", sum);
	req.getRequestDispatcher("add.jsp").forward(req, res);
}
}

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SendRedirectServlet2")
public class SendRedirectServlet2  extends HttpServlet{
	protected void doGet (HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String value=(String) req.getAttribute("k1");
		res.getWriter().println("hello user"+value);
	}

}

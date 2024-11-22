import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SendRedirectServlet1")
public class SendRedirectServlet1 extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		req.setAttribute("k1","V1");
		res.sendRedirect("https://www.youtube.com/");
	}

}

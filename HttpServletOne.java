import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/httpOne")
public class HttpServletOne extends HttpServlet{
	protected  void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String contactString=req.getParameter("contact");
		System.out.println(contactString);
		long contact=Long.parseLong(contactString);
		String email=req.getParameter("mail");
		res.getWriter().print(email+" "+contact);
	}
 
}

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionOne")
public class SessionOne extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String mail=req.getParameter("mail");
		String password=req.getParameter("password");
		if(mail.equals("abc@gmail.com")&& password.equals("abc123"))
		{
			HttpSession session=req.getSession();
			session.setAttribute("k1", mail);
			res.sendRedirect("SessionTwo");
		}
		else {
			res.getWriter().print("invalid user");		}
	}
}

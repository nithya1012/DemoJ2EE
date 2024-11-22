import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CookieOne")
public class CookieOne extends HttpServlet{
	protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String mail=req.getParameter("mail");
		String pwd=req.getParameter("pwd");
		
		Cookie c1=new Cookie("k1",mail);
		
		Cookie c2=new Cookie("k2",pwd);
		req.getRequestDispatcher("CookieTwo").forward(req, res);
		res.addCookie(c2);
		res.addCookie(c1);

		
		
	}
}

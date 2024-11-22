import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CookieTwo")
public class CookieTwo extends HttpServlet {
	protected void doPut(HttpServletRequest req, HttpServletResponse res) throws IOException {
		req.getCookies();
		res.getWriter().print("hheloo user");

	}
}

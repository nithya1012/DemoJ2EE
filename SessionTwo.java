import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

@WebServlet("/SessionTwo")
public class SessionTwo extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		String mail = (String) session.getAttribute("k1");
		if (mail != null) {
			res.getWriter().print("valid user");
		} else {
			res.getWriter().print("invalid user");
		}
	}
}

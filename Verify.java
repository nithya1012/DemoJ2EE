import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/verify")
public class Verify extends GenericServlet
{
	@Override
	public void service (ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
	String Email=req.getParameter("u_email");
	String Name=req.getParameter("u_Name");
	long contact=Long.parseLong(req.getParameter("u_cno"));

	int Id=Integer.parseInt(req.getParameter("u_id"));
	res.getWriter().print(Id+" "+Name+" "+Email+" "+contact+" data fetched from HTML File");
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		String Query="insert into student values (?,?,?,?)";
		PreparedStatement pst=(PreparedStatement) con.prepareStatement(Query);
		pst.setInt(1,Id);
		pst.setString(2, Name);
		pst.setString(3, Email);
		pst.setLong(4, contact);
		int a=((java.sql.Statement) pst).executeUpdate(Query);
		con.close();
		res.getWriter().print(a+"rows inserted");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}


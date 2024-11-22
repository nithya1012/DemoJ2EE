import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
public int insert(Employee emp) throws SQLException, ClassNotFoundException
{
	Connection con=getConnection();
	String Query="insert into Employee values(?,?,?)";
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setInt(1, emp.getId());
	pst.setString(2, emp.getName());
	pst.setString(3, emp.getEmail());
	return pst.executeUpdate();
}
public int delete(int id) throws SQLException, ClassNotFoundException
{
	Connection con=getConnection();
	String Query="delete from employee where id=?";
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setInt(1, id);
	return pst.executeUpdate();

}
public ResultSet getAll() throws SQLException, ClassNotFoundException {
	Connection con=getConnection();
	Statement st= (Statement) con.createStatement();
	String Query="select * from employee";
	ResultSet rs= ((java.sql.Statement) st).executeQuery(Query);
	return rs;
}
public ResultSet findById(int id) throws SQLException, ClassNotFoundException
{
	Connection con=getConnection();
	String Query="select * from employee wher id=?";
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setInt(1, id);
	return pst.executeQuery();
}
public Connection getConnection() throws ClassNotFoundException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	return  getConnection();
}
public static void main (String[]args) throws ClassNotFoundException, SQLException
{
	Employee emp=new Employee(1,"nithya","nithi@gmail.com");
	Database d=new Database();
	d.insert(emp);
}
}


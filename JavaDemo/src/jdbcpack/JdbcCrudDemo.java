package jdbcpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCrudDemo {
	
	public void addEmployee(Employee e) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";//driver/ipadd/database instance"
			String user="system";
			String password="orcl11g";
			try {
				Connection conn = DriverManager.getConnection(url,user,password);
				PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?)");
				ps.setInt(1,e.getEmpid());
				ps.setString(2,e.getEmpname());
				ps.setInt(3,e.getEmpid());
				ps.setString(4,e.getCity());
				ps.executeQuery();
				
//				Statement statement=conn.createStatement();
//				String query="insert into employee values("+e.getEmpid()+",'"+ e.getEmpname()+"',"+e.getSalary()+",'"+e.getCity()+"')";
				
				int rowCount=ps.executeUpdate();
				System.out.println(rowCount+"row Updated");
				conn.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			//System.out.println("Connection Established");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
	}
	public void fetchEmployee() {
		
		String url="jdbc:oracle:thin:@localhost:1521:XE";//driver/ipadd/database instance"
		String user="system";
		String password="orcl11g";
		try {
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement ps=conn.prepareStatement("Select * from employee");
			ResultSet rs=ps.executeQuery();
//			Statement statement=conn.createStatement();
//			ResultSet rs=statement.executeQuery("Select * from employee");
			while(rs.next()) {
				System.out.println(rs.getInt("empId")+ " " +rs.getString("empname")+ " " +rs.getInt("salary")+ " " +rs.getString("city"));
			}
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void updateEmployee(Employee e) {
		
		String url="jdbc:oracle:thin:@localhost:1521:XE";//driver/ipadd/database instance"
		String user="system";
		String password="orcl11g";
		try {
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement ps=conn.prepareStatement("UPDATE employee SET empname=?, salary=?, city=? Where empid=?");
			ps.setString(1,e.getEmpname());
			ps.setInt(2,e.getEmpid());
			ps.setString(3,e.getCity());
			ps.setInt(4,e.getEmpid());
			ps.executeQuery();
//			String query="UPDATE employee SET empname='"+e.getEmpname()+"', salary="+e.getSalary()+", city='"+e.getCity()+"' WHERE empid="+e.getEmpid();
//			Statement statement=conn.createStatement();
//			statement.executeUpdate(query);
			System.out.println("row Updated");
			
			conn.close();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

public void deleteEmployee(Employee e) {
	
	String url="jdbc:oracle:thin:@localhost:1521:XE";//driver/ipadd/database instance"
	String user="system";
	String password="orcl11g";
	try {
		Connection conn = DriverManager.getConnection(url,user,password);
		PreparedStatement ps=conn.prepareStatement("delete from employee where empid=?");
		ps.setInt(1,e.getEmpid());
		ps.executeQuery();
//		Statement statement=conn.createStatement();
//		statement.executeQuery("delete from employee where empid="+e.getEmpid());
		System.out.println("Row Deleted");
		
		
		conn.close();
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
}

public void fundTransfer() {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url="jdbc:oracle:thin:@localhost:1521:XE";//driver/ipadd/database instance"
	String user="system";
	String password="orcl11g";
	try {
		Connection conn = DriverManager.getConnection(url,user,password);
		PreparedStatement ps=conn.prepareStatement("Update ");
		ps.executeQuery();
		System.out.println("Row Deleted");	
		conn.close();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}	
	}
}
 


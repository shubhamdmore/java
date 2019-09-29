import java.sql.*;
public class EmployeeJdbc {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
		String uname = "root";
		String pass = "root";
		String query = "select * from student";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		while (rs.next()) {
			String userdata1 = rs.getString(1) + "  " + rs.getInt(2) + "  "
					+ rs.getString(3) + "  " + rs.getString(4);

			System.out.println(userdata1);
		}

		st.close();
		con.close();
		
		

	}

}

public class MySQLExample {
	public static void main(String []args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/company?" + "user=root&password=111111";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载MySQL驱动程序");
			Statement stmt = conn.createStatement();
			String command = "SELECT * FROM Employee";
			System.out.println("员工编号  员工名称  性别  员工职务  工资");
			ResultSet rs = stmt.executeQuery(command);
			while(rs.next()) {
				System.out.print(" " + rs.getInt(1) + " ");
				System.out.print(" " + rs.getString(2) + " ");
				System.out.print(" " + rs.getString(3) + " ");
				System.out.print(" " + rs.getString(4) + " ");
				System.out.print(" " + rs.getFloat(5) + " ");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
	}
}

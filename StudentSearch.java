package Exercise3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class StudentSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url = "jdbc:mysql://localhost:3306/University";
	        String username = "root";
	        String password = "";

	        try {
	            Connection con = DriverManager.getConnection(
	                url, username, password
	            );

	            System.out.println("Connected successfully!");
	            Statement stmt = con.createStatement();

	            ResultSet rs = stmt.executeQuery(
	                "SELECT * FROM students WHERE Course ='IT'"
	            );

	            while (rs.next()) {
	                System.out.println(
	                    rs.getInt("Id") + " | " +
	                    rs.getString("LName") + " | " +
	                    rs.getString("Course") + " | " +
	                    rs.getString("Country")
	                );
	            }
con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}

package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg26create_an {

	   public static void main(String[] args) throws ClassNotFoundException, SQLException {
		    Class.forName("com.mysql.cj.jdbc.Driver"); // MY SQL과 JDBC를 연동한다
		    // Connection, Statement, ResultSet 순서
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");                                                                

		      Statement stmt = conn.createStatement(); // JDBC 드라이버 파일 연결

		      stmt.execute("create table dailyStock (" 
		            + "bsop_date varchar(100), "
		            + "shrn_iscd  varchar(100), "
		            + "stck_oprc int, "
		            + "stck_prpr int, "
		            + "stck_hgpr int, "
		            + "stck_lwpr int, "
		            + "acml_vol long, "
		            + "acml_tr_pbmn long, "
		            + "PRIMARY KEY (bsop_date, shrn_iscd));" 
		      );
		      // open한 만큼 close 해 주어야 한다
		      stmt.close();
		      conn.close();
		   }
		}
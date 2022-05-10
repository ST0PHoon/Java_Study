package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg26create {

	   public static void main(String[] args) throws ClassNotFoundException, SQLException {
		    Class.forName("com.mysql.cj.jdbc.Driver"); // MY SQL과 JDBC를 연동한다
		    // Connection, Statement, ResultSet 순서
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");                                                                

		      Statement stmt = conn.createStatement(); // JDBC 드라이버 파일 연결

		      stmt.execute("create table dailyStock (" 
		            + "date int, "
		            + "short_code  varchar(100), "
		            + "market_cost int, "
		            + "high_cost int, "
		            + "low_cost int, "
		            + "last_cost int, "
		            + "trade_amount long, "
		            + "trade_money long, "
		            + "PRIMARY KEY (date, short_code))"
		            + "DEFAULT CHARSET=utf8;" // 언어 지정 > utf8 (한글)
		      );
		      // open한 만큼 close 해 주어야 한다
		      stmt.close();
		      conn.close();
		   }
		}
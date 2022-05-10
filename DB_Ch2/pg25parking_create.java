package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg25parking_create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		
		stmt.execute( "create table parkingdata(" +		//freewifi 테이블 생성
				// 변수 및 형태 선언
				"parking_number int NOT NULL, " + 			
				"parking_name varchar(50) , " +	
				"longitude double , " + 				
				"latitude double , " +					
				"parkingspot_type varchar(10), " +				
				"parking_type varchar(10), " +				
				"parking_lot_addr varchar(100) , " + 			
				"parking_lot_street varchar(100), " +					
				"parking_lot_number int , " +				
				"working_date varchar(50), " +				
				"week_start varchar(10), " +				
				"week_end varchar(10), " +			
				"weekend_start varchar(10) , " +					
				"weekend_end varchar(10) , " +					
				"holiday_start varchar(10), "	+							
				"holiday_end varchar(10), "	+
				"fee_type varchar(10), "	+
				"control_lot varchar(50), "	+
				"district_division varchar(10), "	+
				"district_division_sub varchar(20), "	+
				"regional_center_spotX double, "	+
				"regional_center_spotY double, "	+
				"local_code int, "	+
				"number varchar(20), "	+
				"modified_date date, "	 +
				// 프라이머리 키 설정
				"PRIMARY KEY(parking_number))");
		// 사용 후 종료
		stmt.close();
		conn.close();
	}
}

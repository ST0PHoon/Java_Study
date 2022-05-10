package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg22_create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		
		stmt.execute( "create table freewifi2(" +				//freewifi 테이블 생성
				"inst_place varchar(50) NOT NULL, " + 			//inst_place, 문자(50글자), 반드시 기입
				"inst_place_detail varchar(50) NOT NULL, " +	//inst_place_detail, 문자(50글자)
				"inst_city varchar(50), " + 					//inst_city, 문자(50글자)
				"inst_country varchar(50), " +					//inst_country, 문자(50글자)
				"inst_place_flag varchar(50), " +				//inst_place_flag, 문자(50글자)
				"service_provider varchar(50), " +				//service_provider, 문자(50글자)
				"wifi_ssid varchar(100) NOT NULL, " + 			//wifi_ssid, 문자(100글자), 반드시 기입
				"inst_date varchar(50), " +						//inst_date, 문자(50글자)
				"place_addr_road varchar(200), " +				//place_addr_road, 문자(200글자)
				"place_addr_land varchar(200), " +				//place_addr_land, 문자(200글자)
				"manage_office varchar(50), " +					//manage_office, 문자(50글자)
				"manage_office_phone varchar(50), " +			//manage_office_phone, 문자(50글자)
				"latitude double NOT NULL, " +					//latitude(위도), 숫자, 반드시 기입
				"longitude double NOT NULL, " +					//longitude(경도), 숫자, 반드시 기입
				"write_date date, "	+							//write_date(데이터 기준 일자) 날짜
				// 프라이머리 키 설정
				"PRIMARY KEY(inst_place, inst_place_detail, wifi_ssid, latitude, longitude, inst_date))");
		
		// 사용 후 종료
		stmt.close();
		conn.close();

	}

}

package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg25score_create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		
		stmt.execute( "create table scorelist(" +				//scorelist 테이블 생성
				"studentid int NOT NULL, " + 			//studentid, 숫자, 반드시 기입
				"name varchar(10) , " +	//name, 문자(10)
				"kor int , " + 				//kor, 숫자
				"eng int , " +					//eng, 숫자
				"mat int, " +					//mat, 숫자
				// 프라이머리 키 설정
				"PRIMARY KEY(studentid))");
		
		// 사용 후 종료
		stmt.close();
		conn.close();

	}

}
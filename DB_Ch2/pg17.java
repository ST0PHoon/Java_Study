package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg17 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// resultset, 명령어 실행후 값 저장
		ResultSet rset = stmt.executeQuery("show databases;"); // 데이터베이스를 보여주는 명령어 실행
		// 값 출력할 while 문, .next를 이용, 값이 없으면 -1을 반환해서 while문 종료
		while (rset.next()) {
			System.out.println("값1 : " + rset.getString(1));
		}
		// 값 출력할 while 문, .next를 이용, 값이 없으면 -1을 반환해서 while문 종료
		rset = stmt.executeQuery("show tables;"); // 테이블을 보여주는 명령어 실행
		while (rset.next()) {
			System.out.println("값2 : " + rset.getString(1));
		}
		// 사용 후 종료
		rset.close();
		stmt.close();
		conn.close();

	}

}

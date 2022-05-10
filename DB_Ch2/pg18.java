package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg18 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// 테이블 생성 명령어 실행, 결과를 보여줄 것이 없어서 execute로 실행
		stmt.execute("create table examtableJava2(name varchar(20), studentid int, kor int, eng int, mat int);");
		//사용 후 종료
		stmt.close();
		conn.close();
	}

}

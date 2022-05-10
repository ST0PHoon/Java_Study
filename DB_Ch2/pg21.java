package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg21 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// 명령어 실행 후, 값을 보기 위해 ResultSet, executeQuery로 실행, 전체 내용을 보여주는 명령어
		ResultSet rset = stmt.executeQuery("select * from examtable;");
		// 구성 출력
		System.out.println("  이름  학번   국어  영어  수학\n");
		// 값을 출력하는 while문 작성, .next를 이용, 값이 없으면 -1을 반환해 while 문 종료
		while (rset.next()) {
			//.getString으로 문자열, getInt로 정수형 자료를 가져온다.
			// 입력 받은 값을 미리 포메팅해둔 형태로 출력
			System.out.printf("%4s  %6d  %3d  %3d    %3d\n", rset.getString(1),rset.getInt(2),rset.getInt(3),rset.getInt(4),rset.getInt(5));
		}
		// 사용 후 종료
		rset.close();
		stmt.close();
		conn.close();
	}

}

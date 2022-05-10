package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg25score_insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// 1000명 데이터 입력
		int num = 1000;
		// 1000개의 데이터를 입력하기 위한 for 문작성
		for(int i = 1; i <= num; i++) {
			String name = String.format("정지%03d", i);	//이름 생성
			String QueryTxt;	//명령어를 실행하기 위한 문자열 생성
			//ROUND(RAND()*100, 0) - 0 ~99 까지 생성하는 sql 문구
			QueryTxt = String.format("insert into scorelist(studentid, name, kor, eng, mat) values (%s, '%s', ROUND(RAND()*100 + 1, 0), ROUND(RAND()*100 + 1, 0), ROUND(RAND()*100 + 1, 0));"
					, i, name);
			stmt.execute(QueryTxt); // 입력받은 sql명령을 실행한다.
		}
		
		stmt.close();
		conn.close();
		
	}

}

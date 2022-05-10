package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg20 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// execute로 examtable에 값을 추가하는 명령 실행
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('나연', 209901, 95, 100, 95);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('정연', 209902, 100, 100, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('모모', 209903, 100, 90, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('사나', 209904, 100, 95, 90);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('지효', 209905, 80, 100, 70);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('미나', 209906, 95, 90, 95);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('다현', 209907, 100, 90, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('채영', 209908, 100, 75, 90);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('쯔위', 209909, 100, 100, 70);");
		// 사용 후 종료
		stmt.close();
		conn.close();

	}

}

package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg20 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		// execute�� examtable�� ���� �߰��ϴ� ��� ����
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����', 209901, 95, 100, 95);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����', 209902, 100, 100, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('���', 209903, 100, 90, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('�糪', 209904, 100, 95, 90);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('��ȿ', 209905, 80, 100, 70);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('�̳�', 209906, 95, 90, 95);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����', 209907, 100, 90, 100);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('ä��', 209908, 100, 75, 90);");
		stmt.execute("insert into examtable (name, studentid, kor, eng, mat) values ('����', 209909, 100, 100, 70);");
		// ��� �� ����
		stmt.close();
		conn.close();

	}

}

package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg18 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		// ���̺� ���� ��ɾ� ����, ����� ������ ���� ��� execute�� ����
		stmt.execute("create table examtableJava2(name varchar(20), studentid int, kor int, eng int, mat int);");
		//��� �� ����
		stmt.close();
		conn.close();
	}

}

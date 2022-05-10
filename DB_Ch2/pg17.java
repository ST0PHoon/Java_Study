package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg17 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		// resultset, ��ɾ� ������ �� ����
		ResultSet rset = stmt.executeQuery("show databases;"); // �����ͺ��̽��� �����ִ� ��ɾ� ����
		// �� ����� while ��, .next�� �̿�, ���� ������ -1�� ��ȯ�ؼ� while�� ����
		while (rset.next()) {
			System.out.println("��1 : " + rset.getString(1));
		}
		// �� ����� while ��, .next�� �̿�, ���� ������ -1�� ��ȯ�ؼ� while�� ����
		rset = stmt.executeQuery("show tables;"); // ���̺��� �����ִ� ��ɾ� ����
		while (rset.next()) {
			System.out.println("��2 : " + rset.getString(1));
		}
		// ��� �� ����
		rset.close();
		stmt.close();
		conn.close();

	}

}

package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg21 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		// ��ɾ� ���� ��, ���� ���� ���� ResultSet, executeQuery�� ����, ��ü ������ �����ִ� ��ɾ�
		ResultSet rset = stmt.executeQuery("select * from examtable;");
		// ���� ���
		System.out.println("  �̸�  �й�   ����  ����  ����\n");
		// ���� ����ϴ� while�� �ۼ�, .next�� �̿�, ���� ������ -1�� ��ȯ�� while �� ����
		while (rset.next()) {
			//.getString���� ���ڿ�, getInt�� ������ �ڷḦ �����´�.
			// �Է� ���� ���� �̸� �������ص� ���·� ���
			System.out.printf("%4s  %6d  %3d  %3d    %3d\n", rset.getString(1),rset.getInt(2),rset.getInt(3),rset.getInt(4),rset.getInt(5));
		}
		// ��� �� ����
		rset.close();
		stmt.close();
		conn.close();
	}

}

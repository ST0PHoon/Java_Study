package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg25score_create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		
		stmt.execute( "create table scorelist(" +				//scorelist ���̺� ����
				"studentid int NOT NULL, " + 			//studentid, ����, �ݵ�� ����
				"name varchar(10) , " +	//name, ����(10)
				"kor int , " + 				//kor, ����
				"eng int , " +					//eng, ����
				"mat int, " +					//mat, ����
				// �����̸Ӹ� Ű ����
				"PRIMARY KEY(studentid))");
		
		// ��� �� ����
		stmt.close();
		conn.close();

	}

}
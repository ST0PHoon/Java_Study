package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg25score_select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ���ɾ� ���
		// sql���ɾ ������ ���� ���� ���� 
		String QueryTxt;
		// 0���� 999���� 30�� �����ϴ� i�� ������ ������ for�� �ۼ�
		for(int i = 0; i < 1000; i=i+30) { 
			// scorelist ���̺��� i��°���� 30���� ���� ���� �ް�, ��, ����� ���� �޾ƿɴϴ�.
			QueryTxt = String.format(" select *, kor+eng+mat, (kor+eng+mat)/3 from scorelist limit %d, 30;", i);
			// ������ ���ɾ��� ����� �޾ƿ´�.
		    ResultSet rset = stmt.executeQuery(QueryTxt);
		    
		    System.out.printf("**********************************************\n");	//���м� ���
		    //���� �ۼ�
	        System.out.printf("%s%4s%6s%4s%4s%4s%4s\n", "�й�", "�̸�", "����", "����", "����", "�հ�", "���");
		    // ������ ������ ����� ����ϱ� ���� while�� ����, ���� ������ while�� ����
	        while (rset.next()) { //i��°���� 30���� �й�, �̸�, ����, ����, ����, �հ�, ����� ����Ѵ�.
	        	System.out.printf("%04d%6s%5d%6d%6d%6d  %6.2f \n", rset.getInt(1),rset.getString(2),rset.getInt(3),rset.getInt(4),rset.getInt(5),rset.getInt(6),rset.getDouble(7));	
		    }
		    System.out.printf("*******************************************\n");	//���м� ���
		    // ���� �հ�, ��� ���
		    System.out.printf("����\n");	//���м� ���
		    //���� �������� ����, ����, ����, �հ�, ����� ���� ����ϰ� �ٹٲٰ� �� ������� ����� ����ϴ� sql �ڵ� �ۼ�
		    QueryTxt = String.format(" select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
		    		+ "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from scorelist limit %d,30)as sum;", i);
		    //������ ������ ������ ����� �Է��Ѵ�. 
		    ResultSet rset2 = stmt.executeQuery(QueryTxt);
		    // ������ �ڵ��� ����� ����Ѵ�.
		    while (rset2.next()) {
	        	System.out.printf("    %5d %6d %6d %6d  %6.2f \n", rset2.getInt(1),rset2.getInt(2),rset2.getInt(3),rset2.getInt(4),rset2.getDouble(5));
	        	System.out.printf("    %5.2f %6.2f %6.2f %6.2f  %6.2f \n", rset2.getDouble(6),rset2.getDouble(7),rset2.getDouble(8),rset2.getDouble(9),rset2.getDouble(10));	
		    }
		    // ������ ���
		    System.out.printf("����\n");	//���м� ���
		    // 990���϶� 970������ �����ؼ� 1000������ �����.
		    if (i == 990) {
		    	i=970;
		    }
		    // ����, ����, ����, �հ�, ����� ���� ���� ����Ѵ�.
		    QueryTxt = String.format(" select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
		    		+ "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from scorelist limit 0, %d)as avg;", (i+30));
		    // ���ɾ� ������ ����� �޾ƿ´�.
		    ResultSet rset3 = stmt.executeQuery(QueryTxt);
		    // ������ ������ ���ɾ��� ����� ����Ѵ�.
		    while (rset3.next()) {
	        	System.out.printf("    %5d %6d %6d %6d  %6.2f \n", rset3.getInt(1),rset3.getInt(2),rset3.getInt(3),rset3.getInt(4),rset3.getDouble(5));
	        	System.out.printf("    %5.2f %6.2f %6.2f %6.2f  %6.2f \n", rset3.getDouble(6),rset3.getDouble(7),rset3.getDouble(8),rset3.getDouble(9),rset3.getDouble(10));	
		    }
		  //ResultSe ���� 
		    rset.close(); 
		    rset2.close();
		    rset3.close();
		}
	     stmt.close(); //Statement ����
	     conn.close(); //Connection ����
	   }
	}
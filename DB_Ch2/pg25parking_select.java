package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg25parking_select {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		// ���� �浵 �Է�
		double lat = 37.3860521;
		double lng = 127.1214038;
		// sql ��ɾ ������ ���ڿ� ����
		 String QueryTxt;
		 //�Է��� ���� �浵�� �������� �����Ϳ� �ִ� ����� ���� ����� ��� ���
//	      QueryTxt = String.format("select * from parkingdata where "
//	            + "SQRT( POWER ( latitude-%f, 2) + POWER ( longitude-%f, 2)) = " +
//	                        "(select MIN( SQRT( POWER( latitude-%f,2) + POWER ( longitude-%f, 2))) from parkingdata);", 
//	                        lat, lng, lat, lng);

		 // parkingdata ���̺��� ��� ���� �����ش�.
//		 QueryTxt = "select * from parkingdata";

		 // parkingdata���̺��� ��� ���� ��, inst_country�� ����� ���鸸 ����Ѵ�.
		 QueryTxt = "select * from parkingdata where parking_type = '���';";

		  //sql ��ɾ� ������ ����� �������� executeQuery�� ��ɾ� ����
	      ResultSet rset = stmt.executeQuery(QueryTxt);
	      //���° ���������� �����ֱ� ���� ������ ���� ����
	      int iCnt = 0; 
	      // ����� ������ ����� ����ϱ� ���� while�� ����, ���� ������ while�� ����
	      while (rset.next()) {
	    	 // �޾ƿ� ����� �׸���� ����Ѵ�.
	         System.out.printf("* (%d)******************************\n", iCnt++);	
	         System.out.printf("������ȣ : %s\n", rset.getString(1));				
	         System.out.printf("�������̸� : %s\n", rset.getString(2));			
	         System.out.printf("�浵 : %s\n", rset.getString(3));				
	         System.out.printf("���� : %s\n", rset.getString(4));			
	         System.out.printf("�����屸�� : %s\n", rset.getString(5));			
	         System.out.printf("���������� : %s\n", rset.getString(6));			
	         System.out.printf("�����������ּ� : %s\n", rset.getString(7));			
	         System.out.printf("�����嵵�θ��ּ� : %s\n", rset.getString(8));				
	         System.out.printf("������ȹ�� : %s\n", rset.getString(9));		
	         System.out.printf("����� : %s\n", rset.getString(10));		
	         System.out.printf("���Ͽ���۽ð� : %s\n", rset.getString(11));			
	         System.out.printf("���Ͽ����ð� : %s\n", rset.getString(12));		
	         System.out.printf("����Ͽ���۽ð� : %s\n", rset.getString(13));					
	         System.out.printf("����Ͽ����ð�: %s\n", rset.getString(14));					
	         System.out.printf("�����Ͽ���۽ð� : %s\n", rset.getString(15));		
	         System.out.printf("�����Ͽ����ð� : %s\n", rset.getString(16));
	         System.out.printf("������� : %s\n", rset.getString(17));
	         System.out.printf("��������� : %s\n", rset.getString(18));
	         System.out.printf("�������� : %s\n", rset.getString(19));
	         System.out.printf("��������sub : %s\n", rset.getString(20));
	         System.out.printf("�����߽���ǥX : %s\n", rset.getString(21));
	         System.out.printf("�����߽���ǥY : %s\n", rset.getString(22));
	         System.out.printf("�����ڵ� : %s\n", rset.getString(23));
	         System.out.printf("����ó : %s\n", rset.getString(24));
	         System.out.printf("������¥ : %s\n", rset.getString(25));
	      }
	      
	      rset.close(); //ResultSe ���� 
	      stmt.close(); //Statement ����
	      conn.close(); //Connection ����
	   }
	}
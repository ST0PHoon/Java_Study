package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg24 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		// ���� �浵 �Է�
		double lat = 37.3860521;
		double lng = 127.1214038;
		// sql ��ɾ ������ ���ڿ� ����
		 String QueryTxt;
		 
		 // freewifi ���̺��� ��� ���� ��, inst_country�� �������� ���鸸 ����Ѵ�.
		 QueryTxt = "select * from freewifi where inst_country = '������';";

	      //sql ��ɾ� ������ ����� �������� executeQuery�� ��ɾ� ����
	      ResultSet rset = stmt.executeQuery(QueryTxt);
	      //���° ���������� �����ֱ� ���� ������ ���� ����
	      int iCnt = 0; 
	      // ����� ������ ����� ����ϱ� ���� while�� ����, ���� ������ while�� ����
	      while (rset.next()) {
	         System.out.printf("* (%d)******************************\n", iCnt++);	//���м� ���
	         System.out.printf("��ġ��Ҹ� : %s\n", rset.getString(1));				//��ġ��Ҹ� ���
	         System.out.printf("��ġ��һ� : %s\n", rset.getString(2));			//��ġ��һ� ���
	         System.out.printf("��ġ�õ��� : %s\n", rset.getString(3));				//��ġ�õ��� ���
	         System.out.printf("��ġ�ñ����� : %s\n", rset.getString(4));			//��ġ�ñ����� ���
	         System.out.printf("��ġ�ü����� : %s\n", rset.getString(5));			//��ġ�ü����� ���
	         System.out.printf("����������� : %s\n", rset.getString(6));			//����������� ���
	         System.out.printf("��������SSID : %s\n", rset.getString(7));			//��������ssid ���
	         System.out.printf("��ġ��� : %s\n", rset.getString(8));				//��ġ��� ���
	         System.out.printf("���������θ��ּ� : %s\n", rset.getString(9));		//���������θ��ּ� ���
	         System.out.printf("�����������ּ� : %s\n", rset.getString(10));		//�����������ּ� ���
	         System.out.printf("��������� : %s\n", rset.getString(11));			//��������� ���
	         System.out.printf("���������ȭ��ȣ : %s\n", rset.getString(12));		//���������ȭ��ȣ ���
	         System.out.printf("���� : %s\n", rset.getString(13));					//���� ���
	         System.out.printf("�浵: %s\n", rset.getString(14));					//�浵 ���
	         System.out.printf("�����ͱ������� : %s\n", rset.getString(15));		//�����ͱ������� ���
	      }
	      
	      rset.close(); //ResultSe ���� 
	      stmt.close(); //Statement ����
	      conn.close(); //Connection ����
	   }
	}
package DB2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pg26insert_an {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
	      //���� �׳� �ܿ���!!!! ����̹� - Ŀ�ؼ� - ������Ʈ��Ʈ - ����Ʈ��
	      Class.forName("com.mysql.cj.jdbc.Driver"); // ����̹� ȣ��
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");    
	      //connection = drivermanager.getConnection(jdbc:mysql://mysql���� ip:��Ʈ��ȣ/database��,mysql id,password)
	      String queryText=String.format("insert into dailyStock(bsop_date,shrn_iscd,stck_oprc,stck_prpr,stck_hgpr,stck_lwpr,acml_vol,acml_tr_pbmn) values(?,?,?,?,?,?,?,?)");
	      PreparedStatement pstmt = conn.prepareStatement(queryText);
	      //statement = Ŀ�ؼ�.createStatement();
	      File f= new File("C:\\Users\\kopo\\Desktop\\����ڷ�\\�ڹ�\\20220422_�ڹ�\\StockDailyPrice.csv");
	      BufferedReader br = new BufferedReader(new FileReader(f));
	      
	      String readtext;
	      
	      if ((readtext = br.readLine())==null) {
	         System.out.println("�� ���� �Դϴ�.");
	      }
	      
	      String[] field_Name = readtext.split(",");
	      
	      int linecount =0;
	      conn.setAutoCommit(false);
	      
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �ð� ���� �����ϱ�
	      long startTime = System.currentTimeMillis(); // �ڵ� ���� ���� �ð� �޾ƿ��� (���� �ð�)
	      Date startInDate = new Date(startTime); // ���� ��¥�� ��ȯ
	      String startFormat = sdf.format(startInDate); // ���ڿ� ������ ���� ��ȯ
	      
	      while ((readtext = br.readLine())!=null){
	               
	         String[] field = readtext.split(",");
	         
	         pstmt.setString(1,field[1]);
	         pstmt.setString(2,field[2]);
	         pstmt.setInt(3,Integer.parseInt(field[4]));
	         pstmt.setInt(4,Integer.parseInt(field[3]));
	         pstmt.setInt(5,Integer.parseInt(field[5]));
	         pstmt.setInt(6,Integer.parseInt(field[6]));
	         pstmt.setInt(7,Integer.parseInt(field[11]));
	         pstmt.setLong(8,Long.parseLong(field[12]));
	         pstmt.addBatch();
	         System.out.println(linecount+" ��° �׸� batch �Ϸ�");
	         pstmt.clearParameters();
	         linecount++;
	         try {
	            if(linecount%10000==0) {
	               pstmt.executeBatch();
	               conn.commit();
	            }
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	      }
	      try {
	         pstmt.executeBatch();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      conn.commit();
	      conn.setAutoCommit(true);
	      
	      long finishTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
	      Date finishInDate = new Date(finishTime); // ���� ��¥�� ��ȯ
	      String finishFormat = sdf.format(finishInDate); // ���ڿ� ������ ���� ��ȯ

	      long diffTime = (finishTime - startTime); // �ð� ���� ���
	      long diffTimeMin = (diffTime / 1000 / 60); // �� ���ϱ�
	      long diffTimeSec = (diffTime / 1000 % 60); // �� ���ϱ�
	      
	      br.close();
	      pstmt.close();  //�������� �ݾ���� �� ���ư���
	      conn.close(); //�������� �ݾ���� �� ���ư���
	      System.out.println("���� �ð� : " + startFormat); // ���� �ð� ���
	      System.out.println("���� �ð� : " + finishFormat); // ���� �ð� ���
	      System.out.println("�ҿ� �ð� : " + diffTimeMin + "�� " + diffTimeSec + "��"); // �ҿ� �ð� ���
	      System.out.println("�� �׸� ���� : " + linecount); // �� �׸� ���� ���
	   }
	}
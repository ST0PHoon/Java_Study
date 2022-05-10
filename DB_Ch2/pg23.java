package DB2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg23 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		// �о�� ���� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\�����ڷ�\\�����ͺ��̽�(DB)\\���������������ǥ�ص�����.txt");
		BufferedReader br = new BufferedReader(new FileReader(f)); // ������ ���� BufferedReader�� �б�
		
		String readtxt; //���پ� �о�� ���ڿ� ���� ����
		// �о���� ��, null(��) �̸� �� �����Դϴ� �޼��� ���
		if ((readtxt = br.readLine()) == null) {
			System.out.println("�� �����Դϴ�.");
			return;
		}

		int LineCnt = 0;	//���° �׸����� ǥ���ϱ� ���� ���� ����
		while ((readtxt = br.readLine())!=null) { //���� �д� while�� ����, ���� ������ null�� ���, �̶� while�� ����
			String[] field = readtxt.split("\t"); // ���� �������� �޾ƿ� ���ڿ��� �迭�� �Է�
			String QueryTxt; //�ԷµǴ� ���� console â���� Ȯ���ϱ� ���� ������ ���� ����, + sql���� ��� ����
			// �Է¹��� ���� ���� sql ��ɾ� ����
			QueryTxt = String.format("insert into freewifi3 (inst_place, inst_place_detail, inst_city, "
					+ "inst_country, inst_place_flag, service_provider, wifi_ssid, inst_date, "
					+ "place_addr_road, place_addr_land, manage_office, manage_office_phone, "
					+ "latitude, longitude, write_date) " //���� �Է� ���� ������� ����
					+ "values ("  // �� �Է� ����
					+ "'%s', '%s', '%s', '%s', '%s', " //���ڿ��� ��� ''�ȿ� ����
					+ "'%s', '%s', '%s', '%s', '%s', " //���ڿ��� ��� ''�ȿ� ����
					+ "'%s', '%s', %s, %s, '%s');", //���� �浵�� double���̿��� ''�ȿ� �������� �ʴ´�.
					field[0], field[1], field[2], field[3], field[4], // �迭�� ��Ƶ� ���� ���信 �°� �����Ѵ�.
					field[5], field[6], field[7], field[8], field[9], 
					field[10], field[11], field[12], field[13], field[14] );
			stmt.execute(QueryTxt); // �Է¹��� sql����� �����Ѵ�.
			System.out.printf("%d��° �׸� Insert OK [%s]\n", LineCnt, QueryTxt); //consoleâ���� �����ֱ� ���� �޼��� ����ڵ�
			
			LineCnt++; //���°���� �����ִ� ���� 1 ����
		}
		// ��� �� ����
		br.close();
		stmt.close();
		conn.close();
	}

}

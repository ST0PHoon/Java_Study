package DB2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg25parking_insert {
	// ������
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		// �о�� ���� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\����ڷ�\\�ڹ�\\20220422_�ڹ�\\�ѱ������������_������������������_20191224.csv");
		BufferedReader br = new BufferedReader(new FileReader(f)); // ������ ���� BufferedReader�� �б�
		
		String readtxt; //���پ� �о�� ���ڿ� ���� ����
		// �о���� ��, null(��) �̸� �� �����Դϴ� �޼��� ���
		if ((readtxt = br.readLine()) == null) {
			System.out.println("�� �����Դϴ�.");
			return;
		}

		int LineCnt = 0;	//���° �׸����� ǥ���ϱ� ���� ���� ����
		while ((readtxt = br.readLine())!=null) { //���� �д� while�� ����, ���� ������ null�� ���, �̶� while�� ����
			String[] field = readtxt.split(","); // ���� �������� �޾ƿ� ���ڿ��� �迭�� �Է�
			String QueryTxt; //�ԷµǴ� ���� console â���� Ȯ���ϱ� ���� ������ ���� ����, + sql���� ��� ����
			// �Է¹��� ���� ���� sql ��ɾ� ����
			//���� �Է� ���� ������� ����
			QueryTxt = String.format("insert into parkingdata (parking_number, parking_name, longitude, latitude, "
					+ "parkingspot_type, parking_type, parking_lot_addr, parking_lot_street, parking_lot_number, "
					+ "working_date, week_start, week_end, weekend_start, weekend_end, holiday_start, holiday_end,"
					+ "fee_type, control_lot, district_division, district_division_sub, "
					+ " regional_center_spotX, regional_center_spotY, local_code, number, modified_date) " 
					+ "values ("  // �� �Է� ����
					+ "%s, '%s', %s, %s, '%s', " //������ȣ, �̸�, �浵, ����, ����
					+ "'%s', '%s', '%s', %s, '%s', " //����, �����ּ�, ���θ��ּ�, ������ȹ��, �����
					+ "'%s', '%s', '%s', '%s', '%s', '%s', "  //���Ͻ���, ��������, �ָ�����, �ָ�����, �����Ͻ���, ����������
					+ "'%s', '%s', '%s', '%s', " //�������, �������, ��������, ��������sub
					+ "%s, %s, %s, '%s', '%s');", // x, y, �����ڵ�, ����ó, ��������
					field[0], field[1], field[2], field[3], field[4], // �迭�� ��Ƶ� ���� ���信 �°� �����Ѵ�.
					field[5], field[6], field[7], field[8], field[9], 
					field[10], field[11], field[12], field[13], field[14],
					field[15], field[16], field[17], field[18], field[19],
					field[20], field[21], field[22], field[23], field[24]);
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
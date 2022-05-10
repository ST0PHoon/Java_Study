package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class pg22_create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java���� sql jdbc ����̹� ����
		// ����̹� �Ŵ��� ����, ip:mysql��Ʈ������ ��ȣ,  sql id(root������), ��й�ȣ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql ��ɾ� ���
		
		stmt.execute( "create table freewifi2(" +				//freewifi ���̺� ����
				"inst_place varchar(50) NOT NULL, " + 			//inst_place, ����(50����), �ݵ�� ����
				"inst_place_detail varchar(50) NOT NULL, " +	//inst_place_detail, ����(50����)
				"inst_city varchar(50), " + 					//inst_city, ����(50����)
				"inst_country varchar(50), " +					//inst_country, ����(50����)
				"inst_place_flag varchar(50), " +				//inst_place_flag, ����(50����)
				"service_provider varchar(50), " +				//service_provider, ����(50����)
				"wifi_ssid varchar(100) NOT NULL, " + 			//wifi_ssid, ����(100����), �ݵ�� ����
				"inst_date varchar(50), " +						//inst_date, ����(50����)
				"place_addr_road varchar(200), " +				//place_addr_road, ����(200����)
				"place_addr_land varchar(200), " +				//place_addr_land, ����(200����)
				"manage_office varchar(50), " +					//manage_office, ����(50����)
				"manage_office_phone varchar(50), " +			//manage_office_phone, ����(50����)
				"latitude double NOT NULL, " +					//latitude(����), ����, �ݵ�� ����
				"longitude double NOT NULL, " +					//longitude(�浵), ����, �ݵ�� ����
				"write_date date, "	+							//write_date(������ ���� ����) ��¥
				// �����̸Ӹ� Ű ����
				"PRIMARY KEY(inst_place, inst_place_detail, wifi_ssid, latitude, longitude, inst_date))");
		
		// ��� �� ����
		stmt.close();
		conn.close();

	}

}

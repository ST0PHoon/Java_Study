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
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// 읽어올 파일 선언
		File f = new File("C:\\Users\\kopo\\Desktop\\수업자료\\데이터베이스(DB)\\전국무료와이파이표준데이터.txt");
		BufferedReader br = new BufferedReader(new FileReader(f)); // 선언한 파일 BufferedReader로 읽기
		
		String readtxt; //한줄씩 읽어올 문자열 변수 선언
		// 읽어왔을 때, null(빈값) 이면 빈 파일입니다 메세지 출력
		if ((readtxt = br.readLine()) == null) {
			System.out.println("빈 파일입니다.");
			return;
		}

		int LineCnt = 0;	//몇번째 항목인지 표시하기 위한 변수 선언
		while ((readtxt = br.readLine())!=null) { //값을 읽는 while문 선언, 값이 없으면 null값 출력, 이때 while문 종료
			String[] field = readtxt.split("\t"); // 탭을 기준으로 받아온 문자열을 배열에 입력
			String QueryTxt; //입력되는 값을 console 창에서 확인하기 위한 문자형 변수 선언, + sql에서 명령 실행
			// 입력받은 값을 통해 sql 명령어 실행
			QueryTxt = String.format("insert into freewifi3 (inst_place, inst_place_detail, inst_city, "
					+ "inst_country, inst_place_flag, service_provider, wifi_ssid, inst_date, "
					+ "place_addr_road, place_addr_land, manage_office, manage_office_phone, "
					+ "latitude, longitude, write_date) " //값을 입력 받을 변수명들 지정
					+ "values ("  // 값 입력 구간
					+ "'%s', '%s', '%s', '%s', '%s', " //문자열인 경우 ''안에 기입
					+ "'%s', '%s', '%s', '%s', '%s', " //문자열인 경우 ''안에 기입
					+ "'%s', '%s', %s, %s, '%s');", //위도 경도는 double형이여서 ''안에 기입하지 않는다.
					field[0], field[1], field[2], field[3], field[4], // 배열에 담아둔 값을 포멧에 맞게 기입한다.
					field[5], field[6], field[7], field[8], field[9], 
					field[10], field[11], field[12], field[13], field[14] );
			stmt.execute(QueryTxt); // 입력받은 sql명령을 실행한다.
			System.out.printf("%d번째 항목 Insert OK [%s]\n", LineCnt, QueryTxt); //console창에서 보여주기 위한 메세지 출력코드
			
			LineCnt++; //몇번째인지 보여주는 변수 1 증가
		}
		// 사용 후 종료
		br.close();
		stmt.close();
		conn.close();
	}

}

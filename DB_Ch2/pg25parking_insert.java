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
	// 주차장
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// 읽어올 파일 선언
		File f = new File("C:\\Users\\kopo\\Desktop\\요약자료\\자바\\20220422_자바\\한국교통안전공단_전국공영주차장정보_20191224.csv");
		BufferedReader br = new BufferedReader(new FileReader(f)); // 선언한 파일 BufferedReader로 읽기
		
		String readtxt; //한줄씩 읽어올 문자열 변수 선언
		// 읽어왔을 때, null(빈값) 이면 빈 파일입니다 메세지 출력
		if ((readtxt = br.readLine()) == null) {
			System.out.println("빈 파일입니다.");
			return;
		}

		int LineCnt = 0;	//몇번째 항목인지 표시하기 위한 변수 선언
		while ((readtxt = br.readLine())!=null) { //값을 읽는 while문 선언, 값이 없으면 null값 출력, 이때 while문 종료
			String[] field = readtxt.split(","); // 탭을 기준으로 받아온 문자열을 배열에 입력
			String QueryTxt; //입력되는 값을 console 창에서 확인하기 위한 문자형 변수 선언, + sql에서 명령 실행
			// 입력받은 값을 통해 sql 명령어 실행
			//값을 입력 받을 변수명들 지정
			QueryTxt = String.format("insert into parkingdata (parking_number, parking_name, longitude, latitude, "
					+ "parkingspot_type, parking_type, parking_lot_addr, parking_lot_street, parking_lot_number, "
					+ "working_date, week_start, week_end, weekend_start, weekend_end, holiday_start, holiday_end,"
					+ "fee_type, control_lot, district_division, district_division_sub, "
					+ " regional_center_spotX, regional_center_spotY, local_code, number, modified_date) " 
					+ "values ("  // 값 입력 구간
					+ "%s, '%s', %s, %s, '%s', " //관리번호, 이름, 경도, 위도, 구분
					+ "'%s', '%s', '%s', %s, '%s', " //유형, 지번주소, 도로명주소, 주차구획수, 운영요일
					+ "'%s', '%s', '%s', '%s', '%s', '%s', "  //평일시작, 평일종료, 주말시작, 주말종료, 공휴일시작, 공휴일종료
					+ "'%s', '%s', '%s', '%s', " //요금정보, 관리기관, 지역구분, 지역구분sub
					+ "%s, %s, %s, '%s', '%s');", // x, y, 지역코드, 연락처, 수정일자
					field[0], field[1], field[2], field[3], field[4], // 배열에 담아둔 값을 포멧에 맞게 기입한다.
					field[5], field[6], field[7], field[8], field[9], 
					field[10], field[11], field[12], field[13], field[14],
					field[15], field[16], field[17], field[18], field[19],
					field[20], field[21], field[22], field[23], field[24]);
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
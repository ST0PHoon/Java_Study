package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg24 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// 위도 경도 입력
		double lat = 37.3860521;
		double lng = 127.1214038;
		// sql 명령어를 실행할 문자열 선언
		 String QueryTxt;
		 
		 // freewifi 테이블의 모든 값들 중, inst_country가 수원시인 값들만 출력한다.
		 QueryTxt = "select * from freewifi where inst_country = '수원시';";

	      //sql 명령어 실행후 결과를 보기위해 executeQuery로 명령어 실행
	      ResultSet rset = stmt.executeQuery(QueryTxt);
	      //몇번째 데이터인지 보여주기 위한 정수형 변수 선언
	      int iCnt = 0; 
	      // 명령을 실행한 결과를 출력하기 위한 while문 선언, 빈값이 들어오면 while문 종료
	      while (rset.next()) {
	         System.out.printf("* (%d)******************************\n", iCnt++);	//구분선 출력
	         System.out.printf("설치장소명 : %s\n", rset.getString(1));				//설치장소명 출력
	         System.out.printf("설치장소상세 : %s\n", rset.getString(2));			//설치장소상세 출력
	         System.out.printf("설치시도명 : %s\n", rset.getString(3));				//설치시도명 출력
	         System.out.printf("설치시군구명 : %s\n", rset.getString(4));			//설치시군구명 출력
	         System.out.printf("설치시설구분 : %s\n", rset.getString(5));			//설치시설구분 출력
	         System.out.printf("서비스제공사명 : %s\n", rset.getString(6));			//서비스제공사명 출력
	         System.out.printf("와이파이SSID : %s\n", rset.getString(7));			//와이파이ssid 출력
	         System.out.printf("설치년월 : %s\n", rset.getString(8));				//설치년월 출력
	         System.out.printf("소재지도로명주소 : %s\n", rset.getString(9));		//소재지도로명주소 출력
	         System.out.printf("소재지지번주소 : %s\n", rset.getString(10));		//소재지지번주소 출력
	         System.out.printf("관리기관명 : %s\n", rset.getString(11));			//관리기관명 출력
	         System.out.printf("관리기관전화번호 : %s\n", rset.getString(12));		//관리기관전화번호 출력
	         System.out.printf("위도 : %s\n", rset.getString(13));					//위도 출력
	         System.out.printf("경도: %s\n", rset.getString(14));					//경도 출력
	         System.out.printf("데이터기준일자 : %s\n", rset.getString(15));		//데이터기준일자 출력
	      }
	      
	      rset.close(); //ResultSe 종료 
	      stmt.close(); //Statement 종료
	      conn.close(); //Connection 종료
	   }
	}
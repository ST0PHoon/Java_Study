package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg25parking_select {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// 위도 경도 입력
		double lat = 37.3860521;
		double lng = 127.1214038;
		// sql 명령어를 실행할 문자열 선언
		 String QueryTxt;
		 //입력한 위도 경도를 기준으로 데이터에 있는 장소중 가장 가까운 장소 계산
//	      QueryTxt = String.format("select * from parkingdata where "
//	            + "SQRT( POWER ( latitude-%f, 2) + POWER ( longitude-%f, 2)) = " +
//	                        "(select MIN( SQRT( POWER( latitude-%f,2) + POWER ( longitude-%f, 2))) from parkingdata);", 
//	                        lat, lng, lat, lng);

		 // parkingdata 테이블의 모든 값을 보여준다.
//		 QueryTxt = "select * from parkingdata";

		 // parkingdata테이블의 모든 값들 중, inst_country가 노외인 값들만 출력한다.
		 QueryTxt = "select * from parkingdata where parking_type = '노외';";

		  //sql 명령어 실행후 결과를 보기위해 executeQuery로 명령어 실행
	      ResultSet rset = stmt.executeQuery(QueryTxt);
	      //몇번째 데이터인지 보여주기 위한 정수형 변수 선언
	      int iCnt = 0; 
	      // 명령을 실행한 결과를 출력하기 위한 while문 선언, 빈값이 들어오면 while문 종료
	      while (rset.next()) {
	    	 // 받아온 결과의 항목들을 출력한다.
	         System.out.printf("* (%d)******************************\n", iCnt++);	
	         System.out.printf("관리번호 : %s\n", rset.getString(1));				
	         System.out.printf("주차장이름 : %s\n", rset.getString(2));			
	         System.out.printf("경도 : %s\n", rset.getString(3));				
	         System.out.printf("위도 : %s\n", rset.getString(4));			
	         System.out.printf("주차장구분 : %s\n", rset.getString(5));			
	         System.out.printf("주차장유형 : %s\n", rset.getString(6));			
	         System.out.printf("주차장지번주소 : %s\n", rset.getString(7));			
	         System.out.printf("주차장도로명주소 : %s\n", rset.getString(8));				
	         System.out.printf("주차구획수 : %s\n", rset.getString(9));		
	         System.out.printf("운영요일 : %s\n", rset.getString(10));		
	         System.out.printf("평일운영시작시각 : %s\n", rset.getString(11));			
	         System.out.printf("평일운영종료시각 : %s\n", rset.getString(12));		
	         System.out.printf("토요일운영시작시각 : %s\n", rset.getString(13));					
	         System.out.printf("토요일운영종료시각: %s\n", rset.getString(14));					
	         System.out.printf("공휴일운영시작시각 : %s\n", rset.getString(15));		
	         System.out.printf("공휴일운영종료시각 : %s\n", rset.getString(16));
	         System.out.printf("요금정보 : %s\n", rset.getString(17));
	         System.out.printf("관리기관명 : %s\n", rset.getString(18));
	         System.out.printf("지역구분 : %s\n", rset.getString(19));
	         System.out.printf("지역구분sub : %s\n", rset.getString(20));
	         System.out.printf("지역중심좌표X : %s\n", rset.getString(21));
	         System.out.printf("지역중심좌표Y : %s\n", rset.getString(22));
	         System.out.printf("지역코드 : %s\n", rset.getString(23));
	         System.out.printf("연락처 : %s\n", rset.getString(24));
	         System.out.printf("수정날짜 : %s\n", rset.getString(25));
	      }
	      
	      rset.close(); //ResultSe 종료 
	      stmt.close(); //Statement 종료
	      conn.close(); //Connection 종료
	   }
	}
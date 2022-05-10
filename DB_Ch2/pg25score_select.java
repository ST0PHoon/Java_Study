package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pg25score_select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); //java에서 sql jdbc 드라이버 지정
		// 드라이버 매니저 연결, ip:mysql포트포워딩 번호,  sql id(root관리자), 비밀번호
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.108:3306/kopoctc", "root", "kopo37");
		Statement stmt = conn.createStatement(); //sql 명령어 사용
		// sql명령어를 실행할 문자 변수 생성 
		String QueryTxt;
		// 0부터 999까지 30씩 증가하는 i를 변수로 가지는 for문 작성
		for(int i = 0; i < 1000; i=i+30) { 
			// scorelist 테이블의 i번째부터 30개의 값을 전부 받고, 합, 평균의 값을 받아옵니다.
			QueryTxt = String.format(" select *, kor+eng+mat, (kor+eng+mat)/3 from scorelist limit %d, 30;", i);
			// 실행한 명령어의 결과를 받아온다.
		    ResultSet rset = stmt.executeQuery(QueryTxt);
		    
		    System.out.printf("**********************************************\n");	//구분선 출력
		    //구분 작성
	        System.out.printf("%s%4s%6s%4s%4s%4s%4s\n", "학번", "이름", "국어", "영어", "수학", "합계", "평균");
		    // 명령을 실행한 결과를 출력하기 위한 while문 선언, 빈값이 들어오면 while문 종료
	        while (rset.next()) { //i번째부터 30명의 학번, 이름, 국어, 영어, 수학, 합계, 평균을 출력한다.
	        	System.out.printf("%04d%6s%5d%6d%6d%6d  %6.2f \n", rset.getInt(1),rset.getString(2),rset.getInt(3),rset.getInt(4),rset.getInt(5),rset.getInt(6),rset.getDouble(7));	
		    }
		    System.out.printf("*******************************************\n");	//구분선 출력
		    // 현재 합계, 평균 출력
		    System.out.printf("현재\n");	//구분선 출력
		    //현재 페이지의 국어, 영어, 수학, 합계, 평균의 합을 출력하고 줄바꾸고 앞 과목들의 평균을 출력하는 sql 코드 작성
		    QueryTxt = String.format(" select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
		    		+ "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from scorelist limit %d,30)as sum;", i);
		    //위에서 실행한 명령의 결과를 입력한다. 
		    ResultSet rset2 = stmt.executeQuery(QueryTxt);
		    // 선언한 코드의 결과를 출력한다.
		    while (rset2.next()) {
	        	System.out.printf("    %5d %6d %6d %6d  %6.2f \n", rset2.getInt(1),rset2.getInt(2),rset2.getInt(3),rset2.getInt(4),rset2.getDouble(5));
	        	System.out.printf("    %5.2f %6.2f %6.2f %6.2f  %6.2f \n", rset2.getDouble(6),rset2.getDouble(7),rset2.getDouble(8),rset2.getDouble(9),rset2.getDouble(10));	
		    }
		    // 누적값 출력
		    System.out.printf("누적\n");	//구분선 출력
		    // 990명일때 970명으로 수정해서 1000명으로 맞춘다.
		    if (i == 990) {
		    	i=970;
		    }
		    // 국어, 영어, 수학, 합계, 평균의 누적 값을 출력한다.
		    QueryTxt = String.format(" select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), "
		    		+ "avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from scorelist limit 0, %d)as avg;", (i+30));
		    // 명령어 실행한 결과를 받아온다.
		    ResultSet rset3 = stmt.executeQuery(QueryTxt);
		    // 위에서 실행한 명령어의 결과를 출력한다.
		    while (rset3.next()) {
	        	System.out.printf("    %5d %6d %6d %6d  %6.2f \n", rset3.getInt(1),rset3.getInt(2),rset3.getInt(3),rset3.getInt(4),rset3.getDouble(5));
	        	System.out.printf("    %5.2f %6.2f %6.2f %6.2f  %6.2f \n", rset3.getDouble(6),rset3.getDouble(7),rset3.getDouble(8),rset3.getDouble(9),rset3.getDouble(10));	
		    }
		  //ResultSe 종료 
		    rset.close(); 
		    rset2.close();
		    rset3.close();
		}
	     stmt.close(); //Statement 종료
	     conn.close(); //Connection 종료
	   }
	}
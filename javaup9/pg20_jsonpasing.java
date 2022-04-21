package javajump9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class pg20_jsonpasing {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		// JSONParser 선언
		JSONParser k37_parser = new JSONParser();
		// 읽어올 제이슨 파일의 위치와 이름 지정
		Object k37_obj = k37_parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\ch9\\test.json"));
		// JSONArray 선언
		JSONArray k37_array = (JSONArray)k37_obj;

		System.out.println("********************************************");
		// 학생의 수만큼 도는 for문 작성( 0 1 2 3 ... 7 8)
		for(int k37_i = 0; k37_i < k37_array.size(); k37_i++) {
			// i번째 학생을 데이터를 가져와 result에 넣는다.
			JSONObject k37_result = (JSONObject) k37_array.get(k37_i);
			// 입력 받은 이름과 학번을 출력한다.
			System.out.println("이름 : " + k37_result.get("name"));
			System.out.println("학번 : " + k37_result.get("studentid"));
			// 성적을 가져온다. 배열형태
			JSONArray k37_score = (JSONArray) k37_result.get("score");
			long k37_kor = (long) k37_score.get(0);	//0번째는 국어성적
			long k37_eng = (long) k37_score.get(1);	// 1번째는 영어성적
			long k37_mat = (long) k37_score.get(2);	// 2번째는 수학성적
			// 각각 입력받은 값을 출력한다.
			System.out.println("국어 : " + k37_kor);
			System.out.println("영어 : " + k37_eng);
			System.out.println("수학 : " + k37_mat);
			System.out.println("총점 : " + (k37_kor + k37_mat + k37_eng));
			System.out.println("평균 : " + (k37_kor + k37_mat + k37_eng)/3.0);
		}
		
	}

}

package javajump9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class pg18 {
	
	public static void main(String[] args) {
		// Json만들기
		// JSONObject 선언 최종으로 완성될 예정
		JSONObject k37_jsonObject = new JSONObject();
		// JSONArray 선언, 한명의 성적 정보를 담을 array
		JSONArray k37_datasArray = new JSONArray();
		// JSONObject 한명 정보가 들어갈 예정이다.
		JSONObject k37_dataObject = new JSONObject();
		// 이름, 나연 / 학번, 209901 을 넣는다.
		k37_dataObject.put("name", "나연");
		k37_dataObject.put("studentid", "209901");
		//JSONArray 생성
		JSONArray k37_score = new JSONArray();
		// 생성한 어레이에 성적을 입력한다. 나연의 성적
		k37_score.add(90); k37_score.add(100); k37_score.add(95); 
		k37_dataObject.put("score", k37_score);
		k37_datasArray.add(k37_dataObject);
		
		// 아래서 선언한 메소드로 8명의 성적을 입력한다.
		k37_datasArray.add(k37_oneRec("정연", 209902, 100, 85, 75));
		k37_datasArray.add(k37_oneRec("모모", 209903, 100, 85, 75));
		k37_datasArray.add(k37_oneRec("사나", 209904, 100, 100, 100));
		k37_datasArray.add(k37_oneRec("지효", 209905, 100, 85, 75));
		k37_datasArray.add(k37_oneRec("미나", 209906, 90, 85, 70));
		k37_datasArray.add(k37_oneRec("다현", 209907, 90, 85, 75));
		k37_datasArray.add(k37_oneRec("채영", 209908, 100, 90, 75));
		k37_datasArray.add(k37_oneRec("쯔위", 209909, 70, 85, 75));
		
		try {	// try catch 선언
			// FileWriter 선언, 파일을 생성할 위치와 파일명 작성
			FileWriter k37_file = new FileWriter("C:\\Users\\kopo\\Desktop\\ch9\\test.json");
			// 입력받은 제이슨 어레이를 스트링으로 변환한다.
			k37_file.write(k37_datasArray.toJSONString());
			k37_file.flush();	// 메모리를 디바이스로 옮겨라
			k37_file.close();	// filewriter 종료
		} catch(IOException k37_e) {
			k37_e.printStackTrace();	// 에레가 발생해도 진행, 에레메세지 저장
		}
		System.out.printf("JSON 만든거 : " + k37_datasArray);	// 만들 결과물 출력
	}
	// 이름, 학번, 성적, 을 입력하고 JSONObject형태로 리턴받는 메소드 생성
	public static JSONObject k37_oneRec (String name, int k37_studentid, int k37_kor, int k37_eng, int k37_mat) {
		// JSONObject 한명 정보가 들어갈 예정이다.
		JSONObject k37_dataObject = new JSONObject();
		// 이름에 입력받은 이름을 넣는다.
		k37_dataObject.put("name", name);
		k37_dataObject.put("studentid", k37_studentid);	// 학번에 입력받은 학번을 넣는다.
		
		JSONArray k37_score = new JSONArray();	// 성적 어레이를 만든다
		// 국어 영어 수학 성적을 입력하여 위에서 만든 성적 어레이에 넣는다.
		k37_score.add(k37_kor); k37_score.add(k37_eng); k37_score.add(k37_mat);
		// 성적을 모두 입력받은 어레이를 학생 어레이에 추가한다
		k37_dataObject.put("score", k37_score);
		// 완성한 어레이를 리턴한다.
		return k37_dataObject;
	}

}

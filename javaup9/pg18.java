package javajump9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class pg18 {

	public static void main(String[] args) {
		// Json�����
		JSONObject jsonObject = new JSONObject();
		
		JSONArray datasArray = new JSONArray();
		
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", "����");
		dataObject.put("studentid", "209901");
		
		JSONArray score = new JSONArray();
		score.add(90); score.add(100); score.add(95); 
		dataObject.put("score", score);
		datasArray.add(dataObject);
		
		datasArray.add(oneRec("����", 209902, 100, 85, 75));
		datasArray.add(oneRec("���", 209903, 100, 85, 75));
		datasArray.add(oneRec("�糪", 209904, 100, 100, 100));
		datasArray.add(oneRec("��ȿ", 209905, 100, 85, 75));
		datasArray.add(oneRec("�̳�", 209906, 90, 85, 70));
		datasArray.add(oneRec("����", 209907, 90, 85, 75));
		datasArray.add(oneRec("ä��", 209908, 100, 90, 75));
		datasArray.add(oneRec("����", 209909, 70, 85, 75));
		
		try {
			FileWriter file = new FileWriter("C:\\Users\\kopo\\Desktop\\ch9\\test.json");
			file.write(datasArray.toJSONString());
			file.flush();
			file.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.printf("JSON ����� : " + datasArray);
	}
	
	public static JSONObject oneRec (String name, int studentid, int kor, int eng, int mat) {
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", name);
		dataObject.put("studentid", studentid);
		
		JSONArray score = new JSONArray();
		score.add(kor); score.add(eng); score.add(mat);
		dataObject.put("score", score);
		
		return dataObject;
	}

}

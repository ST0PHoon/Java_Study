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
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\ch9\\test.json"));
		
		JSONArray array = (JSONArray)obj;

		System.out.println("********************************************");
		
		for(int i = 0; i < array.size(); i++) {
			JSONObject result = (JSONObject) array.get(i);
			System.out.println("�̸� : " + result.get("name"));
			System.out.println("�й� : " + result.get("studentid"));
			
			JSONArray score = (JSONArray) result.get("score");
			long kor = (long) score.get(0);
			long eng = (long) score.get(1);
			long mat = (long) score.get(2);
			
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + mat);
			System.out.println("���� : " + (kor + mat + eng));
			System.out.println("���� : " + (kor + mat + eng)/3.0);
		}
		
		
		
	}

}

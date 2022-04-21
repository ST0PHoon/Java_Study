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
		// JSONParser ����
		JSONParser k37_parser = new JSONParser();
		// �о�� ���̽� ������ ��ġ�� �̸� ����
		Object k37_obj = k37_parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\ch9\\test.json"));
		// JSONArray ����
		JSONArray k37_array = (JSONArray)k37_obj;

		System.out.println("********************************************");
		// �л��� ����ŭ ���� for�� �ۼ�( 0 1 2 3 ... 7 8)
		for(int k37_i = 0; k37_i < k37_array.size(); k37_i++) {
			// i��° �л��� �����͸� ������ result�� �ִ´�.
			JSONObject k37_result = (JSONObject) k37_array.get(k37_i);
			// �Է� ���� �̸��� �й��� ����Ѵ�.
			System.out.println("�̸� : " + k37_result.get("name"));
			System.out.println("�й� : " + k37_result.get("studentid"));
			// ������ �����´�. �迭����
			JSONArray k37_score = (JSONArray) k37_result.get("score");
			long k37_kor = (long) k37_score.get(0);	//0��°�� �����
			long k37_eng = (long) k37_score.get(1);	// 1��°�� �����
			long k37_mat = (long) k37_score.get(2);	// 2��°�� ���м���
			// ���� �Է¹��� ���� ����Ѵ�.
			System.out.println("���� : " + k37_kor);
			System.out.println("���� : " + k37_eng);
			System.out.println("���� : " + k37_mat);
			System.out.println("���� : " + (k37_kor + k37_mat + k37_eng));
			System.out.println("��� : " + (k37_kor + k37_mat + k37_eng)/3.0);
		}
		
	}

}

package javajump9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class pg18 {
	
	public static void main(String[] args) {
		// Json�����
		// JSONObject ���� �������� �ϼ��� ����
		JSONObject k37_jsonObject = new JSONObject();
		// JSONArray ����, �Ѹ��� ���� ������ ���� array
		JSONArray k37_datasArray = new JSONArray();
		// JSONObject �Ѹ� ������ �� �����̴�.
		JSONObject k37_dataObject = new JSONObject();
		// �̸�, ���� / �й�, 209901 �� �ִ´�.
		k37_dataObject.put("name", "����");
		k37_dataObject.put("studentid", "209901");
		//JSONArray ����
		JSONArray k37_score = new JSONArray();
		// ������ ��̿� ������ �Է��Ѵ�. ������ ����
		k37_score.add(90); k37_score.add(100); k37_score.add(95); 
		k37_dataObject.put("score", k37_score);
		k37_datasArray.add(k37_dataObject);
		
		// �Ʒ��� ������ �޼ҵ�� 8���� ������ �Է��Ѵ�.
		k37_datasArray.add(k37_oneRec("����", 209902, 100, 85, 75));
		k37_datasArray.add(k37_oneRec("���", 209903, 100, 85, 75));
		k37_datasArray.add(k37_oneRec("�糪", 209904, 100, 100, 100));
		k37_datasArray.add(k37_oneRec("��ȿ", 209905, 100, 85, 75));
		k37_datasArray.add(k37_oneRec("�̳�", 209906, 90, 85, 70));
		k37_datasArray.add(k37_oneRec("����", 209907, 90, 85, 75));
		k37_datasArray.add(k37_oneRec("ä��", 209908, 100, 90, 75));
		k37_datasArray.add(k37_oneRec("����", 209909, 70, 85, 75));
		
		try {	// try catch ����
			// FileWriter ����, ������ ������ ��ġ�� ���ϸ� �ۼ�
			FileWriter k37_file = new FileWriter("C:\\Users\\kopo\\Desktop\\ch9\\test.json");
			// �Է¹��� ���̽� ��̸� ��Ʈ������ ��ȯ�Ѵ�.
			k37_file.write(k37_datasArray.toJSONString());
			k37_file.flush();	// �޸𸮸� ����̽��� �Űܶ�
			k37_file.close();	// filewriter ����
		} catch(IOException k37_e) {
			k37_e.printStackTrace();	// ������ �߻��ص� ����, �����޼��� ����
		}
		System.out.printf("JSON ����� : " + k37_datasArray);	// ���� ����� ���
	}
	// �̸�, �й�, ����, �� �Է��ϰ� JSONObject���·� ���Ϲ޴� �޼ҵ� ����
	public static JSONObject k37_oneRec (String name, int k37_studentid, int k37_kor, int k37_eng, int k37_mat) {
		// JSONObject �Ѹ� ������ �� �����̴�.
		JSONObject k37_dataObject = new JSONObject();
		// �̸��� �Է¹��� �̸��� �ִ´�.
		k37_dataObject.put("name", name);
		k37_dataObject.put("studentid", k37_studentid);	// �й��� �Է¹��� �й��� �ִ´�.
		
		JSONArray k37_score = new JSONArray();	// ���� ��̸� �����
		// ���� ���� ���� ������ �Է��Ͽ� ������ ���� ���� ��̿� �ִ´�.
		k37_score.add(k37_kor); k37_score.add(k37_eng); k37_score.add(k37_mat);
		// ������ ��� �Է¹��� ��̸� �л� ��̿� �߰��Ѵ�
		k37_dataObject.put("score", k37_score);
		// �ϼ��� ��̸� �����Ѵ�.
		return k37_dataObject;
	}

}

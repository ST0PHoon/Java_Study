package javajump9;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class pg14 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// pg14 ���û
		// ���ڿ� ���� ����
		String k37_seq="";	// 48�ð��� ���° ���� ����Ŵ
		String k37_hour="";	// ���׿��� 3�ð� ����
		String k37_day="";	//1��°�� (0: ����/1: ����/2: ��)
		String k37_temp="";	// ���� �ð��µ�
		String k37_tmx="";	 // �ְ� �µ�
		String k37_tmn="";	// ���� �µ�
		String k37_sky="";	//�ϴ� �����ڵ� (1: ����, 2: ��������, 3 : ��������, 4: �帲) 
		String k37_pty="";	 //���� �����ڵ� (0: ����, 1: ��, 2: ��/��, 3: ��/��, 4: ��
		String k37_wfKor="";	//���� �ѱ���
		String k37_wfEn=""; 	 //���� ����
		String k37_pop="";	// ���� Ȯ�� %
		String k37_r12="";	 //12�ð� ���� ������
		String k37_s12="";	 //12�ð� ���� ������
		String k37_ws="";	 // ǳ��(m/s)
		String k37_wd="";	 //ǳ�� (0~7: ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)
		String k37_wdKor="";	// ǳ�� �ѱ���
		String k37_wdEn="";	// ǳ�� ����
		String k37_reh="";	//����%
		String k37_r06="";	 //6�ð� ���� ������
		String k37_s06="";	//6�ð� ���� ������

		// �ľ��� ���� �غ�, DocumentBuilder����
		DocumentBuilder k37_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml ������ ó��, PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� 
		Document k37_doc = k37_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\ch9\\queryDFS.xml"));
		// root�ױ׸� ������ ���⵵ ������ ���� �ڵ忡�� ���� �ʴ´�.
		Element k37_root = k37_doc.getDocumentElement();
		// NodeList ����, data �±׸� �����´�.
		NodeList k37_tag_001 = k37_doc.getElementsByTagName("data");
		// �±��� ���̸�ŭ ���� for�� �ۼ�, data�� ��� ������ ������´�.
		for (int k37_i = 0; k37_i < k37_tag_001.getLength(); k37_i++) {
			// k37_tag_001�� i��° ������ �����´�.
			Element k37_elmt=(Element) k37_tag_001.item(k37_i);
			// xml���� i���� seq�� ������ �����Ѵ�.
			k37_seq = k37_tag_001.item(k37_i).getAttributes().getNamedItem("seq").getNodeValue();
			// xml�� 1��° seq ������ �׵� ���� �ش��ϴ� �κ��� ������ ������ ������ string ������ �־��ش�.			
			k37_hour = k37_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k37_day = k37_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			k37_temp = k37_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k37_tmx = k37_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			k37_tmn = k37_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k37_sky = k37_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			k37_pty = k37_elmt.getElementsByTagName ("pty").item(0).getFirstChild().getNodeValue();
			k37_wfKor = k37_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			k37_wfEn = k37_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			k37_pop = k37_elmt.getElementsByTagName ("pop").item(0).getFirstChild().getNodeValue();
			k37_r12 = k37_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k37_s12 = k37_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			k37_ws = k37_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			k37_wd = k37_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			k37_wdKor = k37_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k37_wdEn = k37_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			k37_reh = k37_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			k37_r06 = k37_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			k37_s06 = k37_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			
			// �޼��� ��� ����
			System.out.println(k37_seq +"��° �ڷ� ************************************************");
			System.out.println("���׿��� 3�ð� ����");
			System.out.println("�ð�               : " + k37_hour);
			System.out.println("��¥ ����(0: ����/1: ����/2: ��)");
			System.out.println("��¥               : " + k37_day);
			System.out.println("���� �µ�          : " + k37_temp);
			System.out.println("�ְ� �µ�          : " + k37_tmx);
			System.out.println("���� �µ�          : " + k37_tmn);
			System.out.println("�ϴ� �����ڵ� (1: ����, 2: ��������, 3 : ��������, 4: �帲)");
			System.out.println("�ϴ� ����          : " + k37_sky);
			System.out.println("���� �����ڵ� (0: ����, 1: ��, 2: ��/��, 3: ��/��, 4: ��)");	
			System.out.println("���� ����          : " + k37_pty);
			System.out.println("���� �ѱ���        : " + k37_wfKor);
			System.out.println("���� ����          : " + k37_wfEn);
			System.out.println("����Ȯ��           : " + k37_pop +"%");
			System.out.println("12�ð� ���� ������ : " +k37_r12);
			System.out.println("12�ð� ���� ������ : " + k37_s12);
			System.out.println("ǳ��               : " + k37_ws + "(m/s)");
			System.out.println("ǳ�� (0~7: ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)");	
			System.out.println("ǳ��               : " + k37_wd );
			System.out.println("ǳ�� �ѱ���        : " + k37_wdKor);
			System.out.println("ǳ�� ����          : " + k37_wdEn);
			System.out.println("����               : " + k37_reh +"%");
			System.out.println("6�ð� ���� ������  : " + k37_r06);
			System.out.println("6�ð� ���� ������  : " +k37_s06);
			System.out.println("************************************************************");
		}
		
		System.out.println("");


	}

}

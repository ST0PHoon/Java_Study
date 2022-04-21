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

public class pg9_scorexml {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// 9pg XML�Ľ� �⺻
		// �ľ��� ���� �غ�, DocumentBuilder����
		DocumentBuilder k37_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml ������ ó��, PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� 
		Document k37_doc = k37_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\ch9\\score.xml"));
		// root�ױ׸� ������ ���⵵ ������ ���� �ڵ忡�� ���� �ʴ´�.
		Element k37_root = k37_doc.getDocumentElement();
		
		NodeList k37_tag_name = k37_doc.getElementsByTagName("name");	//xml ���Ͽ��� name �� ���� �����ͼ� �Է��Ѵ�.
		NodeList k37_tag_studentid = k37_doc.getElementsByTagName("studentid");	//xml ���Ͽ��� studentid �� ���� �����ͼ� �Է��Ѵ�.
		NodeList k37_tag_kor = k37_doc.getElementsByTagName("kor");	//xml ���Ͽ��� kor�� ���� �����ͼ� �Է��Ѵ�.
		NodeList k37_tag_eng = k37_doc.getElementsByTagName("eng");	//xml ���Ͽ��� eng �� ���� �����ͼ� �Է��Ѵ�.
		NodeList k37_tag_mat = k37_doc.getElementsByTagName("mat");	//xml ���Ͽ��� mat �� ���� �����ͼ� �Է��Ѵ�.
		
		System.out.println("******************************************");
		
		for(int i = 0; i < k37_tag_name.getLength(); i++) {	// �ο��� ��ŭ ������ for�� �ۼ�
			System.out.printf("�̸� : %s\n",k37_tag_name.item(i).getFirstChild().getNodeValue());	// i��° �л��� �̸��� �����´�.
			System.out.printf("�й� : %s\n",k37_tag_studentid.item(i).getFirstChild().getNodeValue());	// i��° �л��� �й��� �����´�.
			System.out.printf("���� : %s\n", k37_tag_kor.item(i).getFirstChild().getNodeValue());	// i��° �л��� ������� �����´�.
			System.out.printf("���� : %s\n", k37_tag_eng.item(i).getFirstChild().getNodeValue());	// i��° �л��� ������� �����´�.
			System.out.printf("���� : %s\n", k37_tag_mat.item(i).getFirstChild().getNodeValue());	// i��° �л��� ���м����� �����´�.
			System.out.println("******************************************");
			
		}
		
	}

}

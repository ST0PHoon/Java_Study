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
		// 9pg XML파싱 기본
		// 파씽을 위한 준비, DocumentBuilder선언
		DocumentBuilder k37_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml 파일을 처리, PC안에 있어서 전체경로를 지정, xml 파싱처리 
		Document k37_doc = k37_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\ch9\\score.xml"));
		// root테그를 가지고 오기도 하지만 지금 코드에선 쓰지 않는다.
		Element k37_root = k37_doc.getDocumentElement();
		
		NodeList k37_tag_name = k37_doc.getElementsByTagName("name");	//xml 파일에서 name 의 값을 가져와서 입력한다.
		NodeList k37_tag_studentid = k37_doc.getElementsByTagName("studentid");	//xml 파일에서 studentid 의 값을 가져와서 입력한다.
		NodeList k37_tag_kor = k37_doc.getElementsByTagName("kor");	//xml 파일에서 kor의 값을 가져와서 입력한다.
		NodeList k37_tag_eng = k37_doc.getElementsByTagName("eng");	//xml 파일에서 eng 의 값을 가져와서 입력한다.
		NodeList k37_tag_mat = k37_doc.getElementsByTagName("mat");	//xml 파일에서 mat 의 값을 가져와서 입력한다.
		
		System.out.println("******************************************");
		
		for(int i = 0; i < k37_tag_name.getLength(); i++) {	// 인원수 만큼 돌리는 for문 작성
			System.out.printf("이름 : %s\n",k37_tag_name.item(i).getFirstChild().getNodeValue());	// i번째 학생의 이름을 가져온다.
			System.out.printf("학번 : %s\n",k37_tag_studentid.item(i).getFirstChild().getNodeValue());	// i번째 학생의 학번을 가져온다.
			System.out.printf("국어 : %s\n", k37_tag_kor.item(i).getFirstChild().getNodeValue());	// i번째 학생의 국어성적을 가져온다.
			System.out.printf("영어 : %s\n", k37_tag_eng.item(i).getFirstChild().getNodeValue());	// i번째 학생의 영어성적을 가져온다.
			System.out.printf("수학 : %s\n", k37_tag_mat.item(i).getFirstChild().getNodeValue());	// i번째 학생의 수학성적을 가져온다.
			System.out.println("******************************************");
			
		}
		
	}

}

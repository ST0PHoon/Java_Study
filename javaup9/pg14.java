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
		// pg14 기상청
		// 문자열 변수 선언
		String k37_seq="";	// 48시간중 몇번째 인지 가르킴
		String k37_hour="";	// 동네예보 3시간 단위
		String k37_day="";	//1번째날 (0: 오늘/1: 내일/2: 모레)
		String k37_temp="";	// 현재 시간온도
		String k37_tmx="";	 // 최고 온도
		String k37_tmn="";	// 최저 온도
		String k37_sky="";	//하늘 상태코드 (1: 맑음, 2: 구름조금, 3 : 구름많음, 4: 흐림) 
		String k37_pty="";	 //강수 상태코드 (0: 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈
		String k37_wfKor="";	//날씨 한국어
		String k37_wfEn=""; 	 //날씨 영어
		String k37_pop="";	// 강수 확률 %
		String k37_r12="";	 //12시간 예상 강수량
		String k37_s12="";	 //12시간 예상 적설량
		String k37_ws="";	 // 풍속(m/s)
		String k37_wd="";	 //풍향 (0~7: 북, 북동, 동, 남동, 남, 남서, 서, 북서)
		String k37_wdKor="";	// 풍향 한국어
		String k37_wdEn="";	// 풍향 영어
		String k37_reh="";	//습도%
		String k37_r06="";	 //6시간 예상 강수량
		String k37_s06="";	//6시간 예상 적설량

		// 파씽을 위한 준비, DocumentBuilder선언
		DocumentBuilder k37_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml 파일을 처리, PC안에 있어서 전체경로를 지정, xml 파싱처리 
		Document k37_doc = k37_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\ch9\\queryDFS.xml"));
		// root테그를 가지고 오기도 하지만 지금 코드에선 쓰지 않는다.
		Element k37_root = k37_doc.getDocumentElement();
		// NodeList 선언, data 태그를 가져온다.
		NodeList k37_tag_001 = k37_doc.getElementsByTagName("data");
		// 태그의 길이만큼 도는 for문 작성, data의 모든 성분을 만나고온다.
		for (int k37_i = 0; k37_i < k37_tag_001.getLength(); k37_i++) {
			// k37_tag_001의 i번째 성분을 가져온다.
			Element k37_elmt=(Element) k37_tag_001.item(k37_i);
			// xml에서 i번쨰 seq를 가져와 선언한다.
			k37_seq = k37_tag_001.item(k37_i).getAttributes().getNamedItem("seq").getNodeValue();
			// xml의 1번째 seq 성분을 테드 별로 해당하는 부분을 가져와 위에서 선언한 string 변수에 넣어준다.			
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
			
			// 메세지 출력 구간
			System.out.println(k37_seq +"번째 자료 ************************************************");
			System.out.println("동네예보 3시간 단위");
			System.out.println("시간               : " + k37_hour);
			System.out.println("날짜 정보(0: 오늘/1: 내일/2: 모레)");
			System.out.println("날짜               : " + k37_day);
			System.out.println("현재 온도          : " + k37_temp);
			System.out.println("최고 온도          : " + k37_tmx);
			System.out.println("최저 온도          : " + k37_tmn);
			System.out.println("하늘 상태코드 (1: 맑음, 2: 구름조금, 3 : 구름많음, 4: 흐림)");
			System.out.println("하늘 상태          : " + k37_sky);
			System.out.println("강수 상태코드 (0: 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈)");	
			System.out.println("강수 상태          : " + k37_pty);
			System.out.println("날씨 한국어        : " + k37_wfKor);
			System.out.println("날씨 영어          : " + k37_wfEn);
			System.out.println("강수확률           : " + k37_pop +"%");
			System.out.println("12시간 예상 강수량 : " +k37_r12);
			System.out.println("12시간 예상 적설량 : " + k37_s12);
			System.out.println("풍속               : " + k37_ws + "(m/s)");
			System.out.println("풍향 (0~7: 북, 북동, 동, 남동, 남, 남서, 서, 북서)");	
			System.out.println("풍향               : " + k37_wd );
			System.out.println("풍향 한국어        : " + k37_wdKor);
			System.out.println("풍향 영어          : " + k37_wdEn);
			System.out.println("습도               : " + k37_reh +"%");
			System.out.println("6시간 예상 강수량  : " + k37_r06);
			System.out.println("6시간 예상 적설량  : " +k37_s06);
			System.out.println("************************************************************");
		}
		
		System.out.println("");


	}

}

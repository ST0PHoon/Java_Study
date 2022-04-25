package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.io.IOException;
import java.io.InputStreamReader;

import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;
import org.snu.ids.kkma.ma.MExpression;
import org.snu.ids.kkma.ma.MorphemeAnalyzer;
import org.snu.ids.kkma.ma.Sentence;
import org.snu.ids.kkma.util.Timer;


public class kkma {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream input=new FileInputStream("C:\\Users\\kopo\\Desktop\\list.txt");
        InputStreamReader reader=new InputStreamReader(input,"UTF-8");
        BufferedReader readers =new BufferedReader(reader);
		
		
		String str;
		
		while ((str = readers.readLine()) != null) {
			
			maTest(str);
		}
		
		reader.close();
	}
	
	

	public static void maTest(String str) {
		String string = str;
		try {
			MorphemeAnalyzer ma = new MorphemeAnalyzer();
			ma.createLogger(null);
			Timer timer = new Timer();
			timer.start();
			List<MExpression> ret = ma.analyze(string);
			timer.stop();
			timer.printMsg("Time");

			ret = ma.postProcess(ret);

			ret = ma.leaveJustBest(ret);

			List<Sentence> stl = ma.divideToSentences(ret);
			for( int i = 0; i < stl.size(); i++ ) {
				Sentence st = stl.get(i);
				System.out.println("=============================================  " + st.getSentence());
				for( int j = 0; j < st.size(); j++ ) {
					System.out.println(st.get(j));
				}
			}

//			ma.closeLogger();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void keTest() {
		String strToExtrtKwrd = "나는 학교에 간다";
		KeywordExtractor ke = new KeywordExtractor();
		KeywordList kl = ke.extractKeyword(strToExtrtKwrd, true);
		for( int i = 0; i < kl.size(); i++ ) {
			Keyword kwrd = kl.get(i);
			System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());
		}
	}
}
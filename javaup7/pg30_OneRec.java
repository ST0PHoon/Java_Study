package javajump7;

public class pg30_OneRec {
	
	public static void main(String[] args) {
		// pg30 클래스의 ArrayList
		k37_dataSet();
		k37_HeaderPrint();
		for(int k37_i = 0; k37_i < k37_inData.length; k37_i++) {
			k37_ItemPrint(k37_i);
		}
		k37_TailPrint();
	}
	
	
	private int k37_studentId;
	private String k37_name;
	private int k37_kor;
	private int k37_eng;
	private int k37_mat;
	static pg30_OneRec [] k37_inData;
	
	
	public pg30_OneRec(int studentId, String name, int kor, int eng, int mat) {
		this.k37_studentId = studentId;
		this.k37_name = name;
		this.k37_kor = kor;
		this.k37_eng = eng;
		this.k37_mat = mat;
	}
	
	public int k37_getStudentId() {return this.k37_studentId;};
	public String k37_getName() {return this.k37_name;};
	public int k37_getKor() {return this.k37_kor;};
	public int k37_getEng() {return this.k37_eng;};
	public int k37_getMat() {return this.k37_mat;};
	public int k37_getSum() {return this.k37_kor + this.k37_eng + this.k37_mat;};
	public double k37_getAve() {return this.k37_getSum() / 3.0;};

	
	public static void k37_dataSet() {
		int k37_iPerson = 5;	//인원수 정수형으로 입력 10명
		
		k37_inData = new pg30_OneRec[k37_iPerson];
		
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			int k37_studentId = 20221200 + k37_i;
			String k37_name = String.format("정지%02d", k37_i);	//문자열 이름생성 (정지 + 넘버링 형태)
			//랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
			int k37_kor = (int)(Math.random() * 100);	// 국어점수 만들기, double > int 형으로 형변환
			int k37_eng = (int)(Math.random() * 100);	// 영어점수 만들기, double > int 형으로 형변환
			int k37_mat = (int)(Math.random() * 100);	// 수학점수 만들기, double > int 형으로 형변환
			// 위에서 생성한 값들을 받는 다른 클래스의 메소드로 보냄
			k37_inData[k37_i] = new pg30_OneRec(k37_studentId,k37_name,k37_kor,k37_eng,k37_mat);
		}
	}
	
	public static void k37_HeaderPrint() {
		System.out.println("*********************************************************");
		System.out.println("번호       이름     국어 영어 수학  총점    평균");
	}
	
	public static void k37_ItemPrint(int k37_i) {
		System.out.printf("%d   %s    %2d   %2d   %2d    %3d    %.2f\n", k37_inData[k37_i].k37_getStudentId(),
				k37_inData[k37_i].k37_getName(), k37_inData[k37_i].k37_getKor(),k37_inData[k37_i].k37_getEng(),
				k37_inData[k37_i].k37_getMat(),k37_inData[k37_i].k37_getSum(), k37_inData[k37_i].k37_getAve());

	}
	
	public static void k37_TailPrint() {
		System.out.println("*********************************************************");
	}
}
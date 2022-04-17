package javajump7;

public class pg26_OneRec {
	// pg 26
	
	private String k37_name;
	private int k37_kor;
	private int k37_eng;
	private int k37_mat;
	
	public pg26_OneRec(String name, int kor, int eng, int mat) {
		this.k37_name = name;
		this.k37_kor = kor;
		this.k37_eng = eng;
		this.k37_mat = mat;
	}
	
	public String k37_getName() {return this.k37_name;};
	public int k37_getKor() {return this.k37_kor;};
	public int k37_getEng() {return this.k37_eng;};
	public int k37_getMat() {return this.k37_mat;};
	public int k37_getSum() {return this.k37_kor + this.k37_eng + this.k37_mat;};
	public double k37_getAve() {return this.k37_getSum() / 3.0;};

}

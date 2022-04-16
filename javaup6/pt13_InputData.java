package javajump6;

public class pt13_InputData {
	int [] k37_i;
	String [] k37_name;
	int [] k37_kor;
	int [] k37_eng;
	int [] k37_mat;
	int [] k37_sum;
	double [] k37_ave;
	
	pt13_InputData(int k37_iPerson) {
		k37_i = new int[k37_iPerson];
		k37_name = new String[k37_iPerson];
		k37_kor = new int[k37_iPerson];
		k37_eng = new int[k37_iPerson];
		k37_mat = new int[k37_iPerson];
		k37_sum = new int[k37_iPerson];
		k37_ave = new double[k37_iPerson];
	}
	
	public void k37_SetDate(int i, String name, int kor, int eng, int mat) {
		k37_i[i] = i;
		k37_name[i] = name;
		k37_kor[i] = kor;
		k37_eng[i] = eng;
		k37_mat[i] = mat;
		k37_sum[i] = kor + eng + mat;
		k37_ave[i] = k37_sum[i] / 3.0;
		
	}
}

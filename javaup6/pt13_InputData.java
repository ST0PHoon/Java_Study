package javajump6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class pt13_InputData {
	int k37_Person;
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
		k37_Person = k37_iPerson;
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
	
	public int k37_subjectSum(int[] k37_intArr) {
		int k37_sum = 0;
		for (int k37_i = 0; k37_i < k37_intArr.length; k37_i++) {
			k37_sum += k37_intArr[k37_i];
		}
		return k37_sum;
	}
	
	public double k37_aveSum(double[] k37_doubleArr) {
		double k37_sum = 0;
		for (int k37_i = 0; k37_i < k37_doubleArr.length; k37_i++) {
			k37_sum += k37_doubleArr[k37_i];
		}
		return k37_sum;
	}
	
	public double k37_subjectAve(int[] k37_intArr) {
		int k37_sum = 0;
		for (int k37_i = 0; k37_i < k37_intArr.length; k37_i++) {
			k37_sum += k37_intArr[k37_i];
		}
		return ((double) k37_sum) / k37_Person;
	}
	
	public double k37_aveAve(double[] k37_doubleArr) {
		double k37_sum = 0;
		for (int k37_i = 0; k37_i < k37_doubleArr.length; k37_i++) {
			k37_sum += k37_doubleArr[k37_i];
		}
		return k37_sum / k37_Person;
	}
	
	public String k37_printDate() {
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		
		Date time = new Date();
				
		String time1 = format1.format(time);
		
		return time1;
	}
}

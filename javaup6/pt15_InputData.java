package javajump6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class pt15_InputData {
	int k37_totalPerson;
	int k37_pgPerson;
	int [] k37_i;
	String [] k37_name;
	int [] k37_kor;
	int [] k37_eng;
	int [] k37_mat;
	int [] k37_sum;
	double [] k37_ave;
	int[] k37_personGroupArray;
	
	pt15_InputData(int k37_iPerson, int k37_onepagePerson) {
		k37_totalPerson = k37_iPerson;
		k37_pgPerson = k37_onepagePerson;
		k37_i = new int[k37_iPerson];
		k37_name = new String[k37_iPerson];
		k37_kor = new int[k37_iPerson];
		k37_eng = new int[k37_iPerson];
		k37_mat = new int[k37_iPerson];
		k37_sum = new int[k37_iPerson];
		k37_ave = new double[k37_iPerson];
		k37_personGroupArray = new int[(k37_iPerson / k37_onepagePerson) + 1];
	}
	
	public String k37_printDate() {
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		
		Date time = new Date();
				
		String time1 = format1.format(time);
		
		return time1;
	}
	
	public int[] k37_perPagePerson() {
		for (int k37_i = 0; k37_i < k37_personGroupArray.length ; k37_i++) {
			if (k37_i == k37_personGroupArray.length - 1 ) {
				k37_personGroupArray[k37_i] = k37_totalPerson % k37_pgPerson;
			} else {
				k37_personGroupArray[k37_i] = k37_pgPerson;
			}
		}
		return k37_personGroupArray;
	}
	
	public int k37_currentStartNumber(int k37_ii) {
		int k37_startNum = 0;
		for (int k37_i = 0; k37_i < k37_ii; k37_i++) {
			k37_startNum += k37_personGroupArray[k37_i];
		}
		return k37_startNum;
	}
	
	public void k37_SetDate(int i, String name, int kor, int eng, int mat) {
		k37_i[i - 1] = i;
		k37_name[i - 1] = name;
		k37_kor[i - 1] = kor;
		k37_eng[i - 1] = eng;
		k37_mat[i - 1] = mat;
		k37_sum[i - 1] = kor + eng + mat;
		k37_ave[i - 1] = k37_sum[i - 1] / 3.0;
	}
	
	public int k37_curSubjectSum(int k37_cycNumber, int[] k37_array) {
		int k37_sum = 0, k37_startNum = 0;
		
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			k37_startNum += k37_personGroupArray[k37_i];
		}
		
		k37_startNum -= k37_personGroupArray[k37_cycNumber];
		
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;
	}
	
	public double k37_curAveSum(int k37_cycNumber, double[] k37_array) {
		double k37_sum = 0;
		int k37_startNum = 0;
		
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			k37_startNum += k37_personGroupArray[k37_i];
		}
		
		k37_startNum -= k37_personGroupArray[k37_cycNumber];
		
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;
	}
	
	public double k37_cursubjectAve(int k37_cycNumber, int[] k37_array) {
		int k37_sum = 0, k37_startNum = 0;
		
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			k37_startNum += k37_personGroupArray[k37_i];
		}
		
		k37_startNum -= k37_personGroupArray[k37_cycNumber];
		
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			k37_sum += k37_array[k37_i];
		}
		return ((double) k37_sum) /  k37_personGroupArray[k37_cycNumber];
	}
	
	public double k37_curaveAve(int k37_cycNumber, double[] k37_array) {
		double k37_sum = 0;
		int k37_startNum = 0;
		
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			k37_startNum += k37_personGroupArray[k37_i];
		}
		
		k37_startNum -= k37_personGroupArray[k37_cycNumber];
		
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			k37_sum += k37_array[k37_i];
		}
		return k37_sum /  k37_personGroupArray[k37_cycNumber];
	}
	
	public int k37_totalSubjectSum(int k37_cycNumber, int[] k37_array) {
		int k37_sum = 0, k37_endNum = 0;
		
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			k37_endNum += k37_personGroupArray[k37_i];
		}
		
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;
	}
	
	public double k37_totalAveSum(int k37_cycNumber, double[] k37_array) {
		double k37_sum = 0;
		int k37_endNum = 0;
		
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			k37_endNum += k37_personGroupArray[k37_i];
		}
		
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;
	}
	
	public double k37_totalsubjectAve(int k37_cycNumber, int[] k37_array) {
		int k37_sum = 0, k37_endNum = 0;
		
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			k37_endNum += k37_personGroupArray[k37_i];
		}
		
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			k37_sum += k37_array[k37_i];
		}
		return ((double) k37_sum) /  k37_personGroupArray[k37_cycNumber];
	}
	
	public double k37_totalaveAve(int k37_cycNumber, double[] k37_array) {
		double k37_sum = 0;
		int k37_endNum = 0;
		
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			k37_endNum += k37_personGroupArray[k37_i];
		}
		
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			k37_sum += k37_array[k37_i];
		}
		return k37_sum /  k37_personGroupArray[k37_cycNumber];
	}
	

}
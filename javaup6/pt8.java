package javajump6;

public class pt8 {

	public static void main(String[] args) {
		// 11pg �޼ҵ� �����ε�
		// ��, ��� ����ϴ� Ŭ���� ����
		pt8_calAvg k37_avg = new pt8_calAvg();
		
		//�⺻ ���� ���� �Է�, �� ��, ����� �Է��� ������, �Ǽ��� ���� ���� ����
		int k37_Korean = 80, k37_English = 90, k37_Math = 100,
			k37_Science = 100, k37_Society = 70,  k37_Sum = 0;
		double k37_Avg= 0.0;
		
		// 3���� ������ �޾Ƽ� ��հ� ���� ���ϴ� �ٸ� Ŭ������ �޼ҵ� ����, ���� double���� int�� / ���� ���信 ���缭 �޼��� ���
		k37_Avg = k37_avg.k37_sumAvg(k37_Math, k37_English, k37_Korean);
		k37_Sum = k37_avg.k37_sum(k37_Math, k37_English, k37_Korean);
		
		System.out.println("3�� ����ǥ");
		System.out.printf("=============================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","�̸�","����","����","����","����","���");
		System.out.printf("=============================\n");
		System.out.printf("%-4.4s%-4d%-4d %-4d %-4d %-4.1f\n\n","������",k37_Korean,k37_English,k37_Math,k37_Sum,k37_Avg);
		
		// 4���� ������ �޾Ƽ� ��հ� ���� ���ϴ� �ٸ� Ŭ������ �޼ҵ� ����, ���� double���� int�� / ���� ���信 ���缭 �޼��� ���
		k37_Avg = k37_avg.k37_sumAvg(k37_Math, k37_English, k37_Korean, k37_Science);
		k37_Sum = k37_avg.k37_sum(k37_Math, k37_English, k37_Korean, k37_Science);
		
		System.out.println("4�� ����ǥ");
		System.out.printf("=================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","�̸�","����","����","����","����","����","���");
		System.out.printf("=================================\n");
		System.out.printf("%-4.4s%-4d%-4d %-4d %-4d %-4d%-4.1f\n\n","������",k37_Korean,k37_English,k37_Math,k37_Science,k37_Sum,k37_Avg);
		
		// 5���� ������ �޾Ƽ� ��հ� ���� ���ϴ� �ٸ� Ŭ������ �޼ҵ� ����, ���� double���� int�� / ���� ���信 ���缭 �޼��� ���
		k37_Avg = k37_avg.k37_sumAvg(k37_Math, k37_English, k37_Korean, k37_Science, k37_Society);
		k37_Sum = k37_avg.k37_sum(k37_Math, k37_English, k37_Korean, k37_Science, k37_Society);
		
		System.out.println("5�� ����ǥ");
		System.out.printf("=====================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","�̸�","����","����","����","����","��ȸ","����","���");
		System.out.printf("=====================================\n");
		System.out.printf("%-4.4s%-4d%-4d %-4d %-4d %-4d %-4d%-4.1f\n\n","������",k37_Korean,k37_English,k37_Math,k37_Sum,k37_Science,k37_Society,k37_Avg);
	}

}

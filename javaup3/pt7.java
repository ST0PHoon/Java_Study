package bills;

public class pt7 {

	public static void main(String[] args) {
		int k37_price = 1234; // k37_price ������ ���� ����
		double k37_taxRate = 0.1; // k37_taxRate �Ǽ��� ���� ����
		
		int k37_netprice = netprice(k37_price, k37_taxRate); // k37_netprice ������ ���� ����, �Լ� ���ϰ� �Է�
		int k37_tax = k37_price - k37_netprice;  // k37_tax ������ ���� ����, price - netprice ���
		
		System.out.printf("********************************************\n");
		System.out.printf("*       �Һ��ڰ�, ��������, ���� ���      *\n");
		// ���Ŀ� ���缭 price, netprice, tax ���Ŀ� ���缭 ���
		System.out.printf(" �Һ��ڰ���: %d, ��������: %d, ����: %d\n", k37_price, k37_netprice, k37_tax); 
		System.out.printf("*********************************************\n");

	}

	//netprice �޼ҵ� ���� �� �޾ƿ��� ����,�Ǽ� ���� �� �������·� ����
	public static int netprice(int k37_price, double k37_rate) {
		return (int)(k37_price/(1+k37_rate));	//�������� ����� ���������� ����
	}

}

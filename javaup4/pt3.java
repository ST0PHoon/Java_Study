package ifforwhile;

public class pt3 {

	public static void main(String[] args) {
		// 5pg switch / case ��
		String k37_jumin = "123456-1234567";	//�ֹε�Ϲ�ȣ ���ڿ��� �޾ƿ���
	      switch (k37_jumin.charAt(7)) {		//�ֹε�Ϲ�ȣ�� ���ڸ� 1��° ���ڸ� �����ɴϴ�. (charAt�� ���� char������ ����ġ�� ���ڸ� �����ɴϴ�.)
	      case '1':								// 1�̸� 2000�� �� ����� ����. case������ char���̸� ''�ȿ� �ִ´�
	         System.out.printf("20������ �¾ ���� ���\n");	//break;�� ������ �������ʰ� �Ʒ�case�� �����Ѵ�.
	      case '2':								// 2�̸� 2000�� �� ����� ����
	         System.out.printf("20������ �¾ ���� ���\n");
	         break;		//break; �� ������ �� �ڵ带 �����ϰ� switch���� ���� �����ϴ�.
	      case '3':		// 3�̸� 2000�� ���� ��� ����
	         System.out.printf("20������ �¾ ���� ���\n");
	         break;
	      case '4':		// 4�̸� 2000�� ���� ��� ����
	         System.out.printf("20������ �¾ ���� ���\n");
	         break;
	      default:		// �� ���̽� �̿��� ��쿡�� ������� �޼����� ����մϴ�.
	         System.out.printf("���");
	         break;
	      }
	}

}

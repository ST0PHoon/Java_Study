package hello;

import java.util.Scanner; //�⺻������ import �� �ʿ�

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scanner ��ü
		
		String name, address;
		int age;
		float weight;
		
		name = scan.next(); // ���ڿ� : scan.next
		age = scan.nextInt(); //int : scan.nextInt
		weight = scan.nextFloat(); //float : scan.nextFloat
		
		/* �̿ܿ���
		 * byte, short, long, double ���� �ִ�.
		 * 
		 * String�� �޴� �Ϳ��� scan.next���� scan.nextLine�� �ִµ�
		 * �̴� �ٹٲ��� �߰��� ��ɾ��.
		 * 
		 * boolean�� scan.hasNext()�� ����Ѵ�. ctrl+z�� �Է��� ���� �� �ִ�.
		 * 
		 * void close()�ε� scan�� ������ �� �ִ�.
		 */
	}
	
}

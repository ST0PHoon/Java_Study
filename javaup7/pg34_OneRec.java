package javajump7;

public class pg34_OneRec {
	// pg33 Ŭ������ ArrayList
	private int k37_studentId;		//������ ���� �й� ����
	private String k37_name;	//���ڿ� ���� �̸� ����
	private int k37_kor;	//������ ���� ���� ����
	private int k37_eng;	//������ ���� ���� ����
	private int k37_mat;	//������ ���� ���� ����

	public pg34_OneRec(int studentId, String name, int kor, int eng, int mat) {	//������ ����� ���� 4��(�̸�, ����,����,����)
			this.k37_studentId = studentId;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
			this.k37_name = name;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
			this.k37_kor = kor;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
			this.k37_eng = eng;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
			this.k37_mat = mat;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
	}
	
	public int k37_getStudentId() {return this.k37_studentId;};	//�Է��� �й��� �����ϴ� �޼ҵ� ����
	public String k37_getName() {return this.k37_name;};	//�Է��� �̸��� �����ϴ� �޼ҵ� ����
	public int k37_getKor() {return this.k37_kor;};	//�Է��� ������� �����ϴ� �޼ҵ� ����
	public int k37_getEng() {return this.k37_eng;};	//�Է��� ������� �����ϴ� �޼ҵ� ����
	public int k37_getMat() {return this.k37_mat;};	//�Է��� ���м����� �����ϴ� �޼ҵ� ����
	public int k37_getSum() {return this.k37_kor + this.k37_eng + this.k37_mat;};	//�Է��� ������ �հ踦 �����ϴ� �޼ҵ� ����
	public double k37_getAve() {return this.k37_getSum() / 3.0;};	// �Է��� ������ ����� ����Ͽ� �����ϴ� �޼ҵ� ����
	
}
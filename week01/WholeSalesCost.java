public class WholeSalesCost {
	public static void main(String[] args) {
		double CP = 24.95; //����
		double DR = 0.4;   //������
		double ISC = 3.0;  //���� ��۷�
		double ASC = 0.75; //�߰� ��۷� (�Ǵ�)
		int q = 60;        //�ֹ� ���� (��)
		
		double BC = CP*(1.0-DR)*q;     //å��
		double SC = ISC + (q - 1)*ASC; //��۷�
		double tot = BC+SC;            //�� ����
		
		System.out.println("�� ���� ������ " + tot + "�Դϴ�.");
		System.out.printf("�� ���� ������ %.2f�Դϴ�.",tot);
	}
}
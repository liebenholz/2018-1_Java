package w12_2277;

import java.util.Scanner;

/**
 * ������ �׽�Ʈ�ϴ� ���α׷�.
 * @author ������
 *
 */
public class RemoconTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		Remocon remote = new Remocon();
		int command = 1;

		while (command != 0) {

			remote.display();
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			command = input.nextInt();

			switch(command) {
			case 1:
				remote.volumeUp(); break;
			case 2:
				remote.volumeDown(); break;
			case 3:
				remote.channelUp(); break;
			case 4:
				remote.channelDown(); break;
			case 0:
				System.out.println("�ý����� �����մϴ�."); break;
			default:
				System.out.println("�߸� �Է��ϰ���ϴ�."); break;
			}
			System.out.println();

		}

		input.close();
	}

}

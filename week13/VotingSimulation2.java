package w13_2277;

import java.util.Random;

/**
 * VotingMachine2 �ùķ��̼�
 * @author ������
 */
public class VotingSimulation2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		VotingMachine2 voteMachine = new VotingMachine2();
		
		for(int i=0; i<1000; i++) {
			if(rand.nextBoolean()) {
				voteMachine.vote("������");
			}
			else {
				voteMachine.vote("����");
			}
		}
		System.out.println("���� ��ǥ�� : " + voteMachine.getVotes("����"));
		System.out.println("������ ��ǥ�� : " + voteMachine.getVotes("������"));
	}

}


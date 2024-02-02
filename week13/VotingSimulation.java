package w13_2277;

import java.util.Random;

/**
 * VotingMachine �ùķ��̼�
 * @author ������
 */
public class VotingSimulation {

	public static void main(String[] args) {

		Random rand = new Random();
		VotingMachine voteMachine = new VotingMachine();

		for(int i=0; i<1000; i++) {
			if(rand.nextBoolean()) {
				voteMachine.voteForDuk();	//������
			}
			else {
				voteMachine.voteForSun();	//����
			}
		}

		System.out.println("���� ��ǥ�� : " + voteMachine.getSunVotes());
		System.out.println("������ ��ǥ�� : " + voteMachine.getDukVotes());
	}

}


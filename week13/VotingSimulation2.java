package w13_2277;

import java.util.Random;

/**
 * VotingMachine2 ½Ã¹Ä·¹ÀÌ¼Ç
 * @author Á¶¼ºÇõ
 */
public class VotingSimulation2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		VotingMachine2 voteMachine = new VotingMachine2();
		
		for(int i=0; i<1000; i++) {
			if(rand.nextBoolean()) {
				voteMachine.vote("¶±ººÀÌ");
			}
			else {
				voteMachine.vote("¼ø´ë");
			}
		}
		System.out.println("¼ø´ë µæÇ¥¼ö : " + voteMachine.getVotes("¼ø´ë"));
		System.out.println("¶±ººÀÌ µæÇ¥¼ö : " + voteMachine.getVotes("¶±ººÀÌ"));
	}

}


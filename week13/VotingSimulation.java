package w13_2277;

import java.util.Random;

/**
 * VotingMachine ½Ã¹Ä·¹ÀÌ¼Ç
 * @author Á¶¼ºÇõ
 */
public class VotingSimulation {

	public static void main(String[] args) {

		Random rand = new Random();
		VotingMachine voteMachine = new VotingMachine();

		for(int i=0; i<1000; i++) {
			if(rand.nextBoolean()) {
				voteMachine.voteForDuk();	//¶±ººÀÌ
			}
			else {
				voteMachine.voteForSun();	//¼ø´ë
			}
		}

		System.out.println("¼ø´ë µæÇ¥¼ö : " + voteMachine.getSunVotes());
		System.out.println("¶±ººÀÌ µæÇ¥¼ö : " + voteMachine.getDukVotes());
	}

}


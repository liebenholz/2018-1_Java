package w13_2277;

/**
 * 떡볶이 또는 순대 투표 프로그램
 * @author 조성혁
 */
public class VotingMachine {

	private int dukVotes;	//떡볶이 투표수
	private int sunVotes;	//순대 투표수

	/**
	 * 떡볶이에 투표
	 */
	public void voteForDuk() {
		dukVotes++;
	}

	/**
	 * 순대에 투표
	 */
	public void voteForSun() {
		sunVotes++;
	}

	/**
	 * 득표 수 리셋
	 */
	public void clear() {
		dukVotes = 0;
		sunVotes = 0;
	}

	/**
	 * 떡볶이 득표 수 출력
	 * @return 떡볶이 득표수
	 */
	public int getDukVotes() {
		return dukVotes;
	}

	/**
	 * 순대 득표 수 출력
	 * @return 순대 득표수
	 */
	public int getSunVotes() {
		return sunVotes;
	}

}

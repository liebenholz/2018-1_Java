package w13_2277;

public class VotingMachine2 {

	private int dukVotes;	//떡볶이 투표
	private int sunVotes;	//순대 투표

	/**
	 * pick에 투표
	 * @param pick 투표 대상.
	 * 		  (pick은 떡볶이 혹은 순대.)
	 * 		  (둘다 아닐 경우에는 아무 일도 하지 않음.)
	 */
	public void vote(String pick) {
		if(pick.equals("떡볶이")) {
			this.dukVotes++;
		}
		else if(pick.equals("순대")) {
			this.sunVotes++;
		}
	}

	/**
	 * 득표 수 리셋
	 */
	public void clear() {
		dukVotes = 0;
		sunVotes = 0;
	}

	/**
	 * pick의 득표수를 반환
	 * @param 득표수를 반환할 대상
	 * @return 떡볶이의 득표수 혹은 순대의 득표수.
	 * 		  (pick은 떡볶이 혹은 순대.)
	 * 		  (둘다 아닐 경우에는 0을 반환.)
	 */
	public int getVotes(String pick) {
		if(pick.equals("떡볶이")) {
			return this.dukVotes;
		}
		else if(pick.equals("순대")) {
			return this.sunVotes;
		}
		else {
			return 0;
		}
	}
}


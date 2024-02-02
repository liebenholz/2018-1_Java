package w13_2277;

public class VotingMachine2 {

	private int dukVotes;	//������ ��ǥ
	private int sunVotes;	//���� ��ǥ

	/**
	 * pick�� ��ǥ
	 * @param pick ��ǥ ���.
	 * 		  (pick�� ������ Ȥ�� ����.)
	 * 		  (�Ѵ� �ƴ� ��쿡�� �ƹ� �ϵ� ���� ����.)
	 */
	public void vote(String pick) {
		if(pick.equals("������")) {
			this.dukVotes++;
		}
		else if(pick.equals("����")) {
			this.sunVotes++;
		}
	}

	/**
	 * ��ǥ �� ����
	 */
	public void clear() {
		dukVotes = 0;
		sunVotes = 0;
	}

	/**
	 * pick�� ��ǥ���� ��ȯ
	 * @param ��ǥ���� ��ȯ�� ���
	 * @return �������� ��ǥ�� Ȥ�� ������ ��ǥ��.
	 * 		  (pick�� ������ Ȥ�� ����.)
	 * 		  (�Ѵ� �ƴ� ��쿡�� 0�� ��ȯ.)
	 */
	public int getVotes(String pick) {
		if(pick.equals("������")) {
			return this.dukVotes;
		}
		else if(pick.equals("����")) {
			return this.sunVotes;
		}
		else {
			return 0;
		}
	}
}


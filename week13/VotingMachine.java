package w13_2277;

/**
 * ������ �Ǵ� ���� ��ǥ ���α׷�
 * @author ������
 */
public class VotingMachine {

	private int dukVotes;	//������ ��ǥ��
	private int sunVotes;	//���� ��ǥ��

	/**
	 * �����̿� ��ǥ
	 */
	public void voteForDuk() {
		dukVotes++;
	}

	/**
	 * ���뿡 ��ǥ
	 */
	public void voteForSun() {
		sunVotes++;
	}

	/**
	 * ��ǥ �� ����
	 */
	public void clear() {
		dukVotes = 0;
		sunVotes = 0;
	}

	/**
	 * ������ ��ǥ �� ���
	 * @return ������ ��ǥ��
	 */
	public int getDukVotes() {
		return dukVotes;
	}

	/**
	 * ���� ��ǥ �� ���
	 * @return ���� ��ǥ��
	 */
	public int getSunVotes() {
		return sunVotes;
	}

}

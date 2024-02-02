package w12_2277;

public class Remocon {

	//�ʵ�
	private int volume = 0;
	private int channel = 0;
	public final static int MAX_VOLUME = 3;
	public final static int MAX_CHANNEL = 3; 

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * �ִ뺼������ ������ ���� +1
	 */
	public void volumeUp() {
		if (volume < MAX_VOLUME)
			volume++;
	}

	/**
	 * ������ 0���� ũ�� ���� -1
	 */
	public void volumeDown() {
		if (volume > 0)
			volume--;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	/**
	 * 1ä�� �ø���. �ִ� ä���̸� 0������
	 */
	public void channelUp() {
		if (channel == 3)
			channel = 0;
		else
			channel++;
	}

	/**
	 * 1ä�� ������. 0�� ä���̸� �ִ� ä�η�
	 */
	public void channelDown() {
		if (channel == 0)
			channel = 3;
		else
			channel--;
	}

	/**
	 * ���� ������ ä��, �׸��� ��� ��ư�� �����ش�.
	 */
	public void display() {
		System.out.println("Volume = " + getVolume());
		System.out.println("Channel = " + getChannel());
		System.out.println();

		System.out.println("1: volume up.");
		System.out.println("2: volume down.");
		System.out.println("3: channel up.");
		System.out.println("4: channel down.");
		System.out.println("0: end.");

	}
}

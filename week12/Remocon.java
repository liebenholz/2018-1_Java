package w12_2277;

public class Remocon {

	//필드
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
	 * 최대볼륨보다 작으면 볼륨 +1
	 */
	public void volumeUp() {
		if (volume < MAX_VOLUME)
			volume++;
	}

	/**
	 * 볼륨이 0보다 크면 볼륨 -1
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
	 * 1채널 올리기. 최대 채널이면 0번으로
	 */
	public void channelUp() {
		if (channel == 3)
			channel = 0;
		else
			channel++;
	}

	/**
	 * 1채널 내리기. 0번 채널이면 최대 채널로
	 */
	public void channelDown() {
		if (channel == 0)
			channel = 3;
		else
			channel--;
	}

	/**
	 * 현재 볼륨과 채널, 그리고 명령 버튼을 보여준다.
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

package cn.com.pera.commond.receiver;

public class Stereo {
	private int volume;
	private String cd;

	public void steroOn() {
		System.out.println("Stereo is singing,volume:" + this.volume + ",cd:"
				+ this.cd);
	}

	public void steroOff() {
		System.out.println("Stereo is off");
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

}

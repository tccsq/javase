package cn.com.pera.commond.impl;

import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.receiver.Stereo;

public class StereoOffCommond implements Commond {
	private Stereo stereo;

	public StereoOffCommond(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.steroOff();
	}

	@Override
	public void undo() {
		stereo.setCd("天黑黑");
		stereo.setVolume(11);
		stereo.steroOn();
	}

}

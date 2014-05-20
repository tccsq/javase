package cn.com.pera.commond.impl;

import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.receiver.Stereo;

public class StereoOnCommond implements Commond {
	private Stereo stereo;

	public StereoOnCommond(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.setCd("天黑黑");
		stereo.setVolume(11);
		stereo.steroOn();
	}

	@Override
	public void undo() {
		stereo.steroOff();
	}

}

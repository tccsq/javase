package cn.com.pera.commond.impl;

import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.receiver.Light;

public class LightOffCommond implements Commond {
	private Light ligtht;

	public LightOffCommond(Light ligtht) {
		super();
		this.ligtht = ligtht;
	}

	@Override
	public void execute() {
		ligtht.lightOff();
	}

	@Override
	public void undo() {
		ligtht.lightOn();
	}
}

package cn.com.pera.commond.impl;

import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.receiver.Light;

public class LightOnCommond implements Commond {
	private Light ligtht;

	public LightOnCommond(Light ligtht) {
		super();
		this.ligtht = ligtht;
	}

	@Override
	public void execute() {
		ligtht.lightOn();
	}
}

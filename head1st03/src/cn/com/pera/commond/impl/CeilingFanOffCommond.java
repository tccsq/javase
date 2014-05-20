package cn.com.pera.commond.impl;

import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.receiver.CeilingFan;

public class CeilingFanOffCommond implements Commond {
	private CeilingFan ceilingFan;

	public CeilingFanOffCommond(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.ceilingOff();
	}

	@Override
	public void undo() {
		ceilingFan.ceilingOn();
	}

}

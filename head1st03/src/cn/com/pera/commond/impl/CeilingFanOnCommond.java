package cn.com.pera.commond.impl;

import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.receiver.CeilingFan;

public class CeilingFanOnCommond implements Commond {
	private CeilingFan ceilingFan;
	
	
	public CeilingFanOnCommond(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.ceilingOn();
	}

	@Override
	public void undo() {
		ceilingFan.ceilingOff();
	}
}

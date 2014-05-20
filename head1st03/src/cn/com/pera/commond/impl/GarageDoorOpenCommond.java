package cn.com.pera.commond.impl;

import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.receiver.GarageDoor;

public class GarageDoorOpenCommond implements Commond {
	private GarageDoor garageDoor;

	public GarageDoorOpenCommond(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.openDoor();
	}

	@Override
	public void undo() {
		this.garageDoor.closeDoor();
	}
}

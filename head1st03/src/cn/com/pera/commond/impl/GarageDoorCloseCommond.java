package cn.com.pera.commond.impl;

import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.receiver.GarageDoor;

public class GarageDoorCloseCommond implements Commond {
	private GarageDoor garageDoor;

	public GarageDoorCloseCommond(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.closeDoor();
	}

	@Override
	public void undo() {
		this.garageDoor.openDoor();
	}
}

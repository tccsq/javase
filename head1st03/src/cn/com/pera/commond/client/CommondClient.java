package cn.com.pera.commond.client;

import cn.com.pera.commond.impl.CeilingFanOffCommond;
import cn.com.pera.commond.impl.CeilingFanOnCommond;
import cn.com.pera.commond.impl.GarageDoorCloseCommond;
import cn.com.pera.commond.impl.GarageDoorOpenCommond;
import cn.com.pera.commond.impl.LightOffCommond;
import cn.com.pera.commond.impl.LightOnCommond;
import cn.com.pera.commond.impl.StereoOffCommond;
import cn.com.pera.commond.impl.StereoOnCommond;
import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.invoker.RemoteControl;
import cn.com.pera.commond.invoker.SimpleRemoteControl;
import cn.com.pera.commond.receiver.CeilingFan;
import cn.com.pera.commond.receiver.GarageDoor;
import cn.com.pera.commond.receiver.Light;
import cn.com.pera.commond.receiver.Stereo;

public class CommondClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		controlTest();
	}

	private void SimpleControlTest() {
		Light ligtht = new Light();
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Commond ligthOnCommond = new LightOnCommond(ligtht);
		remoteControl.setCommond(ligthOnCommond);
		remoteControl.buttonPressed();
	}

	private static void controlTest() {
		RemoteControl remoteControl = new RemoteControl();

		// receivers
		Light livingRoomLight = new Light();
		Light kitchenLight = new Light();
		Stereo stereo = new Stereo();
		CeilingFan ceilingFan = new CeilingFan();
		GarageDoor garageDoor = new GarageDoor();
		// commonds
		LightOnCommond livingRoomLightOn = new LightOnCommond(livingRoomLight);
		LightOffCommond livingRoomLightOff = new LightOffCommond(
				livingRoomLight);
		LightOnCommond kitchenLightOn = new LightOnCommond(kitchenLight);
		LightOffCommond kitchenLightOff = new LightOffCommond(kitchenLight);
		StereoOnCommond seteroOn = new StereoOnCommond(stereo);
		StereoOffCommond seteroOff = new StereoOffCommond(stereo);
		CeilingFanOnCommond ceilingFanOn = new CeilingFanOnCommond(ceilingFan);
		CeilingFanOffCommond ceilingFanOff = new CeilingFanOffCommond(
				ceilingFan);
		GarageDoorOpenCommond garageDoorOpen = new GarageDoorOpenCommond(
				garageDoor);
		GarageDoorCloseCommond garageDoorClose = new GarageDoorCloseCommond(
				garageDoor);

		remoteControl.setCommond(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommond(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommond(2, seteroOn, seteroOff);
		remoteControl.setCommond(3, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommond(4, garageDoorOpen, garageDoorClose);

		remoteControl.onButtonPressed(0);
		remoteControl.offButtonPressed(0);
		remoteControl.undoButtonPressed();

		remoteControl.onButtonPressed(1);
		remoteControl.offButtonPressed(1);
		remoteControl.undoButtonPressed();
		
		remoteControl.onButtonPressed(2);
		remoteControl.offButtonPressed(2);

		remoteControl.onButtonPressed(3);
		remoteControl.offButtonPressed(3);
		remoteControl.undoButtonPressed();

		remoteControl.onButtonPressed(4);
		remoteControl.offButtonPressed(4);

	}

}

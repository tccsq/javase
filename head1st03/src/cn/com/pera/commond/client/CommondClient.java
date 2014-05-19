package cn.com.pera.commond.client;

import cn.com.pera.commond.impl.LightOnCommond;
import cn.com.pera.commond.interfaces.Commond;
import cn.com.pera.commond.invoker.SimpleRemoteControl;
import cn.com.pera.commond.receiver.Light;

public class CommondClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Light ligtht = new Light();
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Commond ligthOnCommond = new LightOnCommond(ligtht);
		remoteControl.setCommond(ligthOnCommond);
		remoteControl.buttonPressed();
	}

}

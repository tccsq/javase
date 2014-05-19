package cn.com.pera.commond.invoker;

import cn.com.pera.commond.interfaces.Commond;

public class SimpleRemoteControl {

	private Commond commond;

	public void setCommond(Commond commond) {
		this.commond = commond;
	}

	public void buttonPressed() {
		commond.execute();
	}

}

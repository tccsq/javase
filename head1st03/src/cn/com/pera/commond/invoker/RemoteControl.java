package cn.com.pera.commond.invoker;

import cn.com.pera.commond.impl.NoCommond;
import cn.com.pera.commond.interfaces.Commond;

public class RemoteControl {

	private Commond[] oncommonds;
	private Commond[] offcommonds;
	private Commond undoCommond;

	public RemoteControl() {
		this.oncommonds = new Commond[8];
		this.offcommonds = new Commond[8];
		NoCommond noCommond = new NoCommond();
		this.undoCommond = noCommond;
		for (int i = 0; i < 8; i++) {
			this.offcommonds[i] = noCommond;
			this.oncommonds[i] = noCommond;
		}
	}

	public void setCommond(int slot, Commond onCommond, Commond offCommond) {
		this.offcommonds[slot] = offCommond;
		this.oncommonds[slot] = onCommond;
	}

	public void onButtonPressed(int slot) {
		this.oncommonds[slot].execute();
		undoCommond = this.oncommonds[slot];
	}

	public void offButtonPressed(int slot) {
		this.offcommonds[slot].execute();
		undoCommond = this.offcommonds[slot];
	}

	public void undoButtonPressed() {
		this.undoCommond.undo();
	}

	public void noButtonPressed() {
		for (Commond com : offcommonds) {
			com.execute();
		}
	}

}

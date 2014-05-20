package cn.com.pera.commond.impl;

import cn.com.pera.commond.interfaces.Commond;

public class NoCommond implements Commond {

	@Override
	public void execute() {
		System.out.println("do nothing..........");
	}

	@Override
	public void undo() {
		System.out.println("do nothing..........");
	}

}

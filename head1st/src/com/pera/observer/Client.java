package com.pera.observer;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		DisplayObserver dobs = new DisplayObserver(wd);
		wd.changeStatus(1.2f, 1.3f, 1.4f);
		wd.changeStatus(2.2f, 2.3f, 2.4f);
		wd.changeStatus(3.2f, 3.3f, 3.4f);
	}

}

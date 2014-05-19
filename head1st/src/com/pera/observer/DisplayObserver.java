package com.pera.observer;

import java.util.Observable;
import java.util.Observer;

import com.pera.Displayable;

public class DisplayObserver implements Observer, Displayable {
	private float temperature;
	private float humidity;
	private float pressure;
	private Observable observable;

	public DisplayObserver(Observable observable) {
		super();
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		System.out
				.println("--------------DisplayObserver start----------------");
		System.out.println("ÎÂ¶È£º" + this.temperature);
		System.out.println("ÎÂ¶È£º" + this.humidity);
		System.out.println("ÎÂ¶È£º" + this.pressure);
		System.out.println("--------------DisplayObserver end----------------");
	}

}

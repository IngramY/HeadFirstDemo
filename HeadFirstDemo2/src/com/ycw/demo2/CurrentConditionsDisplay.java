package com.ycw.demo2;

import java.util.Observable;
import java.util.Observer;

import com.ycw.demo2.bean.WeatherData;
import com.ycw.demo2.impl.DisplayElement;

/**
* @ClassName: CurrentConditionsDisplay
* @Description: TODO( Current conditions)
* @author ycw
* @date 2015��10��27�� ����3:33:35
* 
*/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
//	private Subject weatherData;
	Observable observable;//�ɹ۲���
	
//	public CurrentConditionsDisplay(Subject weatherData) {
//		// TODO Auto-generated constructor stub
//		this.weatherData = weatherData;
//		weatherData.registerObservers(this);
//	}
	
	public CurrentConditionsDisplay(Observable observable) {//���캯������
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}
	
	/**
	 * ��ʾ
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
	
	/**
	 * ��������
	 */
//	@Override
//	public void update(float temperature, float humidity, float pressure) {
//		// TODO Auto-generated method stub
//		this.temperature = temperature;
//		this.humidity = humidity;
//		display();
//	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
}

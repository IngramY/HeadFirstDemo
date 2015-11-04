package com.ycw.demo2.bean;

import java.util.Observable;

/**
* @ClassName: WeatherData
* @Description: TODO(数据--可观察者) 实现指定接口
* @author ycw
* @date 2015年10月27日 上午11:43:12
* 
*/
/*public class WeatherData implements Subject {
	private ArrayList observers;//记录观察者
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList();
	}
	
	public void registerObservers(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	public void removeObservers(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		// TODO 所有的观察者更新数据
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}*/


/**
* @ClassName: WeatherData
* @Description: TODO(JAVA 内置 可观察者)
* @author ycw
* @date 2015年10月27日 上午11:55:05
* 
*/
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
	}
	
	public void measurementsChanged(){
		setChanged();//指示状态改变
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}

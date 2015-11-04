package com.ycw.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.ycw.demo2.bean.WeatherData;
import com.ycw.demo2.impl.DisplayElement;

/**
 * @ClassName: StatisticsDisplay
 * @Description: TODO Avg/Max/Min temperature
 * @author ycw
 * @date 2015年10月27日 下午3:24:36
 * 
 */
public class StatisticsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	// private Subject weatherData;
	Observable observable;// 可观察者

	List<Float> list = new ArrayList();

	public StatisticsDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);// 自己传入
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();

			list.add(temperature);

			display();
		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("Avg/Max/Min temperature = " + Avg() + "/" + Max() + "/" + Min());
	}

	public float Avg() {
		float sum = 0;
		for (Float float1 : list) {
			sum += float1;
		}
		return (float) sum / (list.size());
	}

	public float Max() {
		float max = 0;
		if (list != null) {
			max = list.get(0);
			for (Float float1 : list) {
				if (float1 > max) {
					max = float1;
				}
			}
		}
		return max;
	}

	public float Min() {
		float min = 0;
		if (list != null) {
			min = list.get(0);
			for (Float float1 : list) {
				if (float1 < min) {
					min = float1;
				}
			}
		}
		return min;
	}

}

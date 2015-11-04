package com.ycw.demo2;

import com.ycw.demo2.bean.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData(); // 主题 提供给 所有 观察者 数据
//		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);// 初始化观察者  
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);// 初始化观察者  
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}

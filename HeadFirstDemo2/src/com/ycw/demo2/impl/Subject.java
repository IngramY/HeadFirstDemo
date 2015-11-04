package com.ycw.demo2.impl;

public interface Subject {
	public void registerObservers(Observer o);
	public void removeObservers(Observer o);
	public void notifyObservers();
}

package com.designPattern;

public class EagarInItializationSingleton {

	private static EagarInItializationSingleton instance = new EagarInItializationSingleton();
	private EagarInItializationSingleton() {}
	public static EagarInItializationSingleton getInstance() {
		return instance;
	}
}

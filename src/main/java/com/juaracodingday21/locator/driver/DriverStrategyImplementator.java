package com.juaracodingday21.locator.driver;

public class DriverStrategyImplementator {
public static DriverStrategy chooseStrategy(String strategy) {
		
		switch(strategy) {
		case "chrome":
			return (DriverStrategy) new Chrome();
			default:
				return null;
		}
	}

}

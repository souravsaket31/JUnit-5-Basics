package com.learning.may;

import java.text.DecimalFormat;

public class MathUtils {

	public int add(int a, int b) {
		return a + b;
	}

	public double computeCircleArea(int radius) {
		double result = Math.PI * radius * radius;
		DecimalFormat df = new DecimalFormat("#.##");
		String formatedResult = df.format(result);
		return Double.valueOf(formatedResult);

	}
	
	public float divide(int a, int b)
	{
		
		return a/b;
	}
}

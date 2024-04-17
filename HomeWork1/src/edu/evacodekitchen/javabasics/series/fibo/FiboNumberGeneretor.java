package edu.evacodekitchen.javabasics.series.fibo;

import edu.evacodekitchen.javabasics.series.SerieGenerator;

public class FiboNumberGeneretor extends SerieGenerator{

	public FiboNumberGeneretor(int n) {
		super(n);
	}

	protected float calculateElementAt(int index) {
		if (index == 0) 
			return 1f;
		if (index == 1) 
			return 1f;
		return (elements[index-2]+elements[index-1]);
	}
	
}

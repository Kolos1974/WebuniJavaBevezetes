package edu.evacodekitchen.javabasics.series.harmonic;

import edu.evacodekitchen.javabasics.series.SerieGenerator;

public class HarmonicSerieGenerator extends SerieGenerator{

	public HarmonicSerieGenerator(int n) {
		super(n);
	}

	protected float calculateElementAt(int index) {
		// return (float)1/(index+1);
		return 1f/(index+1);
	}
}

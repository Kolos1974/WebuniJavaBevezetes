package edu.evacodekitchen.javabasics.series;

public abstract class SerieGenerator{
	
	private int n;
	protected float[] elements;

	public SerieGenerator(int n) {
		this.n = n;
		elements = new float[n];
	}
		
	public float[] calculateElements() {
		for (int i = 0; i < n; i++) {
			elements[i] = calculateElementAt(i);
		}
		return elements;
	}

	protected abstract float calculateElementAt(int index);
	
}

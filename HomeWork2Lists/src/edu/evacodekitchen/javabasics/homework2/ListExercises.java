package edu.evacodekitchen.javabasics.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.print.attribute.standard.NumberUpSupported;

public class ListExercises {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7, 1, 8, 3, -4, 9);
		System.out.println("min: " + findMin(numbers));
		System.out.println("max: " + findMax(numbers));
		System.out.println("odd numbers: " + findOddNumbers(numbers));
		System.out.println("sum of elements: " + sumOfElements(numbers));
	}

	public static int findMin(List<Integer> numbers) {
		Integer min = numbers.get(0);
		for (Integer number : numbers) {
			if (min > number)  {
				min = number;
			}
		}
		return min;
	}

	public static int findMax(List<Integer> numbers) {
		Integer max = numbers.get(0);
		for (Integer number : numbers) {
			if (max < number)  {
				max = number;
			}
		}
		return max;
	}

	public static List<Integer> findOddNumbers(List<Integer> numbers) {
		// List<Integer> result = new List<Integer>();  // Ezt nem tudja inicializálni!
		List<Integer> result = new ArrayList<>();

		for (int i=0; i < numbers.size() ; i++)
		{
			if ((numbers.get(i) % 2) == 1) {
				result.add(numbers.get(i));
			}
		}
		
		return result;
	}

	public static Integer sumOfElements(List<Integer> numbers) {
		int result = 0;
		for (Integer number : numbers) {
			result += number;
		}
		return result;
	}

}

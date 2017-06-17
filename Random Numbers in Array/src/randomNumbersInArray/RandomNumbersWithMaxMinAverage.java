package randomNumbersInArray;
public class RandomNumbersWithMaxMinAverage {
	public RandomNumbersWithMaxMinAverage(int n)
	{
		number = n;
	}
	public void sum(){
		sum = sum + number; 
	}
	public void average(){
		average = sum /100;
	}
	public void max(){
		if (number > max){
			max = number;
		}
	}
	public void min(){
		if (number < min){
			min = number;
		}
	}
	public int number;
	public int sum;
	public double average;
	public int max;
	public int min;
}


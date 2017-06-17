package randomNumbersInArray;
public class RandomNumbers {
	public static void main(String[] Args) {
		int randomNumbers[] = new int[100];
		double sum = 0;
		int max = 0;
		int min = 1000;
		for (int z = 0;z<100;z++){
			randomNumbers[z] = (int )(Math.random() * 1000 + 0);
			sum = sum + randomNumbers[z];
		}
		for (int x = 0; x<100; x++){
			if (randomNumbers[x] > max){
				max = randomNumbers[x];
			}
		}
		for (int g = 0;g<100;g++){
			if (randomNumbers[g] < min){
				min = randomNumbers[g];
			}	
		}
		System.out.println("The average of the numbers is " + sum/100 + ".");
		System.out.println("The maximum number is " + max + ".");
		System.out.println("The minimum number is " + min + ".");
	}
}

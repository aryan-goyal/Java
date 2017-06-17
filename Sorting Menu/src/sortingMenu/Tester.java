package sortingMenu;
import java.util.*;
public class Tester {
	public static void main(String args[])
	{
		int data[] = new int[10000];
		int x = 0;
		while(x<10000)
		{
			data[x] = (int) (Math.random() *10000);
			x++;
		}
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Select a type of sorting method:");
		System.out.println("1. bubble sort \n2. insertion sort \n3. selection sort \n4. merge sort \n5. quick sort");
		double startTime =0;
		double endTime = 0; 
		double totalTime = 0;
		int number = 0;
		switch(kbReader.nextInt())
		{
			case 1: //bubble sort
				startTime = System.currentTimeMillis();
				BubbleSort.bubbleSort(data);
				endTime = System.currentTimeMillis();
				number = BubbleSort.numOfIter;
				break;
			case 2://insertion sort
				startTime = System.currentTimeMillis();
				InsertionSort.insertionSort(data);
				endTime = System.currentTimeMillis();
				number = InsertionSort.numOfIter;
				break;
			case 3: //selection sort
				startTime = System.currentTimeMillis();
				SelectionSort.selectionSort(data);
				endTime = System.currentTimeMillis();
				number = SelectionSort.numOfIter;
				break;
			case 4: //merge sort
				startTime = System.currentTimeMillis();
				MergeSort.mergeSort(data, 0, 9999);
				endTime = System.currentTimeMillis();
				number = MergeSort.numOfIter;
				break;
			case 5: //quick sort
				startTime = System.currentTimeMillis();
				QuickSort.quickSort(data, 0, 9999);
				endTime = System.currentTimeMillis();
				number = QuickSort.numOfIter;
				break;
		}
		kbReader.close();
		System.out.println("\nData:");
		int b =0;
		while(b<data.length)
		{
			System.out.println(data[b]);
			b++;
		}
		totalTime = (endTime - startTime);
		System.out.println("\nTime Taken: " + totalTime + " ms");
		System.out.println("Number of Iterations: " + number);
	}
}
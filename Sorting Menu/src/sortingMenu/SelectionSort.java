package sortingMenu;
public class SelectionSort {
	public static int numOfIter;
	public static void selectionSort(int a[])
	{
		int min, minIndex;
		for(int i =0; i<a.length;++i)
		{
			min = a[i];
			minIndex = i;
			for(int j =i+1; j<a.length;++j)
			{
				if(a[j] < min) //salient feature
				{
					min = a[j];
					minIndex = j;
				}
			}
			a[minIndex] = a[i]; //swap
			a[i] =min;
			numOfIter++;
		}
	}
}

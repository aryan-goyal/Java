package sortingMenu;
public class MergeSort{
	public static int numOfIter;
	public static void mergeSort(int a[], int left, int right)
	{
		if(right == left) return;
		int middle = (left + right)/2; //salient feature
		mergeSort(a, left, middle); //salient feature #1 (recursion)
		mergeSort( a, middle +1, right); //salient feature #2
		merge(a, left, middle, right); //salient feature #3
		numOfIter++;
	}
	public static void merge(int a[], int left, int middle, int right)
	{
		//this temporary array will be used to build the merged list
		int tmpArray[] = new int[right-left+1];
		//This creation of a temporary array is a BIG feature of the merge sort

		int index1 = left;
		int index2 = middle +1;
		int indx = 0;
	
		//Loop until one of the sublists is finished, adding the smaller of the first elements of each sublist to the merged list
		while(index1 <= middle && index2 <=right)
		{
			if(a[index1] < a[index2])
			{
				tmpArray[indx] = a[index1];
				index1++;
			}
			else
			{
				tmpArray[indx] = a[index2];
				index2++;
			}
			indx++;
		}
		//Add to the merged list the remaining elements of whichever sublist is not yet finished
		while(index1 <= middle)
		{
			tmpArray[indx] = a[index1];
			index1++;
			indx++;
		}
		while(index2 <= right)
		{
			tmpArray[indx] = a[index2];
			index2++;
			indx++;
		}
		//copy the merged list from the tmpArray array into the a array
		for(indx = 0;indx < tmpArray.length;indx++)
		{
			a[left + indx] = tmpArray[indx];
		}
	}
}

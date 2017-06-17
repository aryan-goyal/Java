package sortingMenu;
public class InsertionSort {
	public static int numOfIter;
	public static void insertionSort(int a[])
	{
		int itemToInsert, j;
		boolean keepGoing;
		//On kth pass, insert item k into its correct position among the first k items in the array
		for(int k =1; k<a.length;k++)
		{
			//Go backwards through the list, looking for the slot to insert a[k]
			itemToInsert = a[k];
			j = k-1;
			keepGoing = true;
			while((j >= 0) && keepGoing)
			{
				if(itemToInsert < a[j])
				{
					a[j+1] = a[j]; //Salient feature
					j--;
					if(j==-1) //special case for inserting an item at [0]
						a[0] = itemToInsert;
				}
				else //Upon leaving loop, j + 1 is the index where itemToInsert belongs
				{
					keepGoing = false;
					a[j+1] = itemToInsert;
				}
			}
			numOfIter++;
		}
	}
}

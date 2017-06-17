package sortingMenu;
public class BubbleSort {
	public static int numOfIter;
	public static void bubbleSort(int a[])
	{
		numOfIter = 0;
		boolean loopSomeMore;
		do
		{
			loopSomeMore = false;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					//swap a[j] and a[j+1]
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					loopSomeMore = true;
				}
			numOfIter++;
			}
		}
		while(loopSomeMore);
	}
}

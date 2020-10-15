class MergeSort{
	int[] array;
	int[] temp_Array;
	int length;

	public static void main(String args[])
	{
		int[] arrayToSort = {9,0,1,6,4,3,2,8};

		MergeSort arr = new MergeSort();
		arr.sort(arrayToSort);
		System.out.print(" The Sorted Array is : ");
		for(int i:arrayToSort){
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.print("\n The Length of Array is : " + arrayToSort.length);
		System.out.print("\n");
	}

	public void sort(int[] arrayToSort)
	{
		this.array = arrayToSort;
		this.length = arrayToSort.length;
		this.temp_Array = new int [length];
		Merge_Sort(0, length-1);
		
	}

	public void Merge_Sort(int low, int high)
	{
		if(low<high)
		{
			int mid = low + (high-low)/2;
			Merge_Sort(low, mid);
			Merge_Sort(mid+1, high);
			Merge(low, mid, high);
		}
	}
	public void Merge(int low, int mid, int high)
	{
		for(int i=low; i<=high; i++){
			temp_Array[i] = array[i];
		}
		int i = low;
		int j = mid + 1;
		int k= low;
		while(i<= mid && j<=high)
		{
			if(temp_Array[i] <= temp_Array[j])
			{
				array[k] = temp_Array[i];
				i++;
			}
			else
			{
				array[k] = temp_Array[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			array[k] = temp_Array[i];
			i++;
			k++;
		}
	}
}

   
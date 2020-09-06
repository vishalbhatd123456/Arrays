package PWC_Practices;

public class RemoveDuplicatesInPlace {
	
	public static void removeDuplicates(int [] nums)
	{
		if(nums.length == 0)
		{
			return;
		}
		
		int i = 0;
		
		for(int j = 1;j<nums.length;j++)
		{
			if(nums[j]!=nums[i])
			{
				i++;
				nums[i] = nums[j];
			}
		}
		
		for(int p = 0;p<nums.length;p++)
		{
			System.out.print(nums[p]+" ");
		}
	}
	
	public static void removeDuplicatesBruteForce(int[] nums,int n)
	{
		if(n == 0|| n == 1)
		{
			return;
		}
		
		int[] temp = new int[n];
		int j = 0;
		for(int i = 0;i<n-1;i++)
		{
			if(nums[i]!=nums[i+1])
			{
				temp[j++] = nums[i];
			}
		}
		//store the last index
		temp[j++] = nums[n-1];
		
		for(int i = 0;i<j;i++)
		{
			nums[i] = temp[i];
		}
		for(int i = 0;i<n;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
	
	public static int  removeDupConstantExtraSpace(int[] arr,int n)
	{
		if( n == 0|| n== 1)
		{
			return n;
		}
		int j = 0;
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		//store th last index
		arr[j++] = arr[n-1];
		return j;
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,1,1,1,1,2,2,2,3,3};
		//removeDuplicates(array);
		//removeDuplicatesBruteForce(array, array.length);
		int n = removeDupConstantExtraSpace(array, array.length);
		for(int i = 0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}

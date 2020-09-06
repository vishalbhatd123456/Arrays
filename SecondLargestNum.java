package PWC_Practices;

public class SecondLargest {
	public static int findSecondLargest(int [] nums)
	{
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		if(nums.length<2)
		{
			System.out.println("there should be atleast two elements");
			return 0;
		}
		
		for(int i = 0;i<nums.length;i++)
		{
			if(nums[i] > firstLargest)
			{
				secondLargest = firstLargest;
				firstLargest = nums[i];
			}
			
			else if(nums[i] > secondLargest && nums[i]!=firstLargest)
			{
				secondLargest = nums[i];
			}
		}
		return secondLargest;
	}
	public static void main(String[] args) {
		int[] array = {5,5,5,6};
		System.out.println(findSecondLargest(array));
	}
}

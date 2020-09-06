package PWC_Practices;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSums {
	public static int[] twoNumberSumBruteForce(int [] array, int targetSum)
	{
		for(int i = 0;i<array.length;i++)
		{
			int firstNum = array[i];
			for(int j = i+1;j<array.length;j++)
			{
				int secondNum = array[j];
				if(firstNum + secondNum == targetSum)
				{
					return new int[] {firstNum, secondNum};
				}
			}
		}
		return new int[0];
	}
	
	public static int[] twoNumberSumPointerApproach(int [] nums,int targetSum)
	{
		int left = 0;
		int right = nums.length-1;
		Arrays.sort(nums);
		while(left < right)
		{
			int currSum = nums[left]+nums[right];
			if(currSum == targetSum)
			{
				return new int[]{nums[left],nums[right]};
			}
			else if (currSum > targetSum)
			{
				right--;
			}
			else if(currSum < targetSum)
			{
				left++;
			}
		}
		return new int[0];	
	}
	
	public static int[] twoNumberSumHashing(int[] nums,int targetSum)
	{
		HashSet<Integer> hs = new HashSet<>();
		for(int num:nums)
		{
			int currSum = targetSum-num;
			if(hs.contains(currSum))
			{
				return new int[]{currSum,num};
			}
			else
			{
				hs.add(num);
			}
		}
		return new int[0];
	}
	
}

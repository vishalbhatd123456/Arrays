package PWC_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDUplicates {
	
	public static List<Integer> printDuplicatesBruteForce(int [] array)
	{
		//1 1 1 2 2 2
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0;i<array.length;i++){
			int j = 0;
			for(j = 0;j<i;j++)
			{
				if(array[i] == array[j])
				{
					al.add(array[i]);
				}
			}
		}
		return al;
	}
	
	public static List<Integer> printDuplicatedSortingApproach(int [] nums)
	{
		ArrayList<Integer> al = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 0;i<nums.length-1;i++)
		{
			if(nums[i] == nums[i+1])
			{
				al.add(nums[i]);
			}
		}
		return al;
	}
	
	public static List<Integer> printDuplicatesbruteForce2(int []nums)
	{
		List<Integer> al = new ArrayList<>();
		for(int i = 0;i<nums.length;i++)
		{
			for(int j = i+1;j<nums.length;j++)
			{
				if(nums[i] == nums[j])
				{
					al.add(nums[i]);
					break;
				}
			}
		}
		return al;
	}
	
	public static List<Integer> printDuplicatesHashingMethod(int[] array)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		Set<Integer> seen = new HashSet<>();
		for(int num: array)
		{
			if(seen.contains(num))
			{
				ans.add(num);
			}
			else
			{
				seen.add(num);
			}
		}
		return ans;
	}
	
	public static List<Integer> printDupliactesSortApp2(int [] array)
	{
		List<Integer> al = new ArrayList<>();
		Arrays.sort(array);
		for(int i = 1;i<array.length;i++)
		{
			if(array[i] == array[i-1])
			{
				al.add(array[i]);
			}
		}
		return al;
	}
	
	public static List<Integer> printDuplicatesDP(int[] nums)
	{
		 List<Integer> list = new ArrayList<>();
		 int n = nums.length;
		 int[] myArr = new int[n+1];
		 
		 for(int i = 0;i<n;i++)
		 {
			 myArr[nums[i]]++;
		 }
		 
		 for(int i = 0;i<n+1;i++)
		 {
			 if(myArr[i]>1)
			 {
				 list.add(i);
			 }
		 }
		 return list;
	}
	public static void main(String[] args) {
		int[] array1 = {1,1,1,1,2,2,2,2,3,3,4,4};
		System.out.println(printDuplicatesBruteForce(array1));
		int[] array2 = {1,1,1,1,1,2,3,4,5,6};
		System.out.println(printDuplicatedSortingApproach(array2));
		int[] array3 = {1,1,3,3,4,4,2,2};
		System.out.println(printDuplicatesbruteForce2(array3));
	}

}

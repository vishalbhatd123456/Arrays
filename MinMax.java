package PWC_Practices;

public class Min_Max {
	
	public static void min_max(int[] array)
	{
		int min = array[0];
		int max = array[0];
		
		
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
			
			if(array[i] < min)
			{
				min = array[i];
			}
		}
		
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,9,0,-1};
		min_max(arr);
	}

}

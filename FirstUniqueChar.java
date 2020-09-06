package PWC_Practices;

import java.util.HashMap;

public class FirstUniqueCharacter {
	
	public static int firstUniqueCharacter(String str){
		if(str.length() == 0)
		{
			return 0;
		}
		
		int[] counter = new int[26];
		
		//traverse the whole array, inc the count of each character
		for(int i = 0;i<str.length();i++)
		{
			counter[str.charAt(i)-'a']++;
		}
		
		for(int i = 0;i<str.length();i++)
		{
			if(counter[str.charAt(i)-'a'] == 1)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int firstUniqueCharString(String str)
	{
		HashMap<Character, Integer> count = new HashMap<>();
		int n = str.length();
		
		for(int i = 0;i<n;i++)
		{
			char ch = str.charAt(i);
			count.put(ch,count.getOrDefault(ch,0)+1);
		}
		
		for(int i = 0;i<n;i++)
		{
			if(count.get(str.charAt(i)) == 1)
			{
				return i;
			}
		}
		return -1;
	}

}

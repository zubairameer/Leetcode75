package LeetCode75.src;

public class MergeAlternateStrings {
    public static void main(String [] args)
	{
		MergeAlternateStrings solution = new MergeAlternateStrings();
		
		solution.mergeAlternately("abcd", "pqrs");
	}
	
	
	public String mergeAlternately(String word1, String word2) 
	 {
		StringBuilder combinedWord = new StringBuilder(); //Allows for chars to append
		
		int k = 0;
		while (k < word1.length() || k < word2.length()) //loop both words while there is chars
		{
			if(k < word1.length()) //checks chars 
			{
				combinedWord.append(word1.charAt(k));
			}
			if(k < word2.length())
			{
				combinedWord.append(word2.charAt(k));
			}
			
			k++;
		}
	    	
	    	
		System.out.println(combinedWord);
		return combinedWord.toString();
		 
	 }
}

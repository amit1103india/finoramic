import java.io.*;
import java.util.*;

public class TestAnagrams{
	public static void main(String[] args) {
		try{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input : ");
			String str = input.readLine();

			List<String> words = Arrays.asList(str.split(" "));
			AnagramSolution solution = new AnagramSolution();
			
			ArrayList<ArrayList<Integer>> output = solution.anagrams(words);
			System.out.println(output);
		}catch(IOException ex){
			ex.printStackTrace();
		}

	}
} 

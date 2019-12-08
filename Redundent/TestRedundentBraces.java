import java.io.*;
import java.util.*;

public class TestRedundentBraces{
	public static void main(String[] args) {
		try{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input : ");
			String str = input.readLine();
			RedundantBraces solution = new RedundantBraces();		
			System.out.println(solution.braces(str));
		}catch(IOException ex){
			ex.printStackTrace();
		}

	}
} 

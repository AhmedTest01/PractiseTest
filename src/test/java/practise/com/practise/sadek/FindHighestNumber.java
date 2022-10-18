package practise.com.practise.sadek;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FindHighestNumber {

	public static void main(String[] args) throws IOException {
	
		int [] userInput = new int[3];
		
		
		
	int i = 0;
	while(i<3) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
	
		userInput [i] = Integer.parseInt(br.readLine());
		
		i++;
		
	}
		
	int highestNumber = 0; 
	
	for(Integer e : userInput){
		if(highestNumber< e) {
			highestNumber = e;
		}
	}
	
	System.out.println(highestNumber);
	
	
		
		

	}

}

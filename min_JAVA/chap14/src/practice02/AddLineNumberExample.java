package practice02;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{	
		String filePath = "src/practice02/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr); 
		
		int num = 0;
		while(true) {
			num ++;
			String dataLine = br.readLine();
			if(dataLine == null) break;		
			System.out.println(num + " : " + dataLine);
		}
		
		br.close();
	}
}

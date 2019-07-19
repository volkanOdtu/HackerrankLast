
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
//import java.util.stream.Collectors.joining;
//import java.util.stream.Collectors.toList;


class Result{
	/* 
	 * Complete the reformatDate function below
	 * 
	 * The function is expected to return a STRING ARRAY
	 * The function accepts STRING_ARRAY dates as parameter
	 */
	
	public static List<String> reformatDate(List<String> dates)
	{
		//write your code here
		return null;
	}
}

public class Question3 {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int datesCount =Integer.parseInt(bufferedReader.readLine().trim());
		List<String> dates = null;
		/*
		List<String> dates = IntStream.range(0,datesCount).mapToObj(i ->{
			try {
				return bufferedReader.readLine();
			}
			catch(IOException ex)
			{throw new RuntimeException(ex);}
		}).collect( toList()  );*/
		
		List<String> result = Result.reformatDate(dates);
		//bufferedWriter.write(result.stream().collect(joining("\n")) + "\n" );
		
		bufferedReader.close();
		bufferedWriter.close();
	}

}

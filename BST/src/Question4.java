import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

class Result2
{
	public static int minPower(List<Integer> p) throws IOException
	{
		//Write your code here
		
		
		return 0;
	}
	
}
public class Question4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int pCount =Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> p = null;
		/*
		List<Integer> p = IntStream.range(0, pCount).mapToObj(i->{
		
		try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			}
		catch(IOException ex)
			{throw new RuntimeException(ex);
			}
			}
		).map(String::trim)
				.map(Integer::parseInt)
				.collect(toList()); */
				
		int result = Result2.minPower(p);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}

}

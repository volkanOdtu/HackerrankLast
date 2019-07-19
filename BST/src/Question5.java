import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

class Result5
{
	public static List<String> prefixToPosfix(List<String> prefixes)
	{
		//Write your code here
		
		return null;
	}
}
public class Question5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int prefixesCount =Integer.parseInt(bufferedReader.readLine().trim());
		
		/*
		List<String> prefixes  = IntStream.range(0, prefixesCount).mapToObj(i->{
		
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
				
		List<String> prefixes =null;
		List<String> result = Result5.prefixToPosfix(prefixes);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

class Result8
{
	public static int lastStoneWeight(List<Integer> a)
	{
		//Write your code here
	}
}
public class Question8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int aCount =Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> a = null;
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
				
		bufferedReader.close();
		bufferedWriter.close();
	}

}

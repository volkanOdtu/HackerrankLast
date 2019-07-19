
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exam2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		/*Scanner in = new Scanner(System.in);  
		 Integer firstArrCount = Integer.valueOf(in.nextLine());  
		 
		 int[] firstArr = new int[firstArrCount];
		 
		 for (int i = 0; i < firstArrCount; i++) 
		 {
			 firstArr[i] = Integer.valueOf(in.nextLine());  
	     }
		
		 Integer secondArrCount = Integer.valueOf(in.nextLine());  
		 int[] secondArr = new int[secondArrCount];
		 
		 for (int i = 0; i < secondArrCount; i++) 
		 {
			 secondArr[i] = Integer.valueOf(in.nextLine());  
	     }
		 */
		 int[] firstArr = { 1 ,2,3 };
		 int[] secondArr = { 2 ,3 };
		 
		 
		 int res = find(firstArr , secondArr );
		 
		 System.out.println(res);
	}
	
	public static int LookAndSay( int number )
	{
		int countSameDigits = 0;
		String numberStr = String.valueOf(number );
		String resultStr;
		
		String firstLetter = numberStr.substring(0 ,1 );
		
		
		
		String numberStrCurrentLetter = numberStr.substring(1);
		
		while(numberStr.length() > 0  )
		{
			String currentLetter = numberStr.substring(0 ,1 );
			
			if( firstLetter == numberStrCurrentLetter )
			{
				countSameDigits++;
				resultStr = String.valueOf(countSameDigits) + currentLetter; 
				continue;
			}
			if()
			
				
			numberStr = numberStr.substring(1);
		}
		
	
	}
	
	public static String findSameOnesAndReturn(String numberStr)
	{
		int countSameDigits = 0;
		
		String resultStr ="";
		
		String firstLetter = numberStr.substring(0 ,1 );
		
	
		while(numberStr.length() > 0  )
		{
			String currentLetter = numberStr.substring(0 ,1 );
			
			if( firstLetter == currentLetter )
			{
				countSameDigits++;
				numberStr = numberStr.substring(1);
				continue;
			}
			else
			{
				resultStr = resultStr + String.valueOf(countSameDigits) + currentLetter; 
				firstLetter = currentLetter;
				continue;
			}
			
			
		}
	}
	
	

}

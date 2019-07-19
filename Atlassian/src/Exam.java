
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exam {

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
	public static int find( int[] firstArr ,int[] secondArr)
	{
		boolean exists =false ;
		int temp ;
		
			for( int j = 0; j < firstArr.length ;j++ )
			{
				//result = i;
				temp =j;
				for( int i = 0; i < secondArr.length ;i++ )
				{
					if(temp >= firstArr.length) return -1 ; 
					if( firstArr[temp] == secondArr[i])
					{ 
						exists =true;
					}
					else
					{
						exists =false;
						break;
					}
					temp++;
				}
				
				if( exists)
					return j;
			}
		
		return -1;
		
	}
	

}

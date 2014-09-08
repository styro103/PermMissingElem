/*
 * Shaun Mbateng
 * Permutation Missing Element
 * Given and Array With Distinct Values Who's Elements are in the Range 1 to N+1
 * 		This Program Finds Which Value in the Range is Missing From the Array
 * This Programs has an O(n) Time Complexity
 */
import java.util.Scanner;

public class PermMissingElem 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		int [] A; //Array of Values
		int miss; //Missing Number in Range
		int len; //Length of Array
		
		//Enter and Set Array Length
		System.out.print("Enter the Length of the Array: ");
		len = cin.nextInt();
		A = new int [len];
		
		//Fill Array
		for (int i=0; i<A.length; i++)
		{
			System.out.print("Enter Element "+(i+1)+": ");
			A[i] = cin.nextInt();
		}
		
		cin.close(); //Close cin, No Longer Needed
		
		miss = missingElem(A); //Call Function to Find Missig Element
		
		//Display Missing Element
		System.out.println("");
		System.out.println("The missing element from range 1 to "+len+" is "+miss+".");
	}
	
	static int missingElem(int[] A) //Function to Find Missing Element
    {
        long sum = 0; //Will Hold Sum of All Numbers from 1 to N+1
        long arraysum = 0; //Will Hold Sum of All Numbers in Array
        long missing = 0; //Will Hold Missing Value
        
        for (int i=0; i<A.length; i++) //Get Sum of All Numbers from 1 to N+1, and Array
        {
            sum += (i+1);
            arraysum += A[i];
        }
        
        sum += A.length+1; //Add Last Number in Range (N+1)
        
        missing = sum - arraysum; //Subtract Sum of Array from Sum of Range to get Missing Value
        
        return (int) missing; //Return Missing Value
    }
}

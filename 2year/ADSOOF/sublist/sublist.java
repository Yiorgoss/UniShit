import java.util.*;
import java.lang.Math;

class sublist {
	public static void main( String[] arg){

		int[] arr = new int[] { 10, -20, 11, -4, 13, 3, -5, -17, 2, 15, 1, -7, 8};
		//23 ( 11, -4, 13, 3)
		System.out.println( highestVal(arr));
	}
	public static int highestVal( int[] arr){
		int current = arr[0];
		int highest = arr[0];

		for( int i=1; i<arr.length; i++){
			if( current+arr[i] > arr[i] ){ 	// is our current value greater than our current value + next
				current = current+arr[i];	// ammend
			} else {
				current = arr[i];			// else look at the next value; reset current count
			}
			if( current > highest ) {		// is our current value greater than the max vlaue
				highest = current;			// ammend
			}
			System.out.println( "\t"+current +"|||"+ highest);
		}
		return highest;
	}
}
package session4;

public class PrintReverseArray {

	public static int[] reverse(int[] integers) {
		
		int countOfInputArr = integers.length;
		int j = countOfInputArr;
		int reverseInts[] = new int[countOfInputArr];
		
		for(int i = 0; i < countOfInputArr; i++) {
			reverseInts[--j] = integers[i];
		}
		
		return reverseInts;	
	}
	

	public static void main(String[] args) {

		int[] intArray = {1,2,3,4,5};
		int[] reverseIntArray = reverse(intArray);
		
		for(int i = 0; i < reverseIntArray.length; i++)
			System.out.print(reverseIntArray[i] + " ");

	}

	
	/* Input: 1 2 3 4 5
	 * Output: 5 4 3 2 1 
	 */
	
	
}

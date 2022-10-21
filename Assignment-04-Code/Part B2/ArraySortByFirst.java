package assignment04PartB2;
/**
 *
 * Part B.2
 *
 * Please do not change any code in the main method 
 *
 */
public class ArraySortByFirst {

	public static void sortByFirst(int data[][]) {

		for (int i=0; i<data.length-1; i++) {
			int x = getIndexOfSmalleset(data,i,data.length);
			swap(data,i,x);
		}
	}


//Finds the index of the smallest value in a portion of an array

private static int getIndexOfSmalleset(int[][] a, int first, int last) {
	int small = first;
	for (int i = first; i < last; i++) {
		if(a [i][0] <a[small][0])
			small = i;
	}
	return small;
}


//Swaps the rows a[i] and a[j]

private static void swap(int [][]a, int i, int j) {
	for(int x = 0; x < a[0].length; x++) {
		int temp = a[i][x];
		a[i][x] =a[j][x];
		a[j][x] = temp;
	}
}





//displays two dimesional array

	public static void display(int data[][]) {
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[i].length;j++) {
				System.out.print(data[i][j]+ " ");
			}
			System.out.println();
		}

	} 

	//
	// Please do not change any code in the main method
	//
	public static void main(String args[])
	{
		int array[][] = {{1, 2, 3, 4, 5}, 
				 {3, 4, 5, 1, 2}, 
				 {5, 2, 3, 4, 1}, 
				 {2, 3, 1, 4, 5}, 
				 {4, 2, 3, 1, 5}};

		System.out.println("The array is initially " );
		display(array);
		System.out.println();

		sortByFirst(array);
		System.out.println("The array after sorting is " );
		display(array);
		System.out.println();
	}
}
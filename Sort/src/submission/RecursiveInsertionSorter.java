package submission;

public class RecursiveInsertionSorter {
	//I looked up help for how to implement this
	//http://courses.cs.washington.edu/courses/cse373/01wi/slides/Measurement/sld010.htm
	
	public static int[] sort(int[] unsorted) {
		
		for(int i =1; i< unsorted.length; i++){
			int next = unsorted[i];
			int j = i;
			
			while (j > 0 && unsorted[j-1] > next){
				unsorted[j] = unsorted[j-1];
				j--;
			}
			unsorted[j] = next;
		}
		
	return unsorted;
		}
	
}



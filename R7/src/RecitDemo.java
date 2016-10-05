import java.util.Arrays;

public class RecitDemo {
	
	public static void main(String[] args){
		
		int[] intArray = {4, 7, 2, 1, -6, 0, 20, -13};
		
		System.out.println(Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		System.out.println("");
		
		String[] strArray = {"Eneida", "Elmer", "Marcela", "Vina", 
				"Alton", "Kasey", "Felipa", "Renee", "Genna", "Susanna"};
		
		System.out.println(Arrays.toString(strArray));		
		Arrays.sort(strArray);		
		System.out.println(Arrays.toString(strArray));
		System.out.println("");
		
		
		// create and sort a student array
		Student[] studentArray = new Student[8];
		studentArray[0] = new Student("Descartes", 2.0, "G");
		studentArray[1] = new Student("Fermat", 3.0, "U");
		studentArray[2] = new Student("Euler", 2.72, "U");
		studentArray[3] = new Student("Archimedes", 3.14, "G");
		studentArray[4] = new Student("Eratosthenes", 3.0, "G");
		studentArray[5] = new Student("Ramanujan", 4.0, "G");
		studentArray[6] = new Student("Cantor", 4, "U");
		studentArray[7] = new Student("Cantor", 4, "U");
		
		//print unsorted array
		for(int m = 0; m < studentArray.length; m++){
			System.out.println(studentArray[m]);
		}
		
		System.out.println();

		Arrays.sort(studentArray);
		//print sorted array
		for(int m = 0; m < studentArray.length; m++){
			System.out.println(studentArray[m]);
		}
	}
}

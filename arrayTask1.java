public class arrayTask1 {
	
	public static void main(String[] args) {
		double[] array = {1.5, 3.5, 4, 0.72};		
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			System.out.println(sum);
		}
	}
}



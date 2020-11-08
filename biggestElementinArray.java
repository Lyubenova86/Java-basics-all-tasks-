public class biggestElementinArray {
	static int array[] = { 1, 14, 45, 78, 8749 };
	static int largest() {
		int i;
		int max = array[0];
		for (i = 1; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		return max; }
	public static void main(String[] args) {
		System.out.println("The largest number in given array is " + largest()); }
}

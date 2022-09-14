
public class Demo6 {
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		System.out.println(array[1][0]);
		int[][] array1 = new int[4][3];
		for (int y = 0; y < array.length; y++) {
			for (int x = 0; x < array[y].length; x++) {
				System.out.print(array[y][x] + "\t");
			}
			System.out.println();
		}
	}
}

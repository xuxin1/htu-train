
public class Demo4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		*           1  1    2x行数-1
//		***         2  3
//		*****       3  5
//		*******     4  7
//		*********   5  9
//		*********** 6  11

		for (int m = 1; m <= 6; m++) {
			for (int n = 1; n <= 2 * m - 1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}

//	 ooooo*       1   5    总行数-当前行数
//	 oooo***      2   4
//	 ooo*****     3   3
//	 oo*******    4   2
//	 o*********   5   1
//	 ***********  6   0
		for (int x = 1; x <= 6; x++) {
			for (int z = 1; z <= 6 - x; z++) {
				System.out.print(" ");
			}
			for (int y = 1; y <= 2 * x - 1; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

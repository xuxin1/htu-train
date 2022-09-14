
public class Demo2 {
	public static void main(String[] args) {
		System.out.println("i的循环");
		int i = 5;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		System.out.println("j的循环");
		int j = 5;
		do {
			System.out.println(j);
			j++;
		} while (j < 5);

		System.out.println("m的循环");
		for (int m = 1; m < 5; m++) {
			System.out.println(m);
		}

		int x = 0;
		int y = 10;
		while (x < y) {
			System.out.println("x:" + x + ",y:" + y);
			x++;
			y--;
		}

		for (int a = 0, b = 10; a < b; a++, b--) {
			System.out.println("a:" + a + ",b:" + b);
		}
	}
}

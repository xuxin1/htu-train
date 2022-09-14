
public class Demo3 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			i++;
			if (i == 2) {
				break;// 终止当前的所有循环
				// continue;// 终止当前的本次循环
			}
			System.out.println(i);
		}
	}
}

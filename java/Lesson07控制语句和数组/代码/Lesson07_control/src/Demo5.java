
public class Demo5 {
	public static void main(String[] args) {
		// 5个人的考试成绩用变量记录下来
		int a1 = 91;
		int a2 = 92;
		int a3 = 93;
		int a4 = 94;
		int a5 = 95;
		int a6;
		int[] array = new int[5];// 声明空数组
		System.out.println(array[0]);
		array[0] = 81;
		array[1] = 82;
		array[2] = 83;
		array[3] = 84;
		array[4] = 85;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		int[] array1 = { 71, 72, 73, 74, 75 };// 声明数组并初始化赋值
		// array1.length是获取数组的长度
		System.out.println("array1的长度:" + array1.length);
		// for循环遍历数组
		for (int index = 0; index < array1.length; index++) {
			System.out.println(array1[index]);
		}
		// 增强循环(forEach)遍历数组
		for (int element : array) {
			System.out.println(element);
		}
		// 数组求和
		int sum = 0;
		for (int element : array1) {
			sum += element;
		}
		System.out.println(sum);
		// 1.数组是一组相同数据类型的数据
		// 2.数组被声明之后的长度是固定的,无法被更改
		// 3.数组的索引是从0开始
		// 4.数组直接打印标识符就是显示其内存地址
		System.out.println(array);
		// 数组下标越界异常
//		System.out.println(array[-1]);
		float arrayf[] = new float[3];
		System.out.println(arrayf[0]);
		char[] arrayc = new char[3];
		System.out.println(arrayc[0]);
		boolean[] arrayb = new boolean[3];
		System.out.println(arrayb[0]);
		float arrf[] = null;// 数组声明但未初始化
		System.out.println(arrf[0]);
	}
}

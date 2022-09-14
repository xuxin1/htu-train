
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("第一行");
		System.out.println("第二行");
		System.out.println("第三行");
		// 如果到下午15:00,就集体核酸
		int time = 14;
		if (time >= 15) {
			System.out.println("集体核酸");
		} else {// (time < 15)
			System.out.println("时间未到");
		}

		// 判断分数等级,
		// 60以下为E级,
		// 60-69位D级,
		// 70-79为C级,
		// 80-89为B级,
		// 90-100为A级

		int score = 88;
		// 100>=score>=90
		if (score <= 100 && score >= 90) {
			System.out.println("A级");
		} else if (score <= 89 && score >= 80) {
			System.out.println("B级");
		} else if (score <= 79 && score >= 70) {
			System.out.println("C级");
		} else if (score <= 69 && score >= 60) {
			System.out.println("D级");
		} else {
			System.out.println("E级");
		}
		
		int day = 2;
		switch (day) {
/*当day等于1=>*/case 1:
			System.out.println("周一");
			break;
		case 2:
			System.out.println("周二");
			break;
		case 3:
			System.out.println("周三");
			break;
		case 4:
			System.out.println("周四");
			break;
		case 5:
			System.out.println("周五");
			break;
		case 6:
			System.out.println("周六");
			break;
		case 7:
			System.out.println("周日");
			break;
		default:
			System.out.println("选择结束");
			break;
		}
	}
}

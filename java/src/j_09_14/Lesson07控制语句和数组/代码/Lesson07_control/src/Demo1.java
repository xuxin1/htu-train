
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("��һ��");
		System.out.println("�ڶ���");
		System.out.println("������");
		// ���������15:00,�ͼ������
		int time = 14;
		if (time >= 15) {
			System.out.println("�������");
		} else {// (time < 15)
			System.out.println("ʱ��δ��");
		}

		// �жϷ����ȼ�,
		// 60����ΪE��,
		// 60-69λD��,
		// 70-79ΪC��,
		// 80-89ΪB��,
		// 90-100ΪA��

		int score = 88;
		// 100>=score>=90
		if (score <= 100 && score >= 90) {
			System.out.println("A��");
		} else if (score <= 89 && score >= 80) {
			System.out.println("B��");
		} else if (score <= 79 && score >= 70) {
			System.out.println("C��");
		} else if (score <= 69 && score >= 60) {
			System.out.println("D��");
		} else {
			System.out.println("E��");
		}
		
		int day = 2;
		switch (day) {
/*��day����1=>*/case 1:
			System.out.println("��һ");
			break;
		case 2:
			System.out.println("�ܶ�");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("����");
			break;
		case 5:
			System.out.println("����");
			break;
		case 6:
			System.out.println("����");
			break;
		case 7:
			System.out.println("����");
			break;
		default:
			System.out.println("ѡ�����");
			break;
		}
	}
}

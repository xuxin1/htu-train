
public class Demo5 {
	public static void main(String[] args) {
		// 5���˵Ŀ��Գɼ��ñ�����¼����
		int a1 = 91;
		int a2 = 92;
		int a3 = 93;
		int a4 = 94;
		int a5 = 95;
		int a6;
		int[] array = new int[5];// ����������
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
		int[] array1 = { 71, 72, 73, 74, 75 };// �������鲢��ʼ����ֵ
		// array1.length�ǻ�ȡ����ĳ���
		System.out.println("array1�ĳ���:" + array1.length);
		// forѭ����������
		for (int index = 0; index < array1.length; index++) {
			System.out.println(array1[index]);
		}
		// ��ǿѭ��(forEach)��������
		for (int element : array) {
			System.out.println(element);
		}
		// �������
		int sum = 0;
		for (int element : array1) {
			sum += element;
		}
		System.out.println(sum);
		// 1.������һ����ͬ�������͵�����
		// 2.���鱻����֮��ĳ����ǹ̶���,�޷�������
		// 3.����������Ǵ�0��ʼ
		// 4.����ֱ�Ӵ�ӡ��ʶ��������ʾ���ڴ��ַ
		System.out.println(array);
		// �����±�Խ���쳣
//		System.out.println(array[-1]);
		float arrayf[] = new float[3];
		System.out.println(arrayf[0]);
		char[] arrayc = new char[3];
		System.out.println(arrayc[0]);
		boolean[] arrayb = new boolean[3];
		System.out.println(arrayb[0]);
		float arrf[] = null;// ����������δ��ʼ��
		System.out.println(arrf[0]);
	}
}

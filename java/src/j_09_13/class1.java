package j_09_13;

import java.util.Scanner;

public class class1 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in);

//        输入第一个数
        System.out.println("请输入第一个数字：");
        if (scan.hasNextInt()) {
            a = scan.nextInt();
        } else {
            System.out.println("输入有误！");
            System.exit(0);

        }

//        输入第二个数
        System.out.println("请输入第二个数字：");
        if (scan.hasNextInt()) {
            b = scan.nextInt();
        } else {
            System.out.println("输入有误！");
            System.exit(0);
        }

        System.out.println("第一题\t:" + a + "==" + b + " ? " + (a == b));

        System.out.println("第二题\t:the max number:" + (a > b ? a : b));

    }
}

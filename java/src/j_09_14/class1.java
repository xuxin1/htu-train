package j_09_14;

import java.util.Scanner;

class People {
    int marry;
    int age;
    String gender;

    public void judge() {
        System.out.println("请输入是否结婚（1，0）：");
        Scanner scan = new Scanner(System.in);
        this.marry = scan.nextInt();
        System.out.println("请输入年龄：");
        this.age = scan.nextInt();
        System.out.println("请输入性别（男/女）：");
        this.gender = scan.nextLine();
        this.gender = scan.nextLine();
        if (this.marry == 1) {
            System.out.println("已婚 可以买！");
        } else {
            if (this.gender.equals("男")) {
                if (this.age >= 25) {
                    System.out.println("未婚男，年龄>=25,可以买！");
                } else {
                    System.out.println("未婚男， 年龄 < 25 ，不可以买！");
                }
            } else {
                if (this.age >= 22) {
                    System.out.println("未婚女，年龄 >= 22,可以买！");
                } else {
                    System.out.println("未婚女，年龄 < 22 ，不可以买！");
                }
            }
        }

    }
}

class Student {
    int grade = 99;
    char level;

    public void judge() {
        if (this.grade >= 81) {
            System.out.println("A 类学生！");
            this.level = 'A';
        } else if (this.grade >= 60) {
            System.out.println("B 类学生！");
            this.level = 'B';
        } else {
            System.out.println("C 类学生！");
            this.level = 'C';
        }
        System.out.printf("您是 %s 类学生！", this.level);
    }
}

class timu {
    //    99 乘法表
    public void chengfakoujuebiao() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "= " + (i * j) + " ");
            }
            System.out.println();
        }
    }

    // 等腰三角形
    public void dengyaosanjianxing() {
        for (int line = 1; line < 10; line++) {
            for (int space = 10 - line; space >= 0; space--) {
                System.out.print(" ");
            }
            for (int xing = 0; xing < 2 * line - 1; xing++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //  下等腰三角形
    public void daosanjiao() {
        for (int line = 10; line > 0; line--) {
            for (int space = 10 - line; space >= 0; space--) {
                System.out.print(" ");
            }
            for (int xing = 0; xing < 2 * line - 1; xing++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    7
    public void jisuanti() {
        Scanner scan = new Scanner(System.in);
        int base = 0;   // a
        int number = 0; // n
        System.out.println("请输入 bash （a）:");
        if (scan.hasNextInt()) {
            base = scan.nextInt();
        } else {
            System.out.println("输入有误，请重新输入！");
            System.exit(0);
        }

        System.out.println("请输入 次数 （n）:");
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        } else {
            System.out.println("输入有误，请重新输入！");
            System.exit(0);
        }
        int prebase = 0;
        int tmp_sum = 0;
        for (int i = 1; i <= number; i++) {
            prebase = prebase * 10 + base;
            tmp_sum = tmp_sum + prebase;
            System.out.print("" + prebase);
            if (i != number) {
                System.out.printf(" + ");
            }
        }
        System.out.print("= " + tmp_sum + "\n");

    }

    //    8 杨辉数组
    public void yanghui() {
        int[][] list = new int[11][11];
        list[0][1] = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("第 %d 行 ：", i);
            for (int j = 1; j <= i; j++) {
                list[i][j] = list[i - 1][j - 1] + list[i - 1][j];
                System.out.print(list[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

public class class1 {

    public static void main(String[] args) {

//        09_14 上 作业1
//        System.out.println("第一题：");
//        People person  = new People();
////        person.judge();
//
//        System.out.println("第二题");
//        Student stu1 = new Student();
////        stu1.judge();

//        09_14 上午作业 2
//        timu t = new timu();
//        t.chengfakoujuebiao();
//
//        t.daosanjiao();
//        t.dengyaosanjianxing();
//
//        t.dengyaosanjianxing();
//        t.daosanjiao();

//        09_14 下午

//        char a = 'a';
//
//        System.out.println(Character.isLetter(a));
//
//        int[][] array = new int[3][4];
//        array[0][1] = 2;
//        array[2][3] = 5;
//        array[2][1] = 3;
//        array[1][1] = -1;
//        for (int[] i : array){
//            for (int j : i){
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }

//    }
        timu t = new timu();
//        7. 计算器数组
        t.jisuanti();
//        8. 杨辉三角
        t.yanghui();
    }
}
